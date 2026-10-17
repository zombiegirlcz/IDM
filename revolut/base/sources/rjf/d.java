package rjf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pfm.z;
import q2j.k;
import rea.j;
import sri.m;
import yua.q;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements rhf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f254669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f254670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xua.a f254671c;
    public final iva.a d;

    public d(m navigator, e recurrentPaymentNaviCommandProvider, xua.a recurringPaymentInteractor, iva.a recurringBuysNavigationProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(recurrentPaymentNaviCommandProvider, "recurrentPaymentNaviCommandProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        this.f254669a = navigator;
        this.f254670b = recurrentPaymentNaviCommandProvider;
        this.f254671c = recurringPaymentInteractor;
        this.d = recurringBuysNavigationProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1), "standing-order-details") && !d0.W(deeplink.e(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(qua.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rjf.b
            if (r0 == 0) goto L13
            r0 = r6
            rjf.b r0 = (rjf.b) r0
            int r1 = r0.f254667w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254667w = r1
            goto L18
        L13:
            rjf.b r0 = new rjf.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254667w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            iva.a r6 = r4.d
            pva.d r6 = (pva.d) r6
            com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData$RecurringInputData r6 = r6.a(r5)
            if (r6 == 0) goto L42
            com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination r5 = new com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination
            r5.<init>(r6)
            return r5
        L42:
            rjf.e r6 = r4.f254670b
            efm.d0 r5 = r6.a(r5)
            r0.f254667w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rjf.d.b(qua.p, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rjf.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarFirstOrError = m70.a.g(((q) this.f254671c).o(deeplink.e(2)), null, new rhj.m(9), 1).firstOrError();
        j jVar = new j(new a(this, 0), 19);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.i iVar2 = new ufm.i(new ufm.f(o70.a.i(iVar), new j(new a(this, 1), 20), 3), new j(new rj7.b(5), 21), 1);
        z zVar = new z(iVar2, 1, new k(21), null);
        Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
        return zVar;
    }
}
