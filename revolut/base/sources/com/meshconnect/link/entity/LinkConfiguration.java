package com.meshconnect.link.entity;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JZ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/meshconnect/link/entity/LinkConfiguration;", "", "token", "", "accessTokens", "", "Lcom/meshconnect/link/entity/IntegrationAccessToken;", "disableDomainWhiteList", "", "language", "displayFiatCurrency", "theme", "Lcom/meshconnect/link/entity/LinkTheme;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/meshconnect/link/entity/LinkTheme;)V", "getToken", "()Ljava/lang/String;", "getAccessTokens", "()Ljava/util/List;", "getDisableDomainWhiteList", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguage", "getDisplayFiatCurrency", "getTheme", "()Lcom/meshconnect/link/entity/LinkTheme;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/meshconnect/link/entity/LinkTheme;)Lcom/meshconnect/link/entity/LinkConfiguration;", "equals", "other", "hashCode", "", "toString", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LinkConfiguration {
    private final List<IntegrationAccessToken> accessTokens;
    private final Boolean disableDomainWhiteList;
    private final String displayFiatCurrency;
    private final String language;
    private final LinkTheme theme;

    @NotNull
    private final String token;

    public LinkConfiguration(@NotNull String token, List<IntegrationAccessToken> list, Boolean bool, String str, String str2, LinkTheme linkTheme) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.accessTokens = list;
        this.disableDomainWhiteList = bool;
        this.language = str;
        this.displayFiatCurrency = str2;
        this.theme = linkTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkConfiguration copy$default(LinkConfiguration linkConfiguration, String str, List list, Boolean bool, String str2, String str3, LinkTheme linkTheme, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = linkConfiguration.token;
        }
        if ((i & 2) != 0) {
            list = linkConfiguration.accessTokens;
        }
        if ((i & 4) != 0) {
            bool = linkConfiguration.disableDomainWhiteList;
        }
        if ((i & 8) != 0) {
            str2 = linkConfiguration.language;
        }
        if ((i & 16) != 0) {
            str3 = linkConfiguration.displayFiatCurrency;
        }
        if ((i & 32) != 0) {
            linkTheme = linkConfiguration.theme;
        }
        String str4 = str3;
        LinkTheme linkTheme2 = linkTheme;
        return linkConfiguration.copy(str, list, bool, str2, str4, linkTheme2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final List<IntegrationAccessToken> component2() {
        return this.accessTokens;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDisableDomainWhiteList() {
        return this.disableDomainWhiteList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayFiatCurrency() {
        return this.displayFiatCurrency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LinkTheme getTheme() {
        return this.theme;
    }

    @NotNull
    public final LinkConfiguration copy(@NotNull String token, List<IntegrationAccessToken> accessTokens, Boolean disableDomainWhiteList, String language, String displayFiatCurrency, LinkTheme theme) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new LinkConfiguration(token, accessTokens, disableDomainWhiteList, language, displayFiatCurrency, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkConfiguration)) {
            return false;
        }
        LinkConfiguration linkConfiguration = (LinkConfiguration) other;
        return Intrinsics.f(this.token, linkConfiguration.token) && Intrinsics.f(this.accessTokens, linkConfiguration.accessTokens) && Intrinsics.f(this.disableDomainWhiteList, linkConfiguration.disableDomainWhiteList) && Intrinsics.f(this.language, linkConfiguration.language) && Intrinsics.f(this.displayFiatCurrency, linkConfiguration.displayFiatCurrency) && this.theme == linkConfiguration.theme;
    }

    public final List<IntegrationAccessToken> getAccessTokens() {
        return this.accessTokens;
    }

    public final Boolean getDisableDomainWhiteList() {
        return this.disableDomainWhiteList;
    }

    public final String getDisplayFiatCurrency() {
        return this.displayFiatCurrency;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final LinkTheme getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        List<IntegrationAccessToken> list = this.accessTokens;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.disableDomainWhiteList;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.language;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayFiatCurrency;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkTheme linkTheme = this.theme;
        return iHashCode5 + (linkTheme != null ? linkTheme.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LinkConfiguration(token=" + this.token + ", accessTokens=" + this.accessTokens + ", disableDomainWhiteList=" + this.disableDomainWhiteList + ", language=" + this.language + ", displayFiatCurrency=" + this.displayFiatCurrency + ", theme=" + this.theme + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ LinkConfiguration(String str, List list, Boolean bool, String str2, String str3, LinkTheme linkTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : linkTheme);
    }
}
