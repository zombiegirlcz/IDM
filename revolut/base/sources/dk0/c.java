package dk0;

import android.content.Context;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ulm.d;
import xj0.f;
import xj0.i;
import xj0.k;
import yj0.g;
import yj0.h;
import yj0.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f115417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f115419c;
    public final ij0.a d;
    public final xj0.a e;
    public final lj0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nz5.a f115420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xj0.d f115421h;
    public final bk0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f115422j;
    public final qm0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yh0.a f115423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ak0.c f115424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rj0.a f115425n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f115426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sj0.b f115427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ek0.a f115428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fk0.a f115429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nz5.a f115430t;
    public final qm0.i u;
    public final qql.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jj0.g f115431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ak0.a f115432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Optional f115433y;
    public final Optional z;

    static {
        new ne0.d();
    }

    public c(g appUnlockedCacheInterceptor, d authenticator, h cacheControlInterceptor, ij0.a configuration, xj0.a connectionErrorWrapperInterceptor, Context context, lj0.b debugInterceptor, nz5.a failoverInterceptor, xj0.d headersInterceptor, bk0.b headersSizeInterceptor, f idempotencyInterceptor, qm0.b integrityCheckInterceptor, yh0.a integrityHeaderInterceptor, ak0.c loggingDecorator, rj0.a networkFeatureTogglesProvider, j okHttpCacheProvider, gk0.a okHttpClientValidator, k oneShotRequestBodyInterceptor, sj0.b overseerInterceptor, ek0.a progressInterceptor, fk0.a proxyRepository, nz5.a regionalHostInterceptor, qm0.i signingInterceptor, qql.b ssoReauthenticationInterceptor, jj0.g twoFactorAuthenticationInterceptor, ak0.a instrumentationTestDecorator, Optional preventiveTokenRefreshInterceptor, Optional appMandatoryInterceptorsProvider) {
        Intrinsics.checkNotNullParameter(appUnlockedCacheInterceptor, "appUnlockedCacheInterceptor");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(cacheControlInterceptor, "cacheControlInterceptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(connectionErrorWrapperInterceptor, "connectionErrorWrapperInterceptor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(debugInterceptor, "debugInterceptor");
        Intrinsics.checkNotNullParameter(failoverInterceptor, "failoverInterceptor");
        Intrinsics.checkNotNullParameter(headersInterceptor, "headersInterceptor");
        Intrinsics.checkNotNullParameter(headersSizeInterceptor, "headersSizeInterceptor");
        Intrinsics.checkNotNullParameter(idempotencyInterceptor, "idempotencyInterceptor");
        Intrinsics.checkNotNullParameter(integrityCheckInterceptor, "integrityCheckInterceptor");
        Intrinsics.checkNotNullParameter(integrityHeaderInterceptor, "integrityHeaderInterceptor");
        Intrinsics.checkNotNullParameter(loggingDecorator, "loggingDecorator");
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        Intrinsics.checkNotNullParameter(okHttpCacheProvider, "okHttpCacheProvider");
        Intrinsics.checkNotNullParameter(okHttpClientValidator, "okHttpClientValidator");
        Intrinsics.checkNotNullParameter(oneShotRequestBodyInterceptor, "oneShotRequestBodyInterceptor");
        Intrinsics.checkNotNullParameter(overseerInterceptor, "overseerInterceptor");
        Intrinsics.checkNotNullParameter(progressInterceptor, "progressInterceptor");
        Intrinsics.checkNotNullParameter(proxyRepository, "proxyRepository");
        Intrinsics.checkNotNullParameter(regionalHostInterceptor, "regionalHostInterceptor");
        Intrinsics.checkNotNullParameter(signingInterceptor, "signingInterceptor");
        Intrinsics.checkNotNullParameter(ssoReauthenticationInterceptor, "ssoReauthenticationInterceptor");
        Intrinsics.checkNotNullParameter(twoFactorAuthenticationInterceptor, "twoFactorAuthenticationInterceptor");
        Intrinsics.checkNotNullParameter(instrumentationTestDecorator, "instrumentationTestDecorator");
        Intrinsics.checkNotNullParameter(preventiveTokenRefreshInterceptor, "preventiveTokenRefreshInterceptor");
        Intrinsics.checkNotNullParameter(appMandatoryInterceptorsProvider, "appMandatoryInterceptorsProvider");
        this.f115417a = appUnlockedCacheInterceptor;
        this.f115418b = authenticator;
        this.f115419c = cacheControlInterceptor;
        this.d = configuration;
        this.e = connectionErrorWrapperInterceptor;
        this.f = debugInterceptor;
        this.f115420g = failoverInterceptor;
        this.f115421h = headersInterceptor;
        this.i = headersSizeInterceptor;
        this.f115422j = idempotencyInterceptor;
        this.k = integrityCheckInterceptor;
        this.f115423l = integrityHeaderInterceptor;
        this.f115424m = loggingDecorator;
        this.f115425n = networkFeatureTogglesProvider;
        this.o = okHttpCacheProvider;
        this.f115426p = oneShotRequestBodyInterceptor;
        this.f115427q = overseerInterceptor;
        this.f115428r = progressInterceptor;
        this.f115429s = proxyRepository;
        this.f115430t = regionalHostInterceptor;
        this.u = signingInterceptor;
        this.v = ssoReauthenticationInterceptor;
        this.f115431w = twoFactorAuthenticationInterceptor;
        this.f115432x = instrumentationTestDecorator;
        this.f115433y = preventiveTokenRefreshInterceptor;
        this.z = appMandatoryInterceptorsProvider;
    }
}
