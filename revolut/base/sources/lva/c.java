package lva;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import sri.m;
import ufm.i;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements gva.b, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f200347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iva.a f200348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f200349c;
    public final Lazy d;

    public c(iva.a navigationProvider, m navigator, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f200347a = cryptoNavigationInterceptor;
        this.f200348b = navigationProvider;
        this.f200349c = navigator;
        this.d = j.b(new lv4.b(5));
    }

    public static boolean g(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "crypto") && Intrinsics.f(cVar.e(2), "recurring-buys");
    }

    public static boolean h(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "feature") && Intrinsics.f(cVar.e(2), "crypto") && Intrinsics.f(cVar.e(3), "recurring");
    }

    public static CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData i() {
        return new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) null, new TextLocalisedClause(R.string.common_currency_picker_header_title, null, null, 14), (CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint) CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.RecurringStrategy.f70941a, pj5.a.MARKET_CAP, (TextLocalisedClause) null, false, false, Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION);
    }

    public static f k(jf0.c cVar) {
        if (g(cVar) && !d0.W(cVar.e(3))) {
            return new e(cVar.e(3));
        }
        if (g(cVar) || h(cVar)) {
            return d.f200350a;
        }
        throw new IllegalStateException(("Unsupported deeplink for " + c.class.getSimpleName() + ": " + cVar.f173629c).toString());
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return g(deeplink) || h(deeplink);
    }

    @Override // ai5.b
    public final efm.d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f200347a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f200347a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f200347a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lva.a
            if (r0 == 0) goto L13
            r0 = r8
            lva.a r0 = (lva.a) r0
            int r1 = r0.f200343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200343w = r1
            goto L1a
        L13:
            lva.a r0 = new lva.a
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200343w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L8c
        L2f:
            r7 = move-exception
            goto L95
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L3d:
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L61
        L41:
            yhm.o.b(r8)
            lva.f r7 = k(r7)     // Catch: java.lang.Throwable -> L2f
            boolean r8 = r7 instanceof lva.e     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L72
            iva.a r8 = r6.f200348b     // Catch: java.lang.Throwable -> L2f
            lva.e r7 = (lva.e) r7     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r7.f200351a     // Catch: java.lang.Throwable -> L2f
            pva.d r8 = (pva.d) r8     // Catch: java.lang.Throwable -> L2f
            ufm.i r7 = r8.c(r7)     // Catch: java.lang.Throwable -> L2f
            r0.f200343w = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = nim.a.b(r7, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L61
            goto L8b
        L61:
            com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination r8 = (com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination) r8     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.Intrinsics.h(r8)     // Catch: java.lang.Throwable -> L2f
            r0.f200343w = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r6.j(r8, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L6f
            goto L8b
        L6f:
            q06.j r8 = (q06.j) r8     // Catch: java.lang.Throwable -> L2f
            return r8
        L72:
            lva.d r8 = lva.d.f200350a     // Catch: java.lang.Throwable -> L2f
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L8f
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination r7 = new com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination     // Catch: java.lang.Throwable -> L2f
            com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData r8 = i()     // Catch: java.lang.Throwable -> L2f
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            r0.f200343w = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r6.j(r7, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            q06.j r8 = (q06.j) r8     // Catch: java.lang.Throwable -> L2f
            return r8
        L8f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2f
            r7.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2f
        L95:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lva.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarB = b(deeplink.f173629c);
        lr9.m mVar = new lr9.m(new l1.e(this, deeplink, z, 5), 17);
        d0VarB.getClass();
        i iVar = new i(d0VarB, mVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.kompot.bridge.navigation.KompotDestination r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lva.b
            if (r0 == 0) goto L13
            r0 = r7
            lva.b r0 = (lva.b) r0
            int r1 = r0.f200346y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200346y = r1
            goto L18
        L13:
            lva.b r0 = new lva.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f200344w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200346y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.retail.core.navigation.FeatureCommand r6 = r0.v
            com.revolut.kompot.bridge.navigation.KompotDestination r0 = r0.u
            yhm.o.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.e(r6)
            r0.u = r6
            r0.v = r7
            r0.f200346y = r3
            ai5.b r2 = r5.f200347a
            java.lang.Object r0 = r2.c(r7, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L4d:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            r1 = 0
            if (r6 == 0) goto L63
            q06.h r6 = new q06.h
            q06.b r7 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.d
            r7.<init>(r2, r1)
            r6.<init>(r0, r7)
            return r6
        L63:
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lva.c.j(com.revolut.kompot.bridge.navigation.KompotDestination, gim.c):java.lang.Object");
    }
}
