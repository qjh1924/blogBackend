package cn.qiujianhui.blog.mapper;

import cn.qiujianhui.blog.entity.Article;
import cn.qiujianhui.blog.entity.Message;
import cn.qiujianhui.blog.entity.TypeInfo;
import cn.qiujianhui.blog.entity.WebsiteCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    WebsiteCount getWebsiteCounts();

    List<Article> getLatestArticles(int pageId);

    List<Article> getListByTypeId(String typeId);

    Article getArticleById(String articleId);

    List<Message> getMessagesById(String articleId);

    List<TypeInfo> getTypeInfo();

    List<Article> getArticleList();
}
