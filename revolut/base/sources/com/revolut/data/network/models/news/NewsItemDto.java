package com.revolut.data.network.models.news;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003Jæ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\u00132\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b/\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0016\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006L"}, d2 = {"Lcom/revolut/data/network/models/news/NewsItemDto;", "", "id", "", "content", "shareLink", "actionLink", "actionTitle", "title", "description", "icon", "animation", "bgColor", "scopes", "", "fromDate", "", "toDate", "autofollow", "", "minAppVersion", "closeable", "maxAppVersion", "incident", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getContent", "getShareLink", "getActionLink", "getActionTitle", "getTitle", "getDescription", "getIcon", "getAnimation", "getBgColor", "getScopes", "()Ljava/util/List;", "getFromDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getToDate", "getAutofollow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinAppVersion", "getCloseable", "getMaxAppVersion", "getIncident", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/revolut/data/network/models/news/NewsItemDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewsItemDto {

    @b("actionLink")
    private final String actionLink;

    @b("actionTitle")
    private final String actionTitle;

    @b("animation")
    private final String animation;

    @b("autofollow")
    private final Boolean autofollow;

    @b("bgColour")
    private final String bgColor;

    @b("closeable")
    private final Boolean closeable;

    @b("content")
    @NotNull
    private final String content;

    @b("description")
    private final String description;

    @b("fromDate")
    private final Long fromDate;

    @b("icon")
    private final String icon;

    @b("id")
    @NotNull
    private final String id;

    @b("incident")
    private final boolean incident;

    @b("maxAppVersion")
    private final String maxAppVersion;

    @b("minAppVersion")
    private final String minAppVersion;

    @b("scopes")
    private final List<String> scopes;

    @b("shareLink")
    private final String shareLink;

    @b("title")
    private final String title;

    @b("toDate")
    private final Long toDate;

    public NewsItemDto(@NotNull String id10, @NotNull String content, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, Long l2, Long l3, Boolean bool, String str9, Boolean bool2, String str10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id10;
        this.content = content;
        this.shareLink = str;
        this.actionLink = str2;
        this.actionTitle = str3;
        this.title = str4;
        this.description = str5;
        this.icon = str6;
        this.animation = str7;
        this.bgColor = str8;
        this.scopes = list;
        this.fromDate = l2;
        this.toDate = l3;
        this.autofollow = bool;
        this.minAppVersion = str9;
        this.closeable = bool2;
        this.maxAppVersion = str10;
        this.incident = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsItemDto copy$default(NewsItemDto newsItemDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, Long l2, Long l3, Boolean bool, String str11, Boolean bool2, String str12, boolean z, int i, Object obj2) {
        boolean z3;
        String str13;
        String str14 = (i & 1) != 0 ? newsItemDto.id : str;
        String str15 = (i & 2) != 0 ? newsItemDto.content : str2;
        String str16 = (i & 4) != 0 ? newsItemDto.shareLink : str3;
        String str17 = (i & 8) != 0 ? newsItemDto.actionLink : str4;
        String str18 = (i & 16) != 0 ? newsItemDto.actionTitle : str5;
        String str19 = (i & 32) != 0 ? newsItemDto.title : str6;
        String str20 = (i & 64) != 0 ? newsItemDto.description : str7;
        String str21 = (i & 128) != 0 ? newsItemDto.icon : str8;
        String str22 = (i & 256) != 0 ? newsItemDto.animation : str9;
        String str23 = (i & 512) != 0 ? newsItemDto.bgColor : str10;
        List list2 = (i & 1024) != 0 ? newsItemDto.scopes : list;
        Long l4 = (i & 2048) != 0 ? newsItemDto.fromDate : l2;
        Long l5 = (i & 4096) != 0 ? newsItemDto.toDate : l3;
        Boolean bool3 = (i & 8192) != 0 ? newsItemDto.autofollow : bool;
        String str24 = str14;
        String str25 = (i & 16384) != 0 ? newsItemDto.minAppVersion : str11;
        Boolean bool4 = (i & 32768) != 0 ? newsItemDto.closeable : bool2;
        String str26 = (i & 65536) != 0 ? newsItemDto.maxAppVersion : str12;
        if ((i & 131072) != 0) {
            str13 = str26;
            z3 = newsItemDto.incident;
        } else {
            z3 = z;
            str13 = str26;
        }
        return newsItemDto.copy(str24, str15, str16, str17, str18, str19, str20, str21, str22, str23, list2, l4, l5, bool3, str25, bool4, str13, z3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    public final List<String> component11() {
        return this.scopes;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getFromDate() {
        return this.fromDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getToDate() {
        return this.toDate;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getAutofollow() {
        return this.autofollow;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getCloseable() {
        return this.closeable;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMaxAppVersion() {
        return this.maxAppVersion;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIncident() {
        return this.incident;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShareLink() {
        return this.shareLink;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActionLink() {
        return this.actionLink;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAnimation() {
        return this.animation;
    }

    @NotNull
    public final NewsItemDto copy(@NotNull String id10, @NotNull String content, String shareLink, String actionLink, String actionTitle, String title, String description, String icon, String animation, String bgColor, List<String> scopes, Long fromDate, Long toDate, Boolean autofollow, String minAppVersion, Boolean closeable, String maxAppVersion, boolean incident) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new NewsItemDto(id10, content, shareLink, actionLink, actionTitle, title, description, icon, animation, bgColor, scopes, fromDate, toDate, autofollow, minAppVersion, closeable, maxAppVersion, incident);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsItemDto)) {
            return false;
        }
        NewsItemDto newsItemDto = (NewsItemDto) other;
        return Intrinsics.f(this.id, newsItemDto.id) && Intrinsics.f(this.content, newsItemDto.content) && Intrinsics.f(this.shareLink, newsItemDto.shareLink) && Intrinsics.f(this.actionLink, newsItemDto.actionLink) && Intrinsics.f(this.actionTitle, newsItemDto.actionTitle) && Intrinsics.f(this.title, newsItemDto.title) && Intrinsics.f(this.description, newsItemDto.description) && Intrinsics.f(this.icon, newsItemDto.icon) && Intrinsics.f(this.animation, newsItemDto.animation) && Intrinsics.f(this.bgColor, newsItemDto.bgColor) && Intrinsics.f(this.scopes, newsItemDto.scopes) && Intrinsics.f(this.fromDate, newsItemDto.fromDate) && Intrinsics.f(this.toDate, newsItemDto.toDate) && Intrinsics.f(this.autofollow, newsItemDto.autofollow) && Intrinsics.f(this.minAppVersion, newsItemDto.minAppVersion) && Intrinsics.f(this.closeable, newsItemDto.closeable) && Intrinsics.f(this.maxAppVersion, newsItemDto.maxAppVersion) && this.incident == newsItemDto.incident;
    }

    public final String getActionLink() {
        return this.actionLink;
    }

    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final Boolean getAutofollow() {
        return this.autofollow;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final Boolean getCloseable() {
        return this.closeable;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getFromDate() {
        return this.fromDate;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getIncident() {
        return this.incident;
    }

    public final String getMaxAppVersion() {
        return this.maxAppVersion;
    }

    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final List<String> getScopes() {
        return this.scopes;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getToDate() {
        return this.toDate;
    }

    public int hashCode() {
        int iC = a.c(this.id.hashCode() * 31, 31, this.content);
        String str = this.shareLink;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.icon;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.animation;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bgColor;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.scopes;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.fromDate;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.toDate;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.autofollow;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.minAppVersion;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.closeable;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.maxAppVersion;
        return Boolean.hashCode(this.incident) + ((iHashCode14 + (str10 != null ? str10.hashCode() : 0)) * 31);
    }

    public /* synthetic */ NewsItemDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, Long l2, Long l3, Boolean bool, String str11, Boolean bool2, String str12, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : l3, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : bool2, (i & 65536) != 0 ? null : str12, z);
    }
}
