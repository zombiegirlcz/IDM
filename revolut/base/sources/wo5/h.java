package wo5;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lo5.p;
import sri.m;
import te0.w;
import ufm.i;
import wnc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements go5.d, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f298888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f298889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final po5.a f298890c;
    public final xoj.a d;
    public final p e;

    public h(m navigator, po5.a cryptoWithdrawEnabledStateChecker, xoj.a featuresInteractor, p cryptoSendNaviCommandProvider, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f298888a = cryptoNavigationInterceptor;
        this.f298889b = navigator;
        this.f298890c = cryptoWithdrawEnabledStateChecker;
        this.d = featuresInteractor;
        this.e = cryptoSendNaviCommandProvider;
    }

    public static xi0.b g(jf0.c cVar) {
        if (d0.W(cVar.e(3))) {
            return null;
        }
        xi0.a aVar = xi0.b.Companion;
        String strE = cVar.e(3);
        aVar.getClass();
        return xi0.a.a(strE);
    }

    public static FeatureCommand h(h hVar, NaviCommand naviCommand, MainContainerNavigationId.MainContainerTabId mainContainerTabId, int i) {
        if ((i & 1) != 0) {
            naviCommand = null;
        }
        if ((i & 2) != 0) {
            mainContainerTabId = u49.b.f277278a;
        }
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(mainContainerTabId, null, naviCommand, 2)));
    }

    public static boolean i(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "limits");
    }

    public static boolean j(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "send");
    }

    public static boolean k(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "withdraw");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return k(deeplink) || j(deeplink) || i(deeplink);
    }

    @Override // ai5.b
    public final efm.d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f298888a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f298888a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f298888a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        if (r11 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo5.h.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarB = b(deeplink.f173629c);
        wl3.b bVar = new wl3.b(new a(this, deeplink, z, 0), 20);
        d0VarB.getClass();
        i iVar = new i(d0VarB, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final i l(d dVar) {
        efm.d0 d0VarM;
        efm.d0 d0VarE = ((cpj.b) this.d).e(yoj.c.CRYPTO, yoj.d.DISABLED);
        po5.a aVar = this.f298890c;
        i iVarD = aVar.d();
        xi0.b bVar = dVar.f298882a;
        if (bVar != null) {
            d0VarM = new i(aVar.e(bVar), new wl3.b(new x(9), 24), 1);
        } else {
            d0VarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
        }
        i iVar = new i(w.I0(d0VarE, iVarD, d0VarM), new wl3.b(new wg2.g(this, dVar, 25), 15), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
