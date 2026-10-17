package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerParams;", "", "url", "", "userAgent", "title", "bizScenario", "requestId", "forceHttps", "", "h5ErrorPageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getUserAgent", "getTitle", "getBizScenario", "getRequestId", "getForceHttps", "()Z", "getH5ErrorPageUrl", "toExtras", "Landroid/os/Bundle;", "pageId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMWebContainerParams {

    @NotNull
    private final String bizScenario;
    private final boolean forceHttps;

    @NotNull
    private final String h5ErrorPageUrl;

    @NotNull
    private final String requestId;
    private final String title;

    @NotNull
    private final String url;
    private final String userAgent;

    @NotNull
    public static final String EXTRA_TITLE = "apmpm.title";

    @NotNull
    public static final String EXTRA_URL = "apmpm.url";

    @NotNull
    public static final String EXTRA_ERROR_PAGE_URL = "apmpm.h5ErrorPageUrl";

    @NotNull
    public static final String EXTRA_FORCE_HTTPS = "apmpm.forceHttps";

    @NotNull
    public static final String EXTRA_PAGE_ID = "apmpm.pageId";

    @NotNull
    public static final String DEFAULT_BIZ_SCENARIO = "ACCode";

    @NotNull
    public static final String DEFAULT_H5_ERROR_PAGE_URL = "https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html";

    @NotNull
    public static final String EXTRA_USER_AGENT = "apmpm.userAgent";

    @NotNull
    public static final String EXTRA_BIZ_SCENARIO = "apmpm.bizScenario";

    @NotNull
    public static final String EXTRA_REQUEST_ID = "apmpm.requestId";

    public APMPMWebContainerParams(@NotNull String url2, String str, String str2, @NotNull String bizScenario, @NotNull String requestId, boolean z, @NotNull String h5ErrorPageUrl) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(bizScenario, "bizScenario");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(h5ErrorPageUrl, "h5ErrorPageUrl");
        this.url = url2;
        this.userAgent = str;
        this.title = str2;
        this.bizScenario = bizScenario;
        this.requestId = requestId;
        this.forceHttps = z;
        this.h5ErrorPageUrl = h5ErrorPageUrl;
    }

    public static /* synthetic */ APMPMWebContainerParams copy$default(APMPMWebContainerParams aPMPMWebContainerParams, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMWebContainerParams.url;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMWebContainerParams.userAgent;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMWebContainerParams.title;
        }
        if ((i & 8) != 0) {
            str4 = aPMPMWebContainerParams.bizScenario;
        }
        if ((i & 16) != 0) {
            str5 = aPMPMWebContainerParams.requestId;
        }
        if ((i & 32) != 0) {
            z = aPMPMWebContainerParams.forceHttps;
        }
        if ((i & 64) != 0) {
            str6 = aPMPMWebContainerParams.h5ErrorPageUrl;
        }
        boolean z3 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return aPMPMWebContainerParams.copy(str, str2, str9, str4, str8, z3, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBizScenario() {
        return this.bizScenario;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getForceHttps() {
        return this.forceHttps;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getH5ErrorPageUrl() {
        return this.h5ErrorPageUrl;
    }

    @NotNull
    public final APMPMWebContainerParams copy(@NotNull String url2, String userAgent, String title, @NotNull String bizScenario, @NotNull String requestId, boolean forceHttps, @NotNull String h5ErrorPageUrl) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(bizScenario, "bizScenario");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(h5ErrorPageUrl, "h5ErrorPageUrl");
        return new APMPMWebContainerParams(url2, userAgent, title, bizScenario, requestId, forceHttps, h5ErrorPageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMWebContainerParams)) {
            return false;
        }
        APMPMWebContainerParams aPMPMWebContainerParams = (APMPMWebContainerParams) other;
        return Intrinsics.f(this.url, aPMPMWebContainerParams.url) && Intrinsics.f(this.userAgent, aPMPMWebContainerParams.userAgent) && Intrinsics.f(this.title, aPMPMWebContainerParams.title) && Intrinsics.f(this.bizScenario, aPMPMWebContainerParams.bizScenario) && Intrinsics.f(this.requestId, aPMPMWebContainerParams.requestId) && this.forceHttps == aPMPMWebContainerParams.forceHttps && Intrinsics.f(this.h5ErrorPageUrl, aPMPMWebContainerParams.h5ErrorPageUrl);
    }

    @NotNull
    public final String getBizScenario() {
        return this.bizScenario;
    }

    public final boolean getForceHttps() {
        return this.forceHttps;
    }

    @NotNull
    public final String getH5ErrorPageUrl() {
        return this.h5ErrorPageUrl;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.userAgent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return this.h5ErrorPageUrl.hashCode() + j6.a.c(p.a.c(p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.bizScenario), 31, this.requestId), 31, this.forceHttps);
    }

    @NotNull
    public final Bundle toExtras(@NotNull String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Bundle bundle = new Bundle();
        bundle.putString("apmpm.url", this.url);
        bundle.putString("apmpm.userAgent", this.userAgent);
        bundle.putString("apmpm.title", this.title);
        bundle.putString("apmpm.bizScenario", this.bizScenario);
        bundle.putString("apmpm.requestId", this.requestId);
        bundle.putBoolean("apmpm.forceHttps", this.forceHttps);
        bundle.putString("apmpm.h5ErrorPageUrl", this.h5ErrorPageUrl);
        bundle.putString("apmpm.pageId", pageId);
        return bundle;
    }

    public /* synthetic */ APMPMWebContainerParams(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "ACCode" : str4, (i & 16) != 0 ? String.valueOf(System.currentTimeMillis()) : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html" : str6);
    }
}
