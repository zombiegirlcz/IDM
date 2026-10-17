package kbj;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import g48.h;
import i5f.g;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import sri.m;
import ufm.i;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements ebj.c, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f182616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f182617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f182618c;
    public final xoj.a d;

    public c(m navigator, d depositsEnabledStateChecker, xoj.a featuresInteractor, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(depositsEnabledStateChecker, "depositsEnabledStateChecker");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f182616a = cryptoNavigationInterceptor;
        this.f182617b = navigator;
        this.f182618c = depositsEnabledStateChecker;
        this.d = featuresInteractor;
    }

    public static FeatureCommand g(c cVar, NaviCommand naviCommand, MainContainerNavigationId.MainContainerTabId mainContainerTabId, int i) {
        if ((i & 1) != 0) {
            naviCommand = null;
        }
        if ((i & 2) != 0) {
            mainContainerTabId = u49.b.f277278a;
        }
        cVar.getClass();
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(mainContainerTabId, null, naviCommand, 2)));
    }

    public static boolean h(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "deposit");
    }

    public static boolean i(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "direct-deposit");
    }

    public static boolean j(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "request");
    }

    public static CryptoDepositDestination l(jf0.c cVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar) {
        xi0.b bVarA;
        if (d0.W(cVar.e(3))) {
            bVarA = null;
        } else {
            xi0.a aVar2 = xi0.b.Companion;
            String strE = cVar.e(3);
            aVar2.getClass();
            bVarA = xi0.a.a(strE);
        }
        return new CryptoDepositDestination(new CryptoDepositInput.Overview(bVarA, aVar, false, (d0.W(cVar.e(4)) || !Intrinsics.f(cVar.e(4), "minimum")) ? hbj.b.NETWORK_PICKER : hbj.b.MINIMUM_DEPOSIT_INFO, (wk5.a) null, 36));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return h(deeplink) || j(deeplink) || i(deeplink);
    }

    @Override // ai5.b
    public final efm.d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f182616a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f182616a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f182616a.d(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbj.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarB = b(deeplink.f173629c);
        k64.a aVar = new k64.a(18, new h(this, deeplink, z, 23));
        d0VarB.getClass();
        i iVar = new i(d0VarB, aVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.d0 k(jf0.c cVar) {
        xi0.b currency;
        if (d0.W(cVar.e(3))) {
            currency = null;
        } else {
            xi0.a aVar = xi0.b.Companion;
            String strE = cVar.e(3);
            aVar.getClass();
            currency = xi0.a.a(strE);
        }
        if (currency == null) {
            return efm.d0.m(Boolean.FALSE);
        }
        Intrinsics.checkNotNullParameter(currency, "currency");
        i iVar = new i(this.f182618c.a(), new k64.a(24, new g(9, currency)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return new i(iVar, new k64.a(15, new k9h.d(16)), 1);
    }

    public final ufm.b m(jf0.c cVar, boolean z, boolean z3, yoj.a aVar) {
        if (yoj.b.l(aVar)) {
            ufm.b bVarM = efm.d0.m(g(this, null, null, 3));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!yoj.b.k(aVar)) {
            ufm.b bVarM2 = efm.d0.m(g(this, null, u49.a.f277275a, 1));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (!z || z3) {
            ufm.b bVarM3 = efm.d0.m(g(this, null, null, 3));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        if (h(cVar)) {
            ufm.b bVarM4 = efm.d0.m(u0.f(l(cVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a.WALLET)));
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            return bVarM4;
        }
        if (j(cVar)) {
            ufm.b bVarM5 = efm.d0.m(u0.f(l(cVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a.FRIENDS)));
            Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
            return bVarM5;
        }
        if (i(cVar)) {
            ufm.b bVarM6 = efm.d0.m(g(this, u0.f(new CryptoDepositDestination(new CryptoDepositInput.DirectDeposit.AllOptions(true))), null, 2));
            Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
            return bVarM6;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected deeplink passed to CryptoDepositsDeeplinkActionPerformerImpl");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        ufm.b bVarM7 = efm.d0.m(g(this, null, null, 3));
        Intrinsics.checkNotNullExpressionValue(bVarM7, "just(...)");
        return bVarM7;
    }
}
