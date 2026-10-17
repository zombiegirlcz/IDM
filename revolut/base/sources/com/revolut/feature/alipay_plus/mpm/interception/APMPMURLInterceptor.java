package com.revolut.feature.alipay_plus.mpm.interception;

import ch.qos.logback.core.util.a;
import com.revolut.feature.alipay_plus.mpm.interception.APMPMURLHook;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeRequest;
import com.revolut.feature.alipay_plus.mpm.support.APMPMUrl;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002J\f\u0010\u0014\u001a\u00020\b*\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLInterceptor;", "", "hookUrlConfigs", "", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMHookUrlConfig;", "<init>", "(Ljava/util/List;)V", "inspect", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "url", "", "forceHttps", "", "decodeHook", "config", "preCreateOrderHook", "decodeMetadata", "", "source", "loadingUrl", "redirect", "matches", "shouldOpenExternally", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMURLInterceptor {

    @NotNull
    private final List<APMPMHookUrlConfig> hookUrlConfigs;

    @NotNull
    public static final String AC_ERROR_PAGE_URL = "https://render.alipay.com/p/yuyan/180020010001253580/exception_system_error.html";

    @NotNull
    public static final String PREFIX_INTERCEPT_AND_GET_CODE_URL = "https://render.alipay.com/p/w/ac-fe-adaptor";

    @NotNull
    public static final String BIZ_CODE = "MPPAlipayPlusNONSDK";

    @NotNull
    public static final String BIZ_SCENARIO_AC_CODE = "ACCode";

    @NotNull
    public static final String DEFAULT_HOOK_URL_CONFIG = "[{\"hookType\":\"DECODE_URL\",\"mappingParams\":\"{\\\"codeParamKey\\\":\\\"ACCodeValue\\\",\\\"loadingUrl\\\":\\\"loadingUrl\\\"}\",\"matchRule\":\"https://render.alipay.com/p/w/ac-fe-adaptor/\",\"matchType\":\"CONTAIN\"},{\"hookType\":\"AUTH_URL\",\"mappingParams\":\"{ \\\"acquireId\\\": \\\"1022088000000000001\\\" }\",\"matchRule\":\"http://openauth.alipay.com/\",\"matchType\":\"CONTAIN\"},{\"hookType\":\"AUTH_URL\",\"mappingParams\":\"{ \\\"acquireId\\\": \\\"1022088000000000001\\\" }\",\"matchRule\":\"https://openauth.alipay.com/\",\"matchType\":\"CONTAIN\"},{\"hookType\":\"DOWNGRADE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\":\\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\"}\",\"matchRule\":\"^https://render.alipay.com/p/s/i.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"PRE_CREATE_ORDER_DECODE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\":\\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\",\\\"queryParamKey\\\":\\\"scheme\\\",\\\"codeParamKey\\\":\\\"qrcode\\\",\\\"codeParamRule\\\":\\\"^https:\\\\\\\\/\\\\\\\\/qr.alipay.com\\\\\\\\/ba.*\\\"}\",\"matchRule\":\"^https://ds.alipay.com.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"DOWNGRADE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\": \\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\" }\",\"matchRule\":\"^https://d.alipay.com.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"DOWNGRADE_URL\",\"mappingParams\":\"{ \\\"redirectUrl\\\": \\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\" }\",\"matchRule\":\"^https://ulink.alipay.com.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"PRE_CREATE_ORDER_DECODE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\":\\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\",\\\"queryParamKey\\\":\\\"scheme\\\",\\\"codeParamKey\\\":\\\"qrcode\\\",\\\"codeParamRule\\\":\\\"^https:\\\\\\\\/\\\\\\\\/qr.alipay.com\\\\\\\\/ba.*\\\"}\",\"matchRule\":\"^https://render.alipay.com/p/s/i.*scheme=.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"DECODE_URL\",\"mappingParams\":\"{\\\"codeParamKey\\\":\\\"qrcode\\\"}\",\"matchRule\":\"alipays://platformapi\",\"matchType\":\"CONTAIN\"}]";

    /* JADX WARN: Multi-variable type inference failed */
    public APMPMURLInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final APMPMURLHook decodeHook(String url2, APMPMHookUrlConfig config) {
        APMPMUrl aPMPMUrl;
        String strQueryParameter;
        APMPMHookUrlMappingParams mappingParams = config.getMappingParams();
        String codeParamKey = mappingParams.getCodeParamKey();
        if (codeParamKey != null && (strQueryParameter = (aPMPMUrl = APMPMUrl.INSTANCE).queryParameter(url2, codeParamKey)) != null) {
            String loadingUrl = mappingParams.getLoadingUrl();
            String strQueryParameter2 = loadingUrl != null ? aPMPMUrl.queryParameter(url2, loadingUrl) : null;
            return new APMPMURLHook.Decode(new APMPMDecodeRequest(strQueryParameter, null, 2, null), strQueryParameter2, decodeMetadata("urlHook", strQueryParameter2));
        }
        return APMPMURLHook.None.INSTANCE;
    }

    private final Map<String, String> decodeMetadata(String source, String loadingUrl) {
        LinkedHashMap linkedHashMapN = r0.n(new Pair("source", source));
        if (loadingUrl != null && !d0.W(loadingUrl)) {
            linkedHashMapN.put("hasLoadingUrl", "true");
        }
        return linkedHashMapN;
    }

    public static /* synthetic */ Map decodeMetadata$default(APMPMURLInterceptor aPMPMURLInterceptor, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return aPMPMURLInterceptor.decodeMetadata(str, str2);
    }

    public static /* synthetic */ APMPMURLHook inspect$default(APMPMURLInterceptor aPMPMURLInterceptor, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aPMPMURLInterceptor.inspect(str, z);
    }

    private final boolean matches(APMPMHookUrlConfig config, String url2) {
        String matchType = config.getMatchType();
        if (Intrinsics.f(matchType, "CONTAIN")) {
            return d0.J(url2, config.getMatchRule(), false);
        }
        if (Intrinsics.f(matchType, "REGEX")) {
            return new Regex(config.getMatchRule()).f(url2);
        }
        return false;
    }

    private final APMPMURLHook preCreateOrderHook(String url2, APMPMHookUrlConfig config) {
        APMPMUrl aPMPMUrl;
        String strQueryParameter;
        String codeParamKey;
        String strQueryParameter2;
        APMPMHookUrlMappingParams mappingParams = config.getMappingParams();
        String queryParamKey = mappingParams.getQueryParamKey();
        if (queryParamKey != null && (strQueryParameter = (aPMPMUrl = APMPMUrl.INSTANCE).queryParameter(url2, queryParamKey)) != null && (codeParamKey = mappingParams.getCodeParamKey()) != null && (strQueryParameter2 = aPMPMUrl.queryParameter(strQueryParameter, codeParamKey)) != null) {
            String codeParamRule = mappingParams.getCodeParamRule();
            return (codeParamRule == null || d0.W(codeParamRule) || a.x(codeParamRule, strQueryParameter2)) ? new APMPMURLHook.Decode(new APMPMDecodeRequest(strQueryParameter2, null, 2, null), null, decodeMetadata$default(this, "orderCode", null, 2, null), 2, null) : redirect(config);
        }
        return redirect(config);
    }

    private final APMPMURLHook redirect(APMPMHookUrlConfig aPMPMHookUrlConfig) {
        String redirectUrl = aPMPMHookUrlConfig.getMappingParams().getRedirectUrl();
        return redirectUrl != null ? new APMPMURLHook.Load(redirectUrl) : APMPMURLHook.None.INSTANCE;
    }

    private final boolean shouldOpenExternally(String url2) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = Boolean.valueOf(a0.z(new URI(url2).getScheme(), "alipays", true));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object obj2 = Boolean.FALSE;
        if (objA instanceof n) {
            objA = obj2;
        }
        return ((Boolean) objA).booleanValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final APMPMURLHook inspect(@NotNull String url2, boolean forceHttps) {
        String strForceHttps;
        Intrinsics.checkNotNullParameter(url2, "url");
        if (d0.W(url2)) {
            return APMPMURLHook.None.INSTANCE;
        }
        if (forceHttps && (strForceHttps = APMPMUrl.INSTANCE.forceHttps(url2)) != null) {
            return new APMPMURLHook.Load(strForceHttps);
        }
        for (APMPMHookUrlConfig aPMPMHookUrlConfig : this.hookUrlConfigs) {
            if (matches(aPMPMHookUrlConfig, url2)) {
                String hookType = aPMPMHookUrlConfig.getHookType();
                switch (hookType.hashCode()) {
                    case -2078787016:
                        if (hookType.equals("AUTH_URL")) {
                            return new APMPMURLHook.OAuth(url2);
                        }
                        break;
                    case -722380930:
                        if (hookType.equals("DECODE_URL")) {
                            return decodeHook(url2, aPMPMHookUrlConfig);
                        }
                        break;
                    case -47383466:
                        if (hookType.equals("PRE_CREATE_ORDER_DECODE_URL")) {
                            return preCreateOrderHook(url2, aPMPMHookUrlConfig);
                        }
                        break;
                    case 239830629:
                        if (hookType.equals("DOWNGRADE_URL")) {
                            String redirectUrl = aPMPMHookUrlConfig.getMappingParams().getRedirectUrl();
                            return redirectUrl != null ? new APMPMURLHook.Load(redirectUrl) : APMPMURLHook.None.INSTANCE;
                        }
                        break;
                }
                return APMPMURLHook.None.INSTANCE;
            }
        }
        return shouldOpenExternally(url2) ? new APMPMURLHook.OpenExternal(url2) : APMPMURLHook.None.INSTANCE;
    }

    public APMPMURLInterceptor(@NotNull List<APMPMHookUrlConfig> hookUrlConfigs) {
        Intrinsics.checkNotNullParameter(hookUrlConfigs, "hookUrlConfigs");
        this.hookUrlConfigs = hookUrlConfigs;
    }

    public /* synthetic */ APMPMURLInterceptor(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? APMPMHookUrlConfig.INSTANCE.parse("[{\"hookType\":\"DECODE_URL\",\"mappingParams\":\"{\\\"codeParamKey\\\":\\\"ACCodeValue\\\",\\\"loadingUrl\\\":\\\"loadingUrl\\\"}\",\"matchRule\":\"https://render.alipay.com/p/w/ac-fe-adaptor/\",\"matchType\":\"CONTAIN\"},{\"hookType\":\"AUTH_URL\",\"mappingParams\":\"{ \\\"acquireId\\\": \\\"1022088000000000001\\\" }\",\"matchRule\":\"http://openauth.alipay.com/\",\"matchType\":\"CONTAIN\"},{\"hookType\":\"AUTH_URL\",\"mappingParams\":\"{ \\\"acquireId\\\": \\\"1022088000000000001\\\" }\",\"matchRule\":\"https://openauth.alipay.com/\",\"matchType\":\"CONTAIN\"},{\"hookType\":\"DOWNGRADE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\":\\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\"}\",\"matchRule\":\"^https://render.alipay.com/p/s/i.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"PRE_CREATE_ORDER_DECODE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\":\\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\",\\\"queryParamKey\\\":\\\"scheme\\\",\\\"codeParamKey\\\":\\\"qrcode\\\",\\\"codeParamRule\\\":\\\"^https:\\\\\\\\/\\\\\\\\/qr.alipay.com\\\\\\\\/ba.*\\\"}\",\"matchRule\":\"^https://ds.alipay.com.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"DOWNGRADE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\": \\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\" }\",\"matchRule\":\"^https://d.alipay.com.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"DOWNGRADE_URL\",\"mappingParams\":\"{ \\\"redirectUrl\\\": \\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\" }\",\"matchRule\":\"^https://ulink.alipay.com.*scheme=alipays.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"PRE_CREATE_ORDER_DECODE_URL\",\"mappingParams\":\"{\\\"redirectUrl\\\":\\\"https://render.alipay.com/p/yuyan/180020010001253580/exception_no_support.html?errorType=UNMARKED_MOVING_PINS\\\",\\\"queryParamKey\\\":\\\"scheme\\\",\\\"codeParamKey\\\":\\\"qrcode\\\",\\\"codeParamRule\\\":\\\"^https:\\\\\\\\/\\\\\\\\/qr.alipay.com\\\\\\\\/ba.*\\\"}\",\"matchRule\":\"^https://render.alipay.com/p/s/i.*scheme=.*\",\"matchType\":\"REGEX\"},{\"hookType\":\"DECODE_URL\",\"mappingParams\":\"{\\\"codeParamKey\\\":\\\"qrcode\\\"}\",\"matchRule\":\"alipays://platformapi\",\"matchType\":\"CONTAIN\"}]") : list);
    }
}
