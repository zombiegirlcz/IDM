package hje;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cje.d, q06.k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f152742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f152743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f152744c;
    public final toa.a d;
    public final FeatureCommand e;

    public i(sri.m navigator, ai5.b cryptoNavigationInterceptor, gte.a featureToggleInteractor, toa.a notificationSettingsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        this.f152742a = cryptoNavigationInterceptor;
        this.f152743b = navigator;
        this.f152744c = featureToggleInteractor;
        this.d = notificationSettingsInteractor;
        this.e = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "settings");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f152742a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f152742a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f152742a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hje.i.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        e eVar = new e(new h8b.b(deeplink, this, 25), 2);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
