package lw5;

import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l1.e;
import sri.m;
import ufm.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements bw5.b, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f200409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f200410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ow5.b f200411c;
    public final FeatureCommand d;
    public final FeatureCommand e;

    public b(m navigator, ai5.b cryptoNavigationInterceptor, ow5.b cryptoIsraelExpansionChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(cryptoIsraelExpansionChecker, "cryptoIsraelExpansionChecker");
        this.f200409a = cryptoNavigationInterceptor;
        this.f200410b = navigator;
        this.f200411c = cryptoIsraelExpansionChecker;
        this.d = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
        this.e = new FeatureCommand(CryptoInvestFeatureConfig.AllCrypto.f71497a);
    }

    public static boolean g(c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "allcryptos");
    }

    public static boolean h(c cVar) {
        return Intrinsics.f(cVar.e(1), "feature") && Intrinsics.f(cVar.e(2), "crypto") && Intrinsics.f(cVar.e(3), "allcryptos");
    }

    public static boolean i(c cVar) {
        return Intrinsics.f(cVar.e(1), "trading") && Intrinsics.f(cVar.e(2), "crypto") && Intrinsics.f(cVar.e(3), "collections") && d0.W(cVar.e(4));
    }

    public static boolean j(c cVar) {
        return Intrinsics.f(cVar.e(1), "trading") && Intrinsics.f(cVar.e(2), "crypto") && Intrinsics.f(cVar.e(3), "collections") && !d0.W(cVar.e(4));
    }

    public static boolean k(c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "invest");
    }

    public static boolean l(c cVar) {
        return Intrinsics.f(cVar.e(1), "feature") && Intrinsics.f(cVar.e(2), "crypto") && cVar.e(3).length() == 0;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return g(deeplink) || h(deeplink) || j(deeplink) || i(deeplink) || k(deeplink) || l(deeplink);
    }

    @Override // ai5.b
    public final efm.d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f200409a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f200409a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f200409a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r9 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (r9 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw5.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarB = b(deeplink.f173629c);
        lr9.m mVar = new lr9.m(new e(this, deeplink, z, 6), 22);
        d0VarB.getClass();
        i iVar = new i(d0VarB, mVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
