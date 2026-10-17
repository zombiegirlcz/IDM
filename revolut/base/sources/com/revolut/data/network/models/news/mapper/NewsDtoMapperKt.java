package com.revolut.data.network.models.news.mapper;

import com.revolut.data.network.models.news.NewsItemDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import w61.a;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/data/network/models/news/NewsItemDto;", "Lw61/a;", "toDomainNewsItem", "(Lcom/revolut/data/network/models/news/NewsItemDto;)Lw61/a;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class NewsDtoMapperKt {
    @NotNull
    public static final a toDomainNewsItem(@NotNull NewsItemDto newsItemDto) {
        List listD1;
        Intrinsics.checkNotNullParameter(newsItemDto, "<this>");
        String id10 = newsItemDto.getId();
        String content = newsItemDto.getContent();
        String shareLink = newsItemDto.getShareLink();
        String actionLink = newsItemDto.getActionLink();
        String actionTitle = newsItemDto.getActionTitle();
        String title = newsItemDto.getTitle();
        String description = newsItemDto.getDescription();
        String icon = newsItemDto.getIcon();
        String animation = newsItemDto.getAnimation();
        String bgColor = newsItemDto.getBgColor();
        List<String> scopes = newsItemDto.getScopes();
        if (scopes == null || (listD1 = d0.d1(scopes)) == null) {
            listD1 = f0.f322471a;
        }
        List list = listD1;
        Long fromDate = newsItemDto.getFromDate();
        LocalDate localDateI = fromDate != null ? edl.a.I(fromDate) : null;
        Long toDate = newsItemDto.getToDate();
        return new a(id10, content, shareLink, actionLink, actionTitle, title, description, icon, animation, bgColor, list, localDateI, toDate != null ? edl.a.I(toDate) : null, newsItemDto.getAutofollow(), newsItemDto.getMinAppVersion(), newsItemDto.getMaxAppVersion(), newsItemDto.getCloseable(), newsItemDto.getIncident());
    }
}
