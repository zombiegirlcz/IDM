package com.revolut.feature.alipay_plus.mpm.core;

import a0.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cf6.a;
import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.alipay_plus.mpm.core.APMPMDecodeDecision;
import com.revolut.feature.alipay_plus.mpm.interception.APMPMURLHook;
import com.revolut.feature.alipay_plus.mpm.interception.APMPMURLInterceptor;
import com.revolut.feature.alipay_plus.mpm.model.APMPMAcceptanceMarkLogo;
import com.revolut.feature.alipay_plus.mpm.model.APMPMActionPayload;
import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMConfiguration;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeActivityAware;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeResult;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.alipay_plus.mpm.model.APMPMInquireQuoteRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMInquireQuoteResult;
import com.revolut.feature.alipay_plus.mpm.model.APMPMLaunchRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMLaunchResult;
import com.revolut.feature.alipay_plus.mpm.model.APMPMNetworkService;
import com.revolut.feature.alipay_plus.mpm.model.APMPMPaymentScenario;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyResponse;
import com.revolut.feature.alipay_plus.mpm.model.APMPMRegionAcceptanceMark;
import com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteBasicConfig;
import com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteConfiguration;
import com.revolut.feature.alipay_plus.mpm.model.APMPMService;
import com.revolut.feature.alipay_plus.mpm.support.APMPMAuthCodeJSAPIResult;
import com.revolut.feature.alipay_plus.mpm.support.APMPMDispatch;
import com.revolut.feature.alipay_plus.mpm.support.APMPMLog;
import com.revolut.feature.alipay_plus.mpm.support.APMPMLogCategory;
import com.revolut.feature.alipay_plus.mpm.support.APMPMLogHandler;
import com.revolut.feature.alipay_plus.mpm.support.APMPMLogLevel;
import com.revolut.feature.alipay_plus.mpm.support.APMPMLogMetadata;
import com.revolut.feature.alipay_plus.mpm.support.APMPMRegionResolver;
import com.revolut.feature.alipay_plus.mpm.support.APMPMTradePayResult;
import com.revolut.feature.alipay_plus.mpm.support.APMPMUrl;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMBridgeContext;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPresenter;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerListener;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerParams;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import yhm.m;
import yhm.o;
import zhm.r0;
import zhm.u;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\b\b\u0000\u0018\u0000 n2\u00020\u0001:\u0001nB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ(\u0010'\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eJ\u0015\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J)\u0010/\u001a\u00020#2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\b6J&\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020)2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u001c\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020<0\u001eJ\u001e\u0010=\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010>2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020?0\u001eJ\u0014\u0010@\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020<0\u001eJ\"\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020B2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u001eH\u0002J\"\u0010C\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010D2\u0006\u0010F\u001a\u00020G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010)J\u0012\u0010I\u001a\u00020B2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010)J\b\u0010J\u001a\u0004\u0018\u00010)J2\u0010K\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010)H\u0002JP\u0010M\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010$\u001a\u00020N2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001052\u0014\b\u0002\u0010O\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0PH\u0002J&\u0010Q\u001a\u00020#2\u0006\u0010R\u001a\u00020)2\u0006\u00102\u001a\u0002032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0018\u0010S\u001a\u00020#2\u0006\u0010T\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010U\u001a\u00020#2\u0006\u0010$\u001a\u00020VH\u0002J\u001e\u0010W\u001a\u00020#2\u0006\u0010$\u001a\u00020V2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020X0\u001eH\u0002J\u0010\u0010Y\u001a\u00020#2\u0006\u0010Z\u001a\u00020XH\u0002J\u0010\u0010[\u001a\u00020#2\u0006\u0010\\\u001a\u00020]H\u0002J&\u0010^\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u00102\u001a\u0002032\u0006\u0010\\\u001a\u00020]H\u0002J*\u0010_\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0002J&\u0010`\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010a\u001a\u00020)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020)0D2\b\u0010d\u001a\u0004\u0018\u00010)H\u0002J'\u0010e\u001a\u0004\u0018\u00010)2\u0016\u0010f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010)0g\"\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020#H\u0002J%\u0010j\u001a\u00020#\"\u0004\b\u0000\u0010k*\b\u0012\u0004\u0012\u0002Hk0\u001e2\u0006\u0010,\u001a\u0002HkH\u0002¢\u0006\u0002\u0010lJ \u0010m\u001a\u00020#\"\u0004\b\u0000\u0010k*\b\u0012\u0004\u0012\u0002Hk0\u001e2\u0006\u0010\\\u001a\u00020]H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006o"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;", "", "configuration", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;", "networkService", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMNetworkService;", "mpmService", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMService;", "context", "Landroid/content/Context;", "interceptor", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLInterceptor;", "webContainerService", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerService;", "remoteConfiguration", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfiguration;", "logger", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogHandler;", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;Lcom/revolut/feature/alipay_plus/mpm/model/APMPMNetworkService;Lcom/revolut/feature/alipay_plus/mpm/model/APMPMService;Landroid/content/Context;Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLInterceptor;Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerService;Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfiguration;Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogHandler;)V", "getConfiguration", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;", "getInterceptor$feature_alipay_plus_nonsdk_release", "()Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLInterceptor;", "getRemoteConfiguration", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfiguration;", "getLogger$feature_alipay_plus_nonsdk_release", "()Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogHandler;", "activeLaunchCallback", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMCallback;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchResult;", "remoteConfigurationFetchInFlight", "Ljava/util/concurrent/atomic/AtomicBoolean;", "launch", "", "request", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchRequest;", "callback", "handleActionPayload", "payload", "", "decodeDecision", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision;", "result", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeResult;", "decodeDecision$feature_alipay_plus_nonsdk_release", "handleNavigationHook", "hook", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "bridgeContext", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBridgeContext;", "handleNavigationHook$feature_alipay_plus_nonsdk_release", "handleTradePay", "codeValue", "tradeNo", "getAuthCodeForJSAPI", "appId", "Lorg/json/JSONObject;", "inquireQuote", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteRequest;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMInquireQuoteResult;", "updateRemoteConfiguration", "force", "", "getAcceptanceMarkLogos", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMAcceptanceMarkLogo;", "scenario", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMPaymentScenario;", "region", "isAlipayPlusSupportedRegion", "getCurrentRegion", "openWebContainer", "title", "performDecode", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeRequest;", "logMetadata", "", "performOAuthHook", "authUrl", "loadOAuthRedirectUrl", "redirectUrl", "logProxyRequest", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyRequest;", "performProxy", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyResponse;", "logProxySuccess", "response", "logProxyFailure", "error", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "failOAuthHook", "finishRoute", "openExternal", "url", "noOpLaunchCallback", "parseScopes", "value", "firstNonBlank", "values", "", "([Ljava/lang/String;)Ljava/lang/String;", "updateRemoteConfigurationIfNeeded", "dispatchSuccess", "T", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMCallback;Ljava/lang/Object;)V", "dispatchFailure", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMCoordinator {

    @NotNull
    private final AtomicReference<APMPMCallback<APMPMLaunchResult>> activeLaunchCallback;

    @NotNull
    private final APMPMConfiguration configuration;
    private final Context context;

    @NotNull
    private final APMPMURLInterceptor interceptor;
    private final APMPMLogHandler logger;
    private final APMPMService mpmService;
    private final APMPMNetworkService networkService;

    @NotNull
    private final APMPMRemoteConfiguration remoteConfiguration;

    @NotNull
    private final AtomicBoolean remoteConfigurationFetchInFlight;

    @NotNull
    private final APMPMWebContainerService webContainerService;

    @NotNull
    public static final String CN_ACQUIRE_ID = "1022088000000000001";

    @NotNull
    public static final String SCOPE_AUTH_BASE_USER_INFO = "BASE_USER_INFO";

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[APMPMPaymentScenario.values().length];
            try {
                iArr[APMPMPaymentScenario.MPM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[APMPMPaymentScenario.UPM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public APMPMCoordinator(@NotNull APMPMConfiguration configuration, APMPMNetworkService aPMPMNetworkService, APMPMService aPMPMService, Context context, @NotNull APMPMURLInterceptor interceptor, @NotNull APMPMWebContainerService webContainerService, @NotNull APMPMRemoteConfiguration remoteConfiguration, APMPMLogHandler aPMPMLogHandler) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(webContainerService, "webContainerService");
        Intrinsics.checkNotNullParameter(remoteConfiguration, "remoteConfiguration");
        this.configuration = configuration;
        this.networkService = aPMPMNetworkService;
        this.mpmService = aPMPMService;
        this.context = context;
        this.interceptor = interceptor;
        this.webContainerService = webContainerService;
        this.remoteConfiguration = remoteConfiguration;
        this.logger = aPMPMLogHandler;
        this.activeLaunchCallback = new AtomicReference<>();
        this.remoteConfigurationFetchInFlight = new AtomicBoolean(false);
        webContainerService.registerMPMPlugins(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void dispatchFailure(APMPMCallback<T> aPMPMCallback, APMPMError aPMPMError) {
        APMPMDispatch.INSTANCE.main(new a(aPMPMCallback, aPMPMError, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchFailure$lambda$0(APMPMCallback aPMPMCallback, APMPMError aPMPMError) {
        aPMPMCallback.onFailure(aPMPMError);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void dispatchSuccess(APMPMCallback<T> aPMPMCallback, T t2) {
        APMPMDispatch.INSTANCE.main(new a(aPMPMCallback, t2, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchSuccess$lambda$0(APMPMCallback aPMPMCallback, Object obj2) {
        aPMPMCallback.onSuccess(obj2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failOAuthHook(APMPMCallback<APMPMLaunchResult> callback, APMPMContainerPresenter presenter, APMPMError error) {
        AtomicReference<APMPMCallback<APMPMLaunchResult>> atomicReference = this.activeLaunchCallback;
        while (!atomicReference.compareAndSet(callback, null) && atomicReference.get() == callback) {
        }
        dispatchFailure(callback, error);
        presenter.closeWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRoute(APMPMCallback<APMPMLaunchResult> callback, APMPMContainerPresenter presenter, APMPMBridgeContext bridgeContext) {
        if (bridgeContext != null) {
            bridgeContext.sendBridgeResult(APMPMTradePayResult.INSTANCE.successJson());
        }
        AtomicReference<APMPMCallback<APMPMLaunchResult>> atomicReference = this.activeLaunchCallback;
        while (true) {
            if (atomicReference.compareAndSet(callback, null)) {
                dispatchSuccess(callback, new APMPMLaunchResult());
                break;
            } else if (atomicReference.get() != callback) {
                break;
            }
        }
        if (presenter != null) {
            presenter.closeWebView();
        }
    }

    private final String firstNonBlank(String... values) {
        String str;
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = values[i];
            if (!(str == null || d0.W(str))) {
                break;
            }
            i++;
        }
        if (str != null) {
            return d0.F0(str).toString();
        }
        return null;
    }

    public static /* synthetic */ List getAcceptanceMarkLogos$default(APMPMCoordinator aPMPMCoordinator, APMPMPaymentScenario aPMPMPaymentScenario, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return aPMPMCoordinator.getAcceptanceMarkLogos(aPMPMPaymentScenario, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleActionPayload$default(APMPMCoordinator aPMPMCoordinator, Context context, String str, APMPMCallback aPMPMCallback, int i, Object obj2) {
        if ((i & 4) != 0) {
            aPMPMCallback = null;
        }
        aPMPMCoordinator.handleActionPayload(context, str, aPMPMCallback);
    }

    public static /* synthetic */ void handleNavigationHook$feature_alipay_plus_nonsdk_release$default(APMPMCoordinator aPMPMCoordinator, APMPMURLHook aPMPMURLHook, APMPMContainerPresenter aPMPMContainerPresenter, APMPMBridgeContext aPMPMBridgeContext, int i, Object obj2) {
        if ((i & 4) != 0) {
            aPMPMBridgeContext = null;
        }
        aPMPMCoordinator.handleNavigationHook$feature_alipay_plus_nonsdk_release(aPMPMURLHook, aPMPMContainerPresenter, aPMPMBridgeContext);
    }

    public static /* synthetic */ boolean isAlipayPlusSupportedRegion$default(APMPMCoordinator aPMPMCoordinator, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = null;
        }
        return aPMPMCoordinator.isAlipayPlusSupportedRegion(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadOAuthRedirectUrl(String redirectUrl, APMPMContainerPresenter presenter) {
        String loadingUrl;
        APMPMURLHook aPMPMURLHookInspect = this.interceptor.inspect(redirectUrl, false);
        if (aPMPMURLHookInspect instanceof APMPMURLHook.None) {
            presenter.loadUrl(redirectUrl);
            return;
        }
        if ((aPMPMURLHookInspect instanceof APMPMURLHook.Decode) && (loadingUrl = ((APMPMURLHook.Decode) aPMPMURLHookInspect).getLoadingUrl()) != null) {
            presenter.loadUrl(loadingUrl);
        }
        handleNavigationHook$feature_alipay_plus_nonsdk_release(aPMPMURLHookInspect, presenter, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logProxyFailure(APMPMError error) {
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.ERROR, APMPMLogCategory.PROXY, "failure", "Proxy request failed", APMPMLogMetadata.INSTANCE.error(error));
    }

    private final void logProxyRequest(APMPMProxyRequest request) {
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.DEBUG, APMPMLogCategory.PROXY, "request", "Proxy request prepared", APMPMLogMetadata.INSTANCE.proxyRequest(request));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logProxySuccess(APMPMProxyResponse response) {
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.INFO, APMPMLogCategory.PROXY, "success", "Proxy request succeeded", APMPMLogMetadata.INSTANCE.proxyResponse(response));
    }

    private final APMPMCallback<APMPMLaunchResult> noOpLaunchCallback() {
        return new APMPMCallback<APMPMLaunchResult>() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator.noOpLaunchCallback.1
            @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
            public void onFailure(APMPMError error) {
                Intrinsics.checkNotNullParameter(error, "error");
            }

            @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
            public void onSuccess(APMPMLaunchResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
            }
        };
    }

    private final void openExternal(Context context, String url2, APMPMCallback<APMPMLaunchResult> callback) {
        Object objA;
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.INFO, APMPMLogCategory.NAVIGATION, "openExternal", "Opening external URL", APMPMLogMetadata.INSTANCE.url(url2));
        try {
            m.Companion companion = m.INSTANCE;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url2));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            AtomicReference<APMPMCallback<APMPMLaunchResult>> atomicReference = this.activeLaunchCallback;
            while (!atomicReference.compareAndSet(callback, null) && atomicReference.get() == callback) {
            }
            dispatchSuccess(callback, new APMPMLaunchResult());
            objA = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            APMPMLog aPMPMLog = APMPMLog.INSTANCE;
            APMPMLogHandler aPMPMLogHandler = this.logger;
            APMPMLogLevel aPMPMLogLevel = APMPMLogLevel.ERROR;
            APMPMLogCategory aPMPMLogCategory = APMPMLogCategory.NAVIGATION;
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            aPMPMLog.emit(aPMPMLogHandler, aPMPMLogLevel, aPMPMLogCategory, "openExternalFailure", "Open external URL failed", d.x("message", message));
            AtomicReference<APMPMCallback<APMPMLaunchResult>> atomicReference2 = this.activeLaunchCallback;
            while (!atomicReference2.compareAndSet(callback, null) && atomicReference2.get() == callback) {
            }
            String message2 = thA.getMessage();
            if (message2 == null) {
                message2 = "Open external url failed";
            }
            dispatchFailure(callback, new APMPMError("SYSTEM_ERROR", message2, null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openWebContainer(Context context, APMPMLaunchRequest request, final APMPMCallback<APMPMLaunchResult> callback, String title) {
        Object objA;
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.INFO, APMPMLogCategory.WEBVIEW, "open", "Opening WebContainer", APMPMLogMetadata.INSTANCE.url(request.getUrl()));
        String url2 = request.getUrl();
        String acDecodeConfigUserAgent = APMPMCoordinatorKt.getAcDecodeConfigUserAgent(request);
        if (acDecodeConfigUserAgent == null) {
            acDecodeConfigUserAgent = request.getUserAgent();
        }
        APMPMWebContainerParams aPMPMWebContainerParams = new APMPMWebContainerParams(url2, acDecodeConfigUserAgent, title, "ACCode", String.valueOf(System.currentTimeMillis()), APMPMCoordinatorKt.getResolvedForceHttps(request), null, 64, null);
        try {
            m.Companion companion = m.INSTANCE;
            this.webContainerService.startContainer(context, aPMPMWebContainerParams, new APMPMWebContainerListener() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator$openWebContainer$1$1
                @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerListener
                public void onContainerDestroyed(Bundle params) {
                    Intrinsics.checkNotNullParameter(params, "params");
                    APMPMLog.emit$default(APMPMLog.INSTANCE, this.$this_runCatching.getLogger(), APMPMLogLevel.WARNING, APMPMLogCategory.WEBVIEW, "sceneDestroyed", "WebContainer scene destroyed before completion", null, 32, null);
                    AtomicReference atomicReference = this.$this_runCatching.activeLaunchCallback;
                    APMPMCallback<APMPMLaunchResult> aPMPMCallback = callback;
                    while (!atomicReference.compareAndSet(aPMPMCallback, null)) {
                        if (atomicReference.get() != aPMPMCallback) {
                            return;
                        }
                    }
                    this.$this_runCatching.dispatchFailure(callback, new APMPMError("USER_CANCEL", "User cancelled the MPM flow", null, 4, null));
                }
            });
            objA = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            APMPMLog aPMPMLog = APMPMLog.INSTANCE;
            APMPMLogHandler aPMPMLogHandler = this.logger;
            APMPMLogLevel aPMPMLogLevel = APMPMLogLevel.ERROR;
            APMPMLogCategory aPMPMLogCategory = APMPMLogCategory.WEBVIEW;
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            aPMPMLog.emit(aPMPMLogHandler, aPMPMLogLevel, aPMPMLogCategory, "openFailure", "Open WebContainer failed", d.x("message", message));
            AtomicReference<APMPMCallback<APMPMLaunchResult>> atomicReference = this.activeLaunchCallback;
            while (!atomicReference.compareAndSet(callback, null) && atomicReference.get() == callback) {
            }
            String message2 = thA.getMessage();
            if (message2 == null) {
                message2 = "Open web container failed";
            }
            dispatchFailure(callback, new APMPMError("SYSTEM_ERROR", message2, null, 4, null));
        }
    }

    public static /* synthetic */ void openWebContainer$default(APMPMCoordinator aPMPMCoordinator, Context context, APMPMLaunchRequest aPMPMLaunchRequest, APMPMCallback aPMPMCallback, String str, int i, Object obj2) {
        if ((i & 8) != 0) {
            str = null;
        }
        aPMPMCoordinator.openWebContainer(context, aPMPMLaunchRequest, aPMPMCallback, str);
    }

    private final List<String> parseScopes(String value) {
        if (value == null) {
            value = "";
        }
        List listM0 = d0.m0(value, new char[]{CoreConstants.COMMA_CHAR, p.SPACE_CHAR, ';'}, 6);
        ArrayList arrayList = new ArrayList(w.t(listM0, 10));
        Iterator it8 = listM0.iterator();
        while (it8.hasNext()) {
            arrayList.add(d0.F0((String) it8.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    private final void performDecode(final Context context, APMPMDecodeRequest request, final APMPMCallback<APMPMLaunchResult> callback, final APMPMContainerPresenter presenter, final APMPMBridgeContext bridgeContext, Map<String, String> logMetadata) {
        APMPMLog aPMPMLog = APMPMLog.INSTANCE;
        APMPMLogHandler aPMPMLogHandler = this.logger;
        APMPMLogLevel aPMPMLogLevel = APMPMLogLevel.INFO;
        APMPMLogCategory aPMPMLogCategory = APMPMLogCategory.DECODE;
        APMPMLogMetadata aPMPMLogMetadata = APMPMLogMetadata.INSTANCE;
        aPMPMLog.emit(aPMPMLogHandler, aPMPMLogLevel, aPMPMLogCategory, "request", "Decode requested", aPMPMLogMetadata.decodeRequest(request, logMetadata));
        APMPMService aPMPMService = this.mpmService;
        if (aPMPMService != null) {
            APMPMDecodeActivityAware aPMPMDecodeActivityAware = aPMPMService instanceof APMPMDecodeActivityAware ? (APMPMDecodeActivityAware) aPMPMService : null;
            if (aPMPMDecodeActivityAware != null) {
                aPMPMDecodeActivityAware.setDecodeActivity(context instanceof Activity ? (Activity) context : null);
            }
            aPMPMService.decode(request, new APMPMCallback<APMPMDecodeResult>() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator.performDecode.1
                @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
                public void onFailure(APMPMError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    APMPMLog.INSTANCE.emit(APMPMCoordinator.this.getLogger(), APMPMLogLevel.ERROR, APMPMLogCategory.DECODE, "failure", "Decode failed", APMPMLogMetadata.INSTANCE.error(error));
                    APMPMBridgeContext aPMPMBridgeContext = bridgeContext;
                    if (aPMPMBridgeContext != null) {
                        aPMPMBridgeContext.sendBridgeResult(APMPMTradePayResult.INSTANCE.jsonFor$feature_alipay_plus_nonsdk_release(error));
                    }
                    AtomicReference atomicReference = APMPMCoordinator.this.activeLaunchCallback;
                    APMPMCallback<APMPMLaunchResult> aPMPMCallback = callback;
                    while (!atomicReference.compareAndSet(aPMPMCallback, null) && atomicReference.get() == aPMPMCallback) {
                    }
                    APMPMCoordinator.this.dispatchFailure(callback, error);
                    APMPMContainerPresenter aPMPMContainerPresenter = presenter;
                    if (aPMPMContainerPresenter != null) {
                        aPMPMContainerPresenter.closeWebView();
                    }
                }

                @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
                public void onSuccess(APMPMDecodeResult result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    APMPMLog aPMPMLog2 = APMPMLog.INSTANCE;
                    APMPMLogHandler logger = APMPMCoordinator.this.getLogger();
                    APMPMLogLevel aPMPMLogLevel2 = APMPMLogLevel.INFO;
                    APMPMLogCategory aPMPMLogCategory2 = APMPMLogCategory.DECODE;
                    aPMPMLog2.emit(logger, aPMPMLogLevel2, aPMPMLogCategory2, "success", "Decode succeeded", d.x("hasActionPayload", String.valueOf(result.getSdkActionPayload() != null)));
                    APMPMDecodeDecision aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release = APMPMCoordinator.this.decodeDecision$feature_alipay_plus_nonsdk_release(result);
                    if (Intrinsics.f(aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release, APMPMDecodeDecision.Complete.INSTANCE)) {
                        APMPMCoordinator.this.finishRoute(callback, presenter, bridgeContext);
                        return;
                    }
                    if (aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release instanceof APMPMDecodeDecision.Load) {
                        APMPMContainerPresenter aPMPMContainerPresenter = presenter;
                        if (aPMPMContainerPresenter != null) {
                            aPMPMContainerPresenter.loadUrl(((APMPMDecodeDecision.Load) aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release).getRedirectUrl());
                            return;
                        } else {
                            APMPMDecodeDecision.Load load = (APMPMDecodeDecision.Load) aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release;
                            APMPMCoordinator.this.openWebContainer(context, new APMPMLaunchRequest(load.getRedirectUrl(), null, null, 6, null), callback, load.getTitle());
                            return;
                        }
                    }
                    if (!(aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release instanceof APMPMDecodeDecision.Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    APMPMDecodeDecision.Fail fail = (APMPMDecodeDecision.Fail) aPMPMDecodeDecisionDecodeDecision$feature_alipay_plus_nonsdk_release;
                    aPMPMLog2.emit(APMPMCoordinator.this.getLogger(), APMPMLogLevel.ERROR, aPMPMLogCategory2, "failure", "Decode action failed", APMPMLogMetadata.INSTANCE.error(fail.getError()));
                    APMPMBridgeContext aPMPMBridgeContext = bridgeContext;
                    if (aPMPMBridgeContext != null) {
                        aPMPMBridgeContext.sendBridgeResult(APMPMTradePayResult.INSTANCE.jsonFor$feature_alipay_plus_nonsdk_release(fail.getError()));
                    }
                    AtomicReference atomicReference = APMPMCoordinator.this.activeLaunchCallback;
                    APMPMCallback<APMPMLaunchResult> aPMPMCallback = callback;
                    while (!atomicReference.compareAndSet(aPMPMCallback, null) && atomicReference.get() == aPMPMCallback) {
                    }
                    APMPMCoordinator.this.dispatchFailure(callback, fail.getError());
                    APMPMContainerPresenter aPMPMContainerPresenter2 = presenter;
                    if (aPMPMContainerPresenter2 != null) {
                        aPMPMContainerPresenter2.closeWebView();
                    }
                }
            });
            return;
        }
        APMPMError aPMPMErrorSystem$default = APMPMError.Companion.system$default(APMPMError.INSTANCE, "APMPMService is not configured", null, 2, null);
        aPMPMLog.emit(this.logger, APMPMLogLevel.ERROR, aPMPMLogCategory, "failure", "Decode failed", aPMPMLogMetadata.error(aPMPMErrorSystem$default));
        if (bridgeContext != null) {
            bridgeContext.sendBridgeResult(APMPMTradePayResult.INSTANCE.jsonFor$feature_alipay_plus_nonsdk_release(aPMPMErrorSystem$default));
        }
        AtomicReference<APMPMCallback<APMPMLaunchResult>> atomicReference = this.activeLaunchCallback;
        while (!atomicReference.compareAndSet(callback, null) && atomicReference.get() == callback) {
        }
        dispatchFailure(callback, aPMPMErrorSystem$default);
        if (presenter != null) {
            presenter.closeWebView();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performDecode$default(APMPMCoordinator aPMPMCoordinator, Context context, APMPMDecodeRequest aPMPMDecodeRequest, APMPMCallback aPMPMCallback, APMPMContainerPresenter aPMPMContainerPresenter, APMPMBridgeContext aPMPMBridgeContext, Map map, int i, Object obj2) {
        if ((i & 32) != 0) {
            map = r0.g();
        }
        aPMPMCoordinator.performDecode(context, aPMPMDecodeRequest, aPMPMCallback, aPMPMContainerPresenter, aPMPMBridgeContext, map);
    }

    private final void performOAuthHook(String authUrl, final APMPMContainerPresenter presenter, final APMPMCallback<APMPMLaunchResult> callback) {
        APMPMUrl aPMPMUrl = APMPMUrl.INSTANCE;
        List<String> scopes = parseScopes(aPMPMUrl.queryParameter(authUrl, "scopes"));
        if (scopes.isEmpty()) {
            scopes = u.c("BASE_USER_INFO");
        }
        List<String> list = scopes;
        APMPMProxyRequest.Companion companion = APMPMProxyRequest.INSTANCE;
        String strFirstNonBlank = firstNonBlank(aPMPMUrl.queryParameter(authUrl, "authClientId"), aPMPMUrl.queryParameter(authUrl, "app_id"));
        if (strFirstNonBlank == null) {
            strFirstNonBlank = "";
        }
        performProxy(companion.getAuthCode("OAUTH_URL", strFirstNonBlank, list, "1022088000000000001", authUrl), new APMPMCallback<APMPMProxyResponse>() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator.performOAuthHook.1
            @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
            public void onFailure(APMPMError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                APMPMCoordinator.this.logProxyFailure(error);
                APMPMCoordinator.this.failOAuthHook(callback, presenter, error);
            }

            @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
            public void onSuccess(APMPMProxyResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                APMPMError resultError = result.getResultError();
                if (resultError != null) {
                    APMPMCoordinator aPMPMCoordinator = APMPMCoordinator.this;
                    APMPMCallback<APMPMLaunchResult> aPMPMCallback = callback;
                    APMPMContainerPresenter aPMPMContainerPresenter = presenter;
                    aPMPMCoordinator.logProxyFailure(resultError);
                    aPMPMCoordinator.failOAuthHook(aPMPMCallback, aPMPMContainerPresenter, resultError);
                    return;
                }
                APMPMCoordinator.this.logProxySuccess(result);
                String strOptString = result.getSdkResponseData().optString("authRedirectUrl");
                if (d0.W(strOptString)) {
                    strOptString = result.getSdkResponseData().optString("authRedirectURL");
                }
                if (d0.W(strOptString)) {
                    strOptString = result.getSdkResponseData().optString("redirectUrl");
                }
                if (d0.W(strOptString)) {
                    strOptString = result.getSdkResponseData().optString("redirectURL");
                }
                Intrinsics.h(strOptString);
                if (!d0.W(strOptString)) {
                    APMPMCoordinator.this.loadOAuthRedirectUrl(strOptString, presenter);
                    return;
                }
                APMPMError aPMPMError = new APMPMError("SYSTEM_ERROR", "Auth redirect url is empty", null, 4, null);
                APMPMCoordinator.this.logProxyFailure(aPMPMError);
                APMPMCoordinator.this.failOAuthHook(callback, presenter, aPMPMError);
            }
        });
    }

    private final void performProxy(APMPMProxyRequest request, APMPMCallback<APMPMProxyResponse> callback) {
        logProxyRequest(request);
        APMPMNetworkService aPMPMNetworkService = this.networkService;
        if (aPMPMNetworkService != null) {
            aPMPMNetworkService.performProxy(request, callback);
            return;
        }
        APMPMError aPMPMErrorSystem$default = APMPMError.Companion.system$default(APMPMError.INSTANCE, "APMPMNetworkService is not configured", null, 2, null);
        logProxyFailure(aPMPMErrorSystem$default);
        dispatchFailure(callback, aPMPMErrorSystem$default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateRemoteConfiguration$default(APMPMCoordinator aPMPMCoordinator, boolean z, APMPMCallback aPMPMCallback, int i, Object obj2) {
        if ((i & 2) != 0) {
            aPMPMCallback = null;
        }
        aPMPMCoordinator.updateRemoteConfiguration(z, aPMPMCallback);
    }

    private final void updateRemoteConfigurationIfNeeded() {
        updateRemoteConfiguration$default(this, false, null, 2, null);
    }

    @NotNull
    public final APMPMDecodeDecision decodeDecision$feature_alipay_plus_nonsdk_release(@NotNull APMPMDecodeResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String sdkActionPayload = result.getSdkActionPayload();
        if (sdkActionPayload == null) {
            return APMPMDecodeDecision.Complete.INSTANCE;
        }
        if (d0.W(sdkActionPayload)) {
            return new APMPMDecodeDecision.Fail(APMPMError.INSTANCE.invalidInput("SDK action payload is invalid"));
        }
        APMPMActionPayload aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release = APMPMActionPayload.INSTANCE.fromJson$feature_alipay_plus_nonsdk_release(sdkActionPayload);
        if (aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release == null || !aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getIsOpenUrl()) {
            return new APMPMDecodeDecision.Fail(APMPMError.INSTANCE.invalidInput("SDK action payload is unsupported"));
        }
        String redirectUrl = aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getRedirectUrl();
        if (redirectUrl == null) {
            redirectUrl = "";
        }
        return new APMPMDecodeDecision.Load(redirectUrl, aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getTitle());
    }

    public final List<APMPMAcceptanceMarkLogo> getAcceptanceMarkLogos(@NotNull APMPMPaymentScenario scenario, String region) {
        Object next;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        updateRemoteConfigurationIfNeeded();
        String strFirstNonBlank = firstNonBlank(region, getCurrentRegion());
        if (strFirstNonBlank == null) {
            return null;
        }
        Iterator<T> it8 = this.remoteConfiguration.getConfig().getRegionAcceptanceMarks().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((APMPMRegionAcceptanceMark) next).getRegion(), strFirstNonBlank, true)) {
                break;
            }
        }
        APMPMRegionAcceptanceMark aPMPMRegionAcceptanceMark = (APMPMRegionAcceptanceMark) next;
        if (aPMPMRegionAcceptanceMark == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
        if (i == 1) {
            return aPMPMRegionAcceptanceMark.getMpmLogos();
        }
        if (i == 2) {
            return aPMPMRegionAcceptanceMark.getUpmLogos();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void getAuthCodeForJSAPI(@NotNull String appId, @NotNull final APMPMCallback<JSONObject> callback) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.INFO, APMPMLogCategory.JSAPI, "getAuthCode", "getAuthCode JSAPI requested", d.x("appId", APMPMLogMetadata.INSTANCE.redactedValue(appId)));
        List listC = u.c("BASE_USER_INFO");
        performProxy(APMPMProxyRequest.Companion.getAuthCode$default(APMPMProxyRequest.INSTANCE, "JS_API", j6.a.q("1022088000000000001_", appId), listC, "1022088000000000001", null, 16, null), new APMPMCallback<APMPMProxyResponse>() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator.getAuthCodeForJSAPI.1
            @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
            public void onFailure(APMPMError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                APMPMCoordinator.this.logProxyFailure(error);
                APMPMCoordinator.this.dispatchFailure(callback, error);
            }

            @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
            public void onSuccess(APMPMProxyResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                APMPMError resultError = result.getResultError();
                if (resultError != null) {
                    APMPMCoordinator aPMPMCoordinator = APMPMCoordinator.this;
                    APMPMCallback<JSONObject> aPMPMCallback = callback;
                    aPMPMCoordinator.logProxyFailure(resultError);
                    aPMPMCoordinator.dispatchFailure(aPMPMCallback, resultError);
                    return;
                }
                APMPMCoordinator.this.logProxySuccess(result);
                String strOptString = result.getSdkResponseData().optString("authCode");
                if (d0.W(strOptString)) {
                    strOptString = result.getSdkResponseData().optString("authorizationCode");
                }
                Intrinsics.h(strOptString);
                if (!d0.W(strOptString)) {
                    APMPMCoordinator.this.dispatchSuccess(callback, APMPMAuthCodeJSAPIResult.INSTANCE.success(strOptString, result.getSdkResponseData()));
                    return;
                }
                APMPMError aPMPMError = new APMPMError("SYSTEM_ERROR", "Auth code is empty", null, 4, null);
                APMPMCoordinator.this.logProxyFailure(aPMPMError);
                APMPMCoordinator.this.dispatchFailure(callback, aPMPMError);
            }
        });
    }

    @NotNull
    public final APMPMConfiguration getConfiguration() {
        return this.configuration;
    }

    public final String getCurrentRegion() {
        return APMPMRegionResolver.INSTANCE.currentRegion(this.context, this.remoteConfiguration.getConfig());
    }

    @NotNull
    /* JADX INFO: renamed from: getInterceptor$feature_alipay_plus_nonsdk_release, reason: from getter */
    public final APMPMURLInterceptor getInterceptor() {
        return this.interceptor;
    }

    /* JADX INFO: renamed from: getLogger$feature_alipay_plus_nonsdk_release, reason: from getter */
    public final APMPMLogHandler getLogger() {
        return this.logger;
    }

    @NotNull
    public final APMPMRemoteConfiguration getRemoteConfiguration() {
        return this.remoteConfiguration;
    }

    public final void handleActionPayload(@NotNull Context context, @NotNull String payload, APMPMCallback<APMPMLaunchResult> callback) {
        APMPMCallback<APMPMLaunchResult> aPMPMCallbackNoOpLaunchCallback = callback;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payload, "payload");
        APMPMActionPayload aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release = APMPMActionPayload.INSTANCE.fromJson$feature_alipay_plus_nonsdk_release(payload);
        if (aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release == null || !aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getIsOpenUrl()) {
            APMPMLog.emit$default(APMPMLog.INSTANCE, this.logger, APMPMLogLevel.DEBUG, APMPMLogCategory.LAUNCH, "actionIgnored", "Ignored action payload", null, 32, null);
            if (aPMPMCallbackNoOpLaunchCallback != null) {
                dispatchFailure(aPMPMCallbackNoOpLaunchCallback, new APMPMError("PARAM_ILLEGAL", "Unsupported action payload", null, 4, null));
                return;
            }
            return;
        }
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.INFO, APMPMLogCategory.LAUNCH, "openURLAction", "Handling OPEN_URL action", APMPMLogMetadata.INSTANCE.url(aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getRedirectUrl()));
        String redirectUrl = aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getRedirectUrl();
        if (redirectUrl == null) {
            redirectUrl = "";
        }
        APMPMLaunchRequest aPMPMLaunchRequest = new APMPMLaunchRequest(redirectUrl, null, null, 6, null);
        if (aPMPMCallbackNoOpLaunchCallback == null) {
            aPMPMCallbackNoOpLaunchCallback = noOpLaunchCallback();
        }
        openWebContainer(context, aPMPMLaunchRequest, aPMPMCallbackNoOpLaunchCallback, aPMPMActionPayloadFromJson$feature_alipay_plus_nonsdk_release.getTitle());
    }

    public final void handleNavigationHook$feature_alipay_plus_nonsdk_release(@NotNull APMPMURLHook hook, @NotNull APMPMContainerPresenter presenter, APMPMBridgeContext bridgeContext) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        APMPMCallback<APMPMLaunchResult> aPMPMCallbackNoOpLaunchCallback = this.activeLaunchCallback.get();
        if (aPMPMCallbackNoOpLaunchCallback == null) {
            aPMPMCallbackNoOpLaunchCallback = noOpLaunchCallback();
        }
        APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.INFO, APMPMLogCategory.NAVIGATION, "hook", "Navigation hook handled", d.x("hook", hook.getClass().getSimpleName()));
        if (hook instanceof APMPMURLHook.Load) {
            presenter.loadUrl(((APMPMURLHook.Load) hook).getUrl());
            return;
        }
        if (hook instanceof APMPMURLHook.Decode) {
            APMPMURLHook.Decode decode = (APMPMURLHook.Decode) hook;
            performDecode(presenter.getContext(), decode.getRequest(), aPMPMCallbackNoOpLaunchCallback, presenter, bridgeContext, decode.getMetadata());
        } else if (hook instanceof APMPMURLHook.OAuth) {
            performOAuthHook(((APMPMURLHook.OAuth) hook).getAuthUrl(), presenter, aPMPMCallbackNoOpLaunchCallback);
        } else if (hook instanceof APMPMURLHook.OpenExternal) {
            openExternal(presenter.getContext(), ((APMPMURLHook.OpenExternal) hook).getUrl(), aPMPMCallbackNoOpLaunchCallback);
        } else if (!hook.equals(APMPMURLHook.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void handleTradePay(@NotNull String codeValue, @NotNull String tradeNo, @NotNull APMPMContainerPresenter presenter, @NotNull APMPMBridgeContext bridgeContext) {
        Intrinsics.checkNotNullParameter(codeValue, "codeValue");
        Intrinsics.checkNotNullParameter(tradeNo, "tradeNo");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(bridgeContext, "bridgeContext");
        APMPMLog aPMPMLog = APMPMLog.INSTANCE;
        APMPMLogHandler aPMPMLogHandler = this.logger;
        APMPMLogLevel aPMPMLogLevel = APMPMLogLevel.INFO;
        APMPMLogCategory aPMPMLogCategory = APMPMLogCategory.JSAPI;
        APMPMLogMetadata aPMPMLogMetadata = APMPMLogMetadata.INSTANCE;
        aPMPMLog.emit(aPMPMLogHandler, aPMPMLogLevel, aPMPMLogCategory, "tradePay", "tradePay JSAPI requested", d.x("tradeNO", aPMPMLogMetadata.redactedValue(tradeNo)));
        APMPMDecodeRequest aPMPMDecodeRequest = new APMPMDecodeRequest(codeValue, null, 2, null);
        APMPMCallback<APMPMLaunchResult> aPMPMCallbackNoOpLaunchCallback = this.activeLaunchCallback.get();
        if (aPMPMCallbackNoOpLaunchCallback == null) {
            aPMPMCallbackNoOpLaunchCallback = noOpLaunchCallback();
        }
        performDecode(presenter.getContext(), aPMPMDecodeRequest, aPMPMCallbackNoOpLaunchCallback, presenter, bridgeContext, r0.k(new Pair("source", "jsapiTradePay"), new Pair("tradeNO", aPMPMLogMetadata.redactedValue(tradeNo))));
    }

    public final void inquireQuote(APMPMInquireQuoteRequest request, @NotNull final APMPMCallback<APMPMInquireQuoteResult> callback) {
        String sellCurrency;
        String buyCurrency;
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = null;
        String string2 = (request == null || (buyCurrency = request.getBuyCurrency()) == null) ? null : d0.F0(buyCurrency).toString();
        if (string2 == null) {
            string2 = "";
        }
        if (request != null && (sellCurrency = request.getSellCurrency()) != null) {
            string = d0.F0(sellCurrency).toString();
        }
        String str = string != null ? string : "";
        if (string2.length() == 0 || str.length() == 0) {
            callback.onFailure(APMPMError.INSTANCE.invalidInput("buyCurrency or sellCurrency is empty"));
        } else {
            performProxy(APMPMProxyRequest.INSTANCE.inquireQuote(string2, str), new APMPMCallback<APMPMProxyResponse>() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator.inquireQuote.1
                @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
                public void onFailure(APMPMError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    APMPMCoordinator.this.logProxyFailure(error);
                    APMPMCoordinator.this.dispatchFailure(callback, error);
                }

                @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
                public void onSuccess(APMPMProxyResponse result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    APMPMError resultError = result.getResultError();
                    if (resultError != null) {
                        APMPMCoordinator aPMPMCoordinator = APMPMCoordinator.this;
                        APMPMCallback<APMPMInquireQuoteResult> aPMPMCallback = callback;
                        aPMPMCoordinator.logProxyFailure(resultError);
                        aPMPMCoordinator.dispatchFailure(aPMPMCallback, resultError);
                        return;
                    }
                    APMPMCoordinator.this.logProxySuccess(result);
                    APMPMInquireQuoteResult aPMPMInquireQuoteResultFromProxyResponse = APMPMInquireQuoteResult.INSTANCE.fromProxyResponse(result);
                    if (aPMPMInquireQuoteResultFromProxyResponse != null) {
                        APMPMCoordinator.this.dispatchSuccess(callback, aPMPMInquireQuoteResultFromProxyResponse);
                        return;
                    }
                    APMPMError aPMPMError = new APMPMError("SYSTEM_ERROR", "Quote response is empty", null, 4, null);
                    APMPMCoordinator.this.logProxyFailure(aPMPMError);
                    APMPMCoordinator.this.dispatchFailure(callback, aPMPMError);
                }
            });
        }
    }

    public final boolean isAlipayPlusSupportedRegion(String region) {
        updateRemoteConfigurationIfNeeded();
        String strFirstNonBlank = firstNonBlank(region, getCurrentRegion());
        if (strFirstNonBlank == null) {
            return false;
        }
        List<String> availableRegions = this.remoteConfiguration.getConfig().getAvailableRegions();
        if ((availableRegions instanceof Collection) && availableRegions.isEmpty()) {
            return false;
        }
        Iterator<T> it8 = availableRegions.iterator();
        while (it8.hasNext()) {
            if (a0.z((String) it8.next(), strFirstNonBlank, true)) {
                return true;
            }
        }
        return false;
    }

    public final void launch(@NotNull Context context, @NotNull APMPMLaunchRequest request, @NotNull APMPMCallback<APMPMLaunchResult> callback) {
        String strForceHttps;
        APMPMLaunchRequest aPMPMLaunchRequestCopy$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = d0.F0(request.getUrl()).toString();
        APMPMLog aPMPMLog = APMPMLog.INSTANCE;
        APMPMLogHandler aPMPMLogHandler = this.logger;
        APMPMLogLevel aPMPMLogLevel = APMPMLogLevel.INFO;
        APMPMLogCategory aPMPMLogCategory = APMPMLogCategory.LAUNCH;
        APMPMUrl aPMPMUrl = APMPMUrl.INSTANCE;
        aPMPMLog.emit(aPMPMLogHandler, aPMPMLogLevel, aPMPMLogCategory, "start", "Launch requested", r0.k(new Pair("hasScheme", String.valueOf(aPMPMUrl.hasScheme(string))), new Pair("forceHttps", String.valueOf(APMPMCoordinatorKt.getResolvedForceHttps(request)))));
        if (string.length() == 0) {
            APMPMLog.emit$default(aPMPMLog, this.logger, APMPMLogLevel.WARNING, aPMPMLogCategory, "emptyInput", "Launch input is empty", null, 32, null);
            dispatchFailure(callback, APMPMError.INSTANCE.invalidInput("Launch input is empty"));
            return;
        }
        if (aPMPMUrl.normalizedAbsoluteUrl(string) == null) {
            APMPMLog.emit$default(aPMPMLog, this.logger, APMPMLogLevel.WARNING, aPMPMLogCategory, "invalidURL", "Launch URL is invalid", null, 32, null);
            dispatchFailure(callback, APMPMError.INSTANCE.invalidInput("Launch URL is invalid"));
            return;
        }
        this.activeLaunchCallback.set(callback);
        APMPMLaunchRequest aPMPMLaunchRequestCopy$default2 = APMPMLaunchRequest.copy$default(request, string, null, null, 6, null);
        if (APMPMCoordinatorKt.getResolvedForceHttps(aPMPMLaunchRequestCopy$default2) && (strForceHttps = aPMPMUrl.forceHttps(aPMPMLaunchRequestCopy$default2.getUrl())) != null && (aPMPMLaunchRequestCopy$default = APMPMLaunchRequest.copy$default(aPMPMLaunchRequestCopy$default2, strForceHttps, null, null, 6, null)) != null) {
            aPMPMLaunchRequestCopy$default2 = aPMPMLaunchRequestCopy$default;
        }
        openWebContainer$default(this, context, aPMPMLaunchRequestCopy$default2, callback, null, 8, null);
    }

    public final void updateRemoteConfiguration(@NotNull APMPMCallback<JSONObject> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        updateRemoteConfiguration(true, callback);
    }

    private final void updateRemoteConfiguration(boolean force, final APMPMCallback<JSONObject> callback) {
        if (!force && !APMPMRemoteConfiguration.shouldUpdate$default(this.remoteConfiguration, 0L, 1, null)) {
            if (callback != null) {
                dispatchSuccess(callback, this.remoteConfiguration.getConfig().toJson());
            }
        } else if (this.remoteConfigurationFetchInFlight.compareAndSet(false, true)) {
            APMPMLog.INSTANCE.emit(this.logger, APMPMLogLevel.DEBUG, APMPMLogCategory.PROXY, "fetchConfig", "Remote configuration fetch requested", d.x("force", String.valueOf(force)));
            performProxy(APMPMProxyRequest.INSTANCE.fetchConfig(), new APMPMCallback<APMPMProxyResponse>() { // from class: com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator.updateRemoteConfiguration.1
                @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
                public void onFailure(APMPMError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    APMPMCoordinator.this.remoteConfigurationFetchInFlight.set(false);
                    APMPMCoordinator.this.logProxyFailure(error);
                    APMPMCallback<JSONObject> aPMPMCallback = callback;
                    if (aPMPMCallback != null) {
                        APMPMCoordinator.this.dispatchFailure(aPMPMCallback, error);
                    }
                }

                @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
                public void onSuccess(APMPMProxyResponse result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    APMPMError resultError = result.getResultError();
                    if (resultError != null) {
                        APMPMCoordinator aPMPMCoordinator = APMPMCoordinator.this;
                        APMPMCallback<JSONObject> aPMPMCallback = callback;
                        aPMPMCoordinator.remoteConfigurationFetchInFlight.set(false);
                        aPMPMCoordinator.logProxyFailure(resultError);
                        if (aPMPMCallback != null) {
                            aPMPMCoordinator.dispatchFailure(aPMPMCallback, resultError);
                            return;
                        }
                        return;
                    }
                    APMPMCoordinator.this.logProxySuccess(result);
                    APMPMRemoteConfiguration.updateConfig$default(APMPMCoordinator.this.getRemoteConfiguration(), APMPMRemoteBasicConfig.INSTANCE.fromProxyResponse(result), 0L, 2, null);
                    APMPMCoordinator.this.remoteConfigurationFetchInFlight.set(false);
                    APMPMCallback<JSONObject> aPMPMCallback2 = callback;
                    if (aPMPMCallback2 != null) {
                        APMPMCoordinator.this.dispatchSuccess(aPMPMCallback2, result.getSdkResponseData());
                    }
                }
            });
        } else if (callback != null) {
            dispatchSuccess(callback, this.remoteConfiguration.getConfig().toJson());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ APMPMCoordinator(APMPMConfiguration aPMPMConfiguration, APMPMNetworkService aPMPMNetworkService, APMPMService aPMPMService, Context context, APMPMURLInterceptor aPMPMURLInterceptor, APMPMWebContainerService aPMPMWebContainerService, APMPMRemoteConfiguration aPMPMRemoteConfiguration, APMPMLogHandler aPMPMLogHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        APMPMURLInterceptor aPMPMURLInterceptor2;
        List list = null;
        Object[] objArr = 0;
        APMPMNetworkService aPMPMNetworkService2 = (i & 2) != 0 ? null : aPMPMNetworkService;
        APMPMService aPMPMService2 = (i & 4) != 0 ? null : aPMPMService;
        Context context2 = (i & 8) != 0 ? null : context;
        if ((i & 16) != 0) {
            aPMPMURLInterceptor2 = new APMPMURLInterceptor(list, 1, objArr == true ? 1 : 0);
        } else {
            aPMPMURLInterceptor2 = aPMPMURLInterceptor;
        }
        this(aPMPMConfiguration, aPMPMNetworkService2, aPMPMService2, context2, aPMPMURLInterceptor2, (i & 32) != 0 ? new APMPMWebContainerService() : aPMPMWebContainerService, (i & 64) != 0 ? new APMPMRemoteConfiguration(null, null, 0L, 7, null) : aPMPMRemoteConfiguration, (i & 128) != 0 ? null : aPMPMLogHandler);
    }
}
