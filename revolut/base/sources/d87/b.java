package d87;

import d73.n;
import d7j.o0;
import d7j.p0;
import efm.d0;
import jf0.c;
import jf0.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import rd0.e;
import sri.m;
import ufm.f;
import wp5.y;
import ybl.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f112134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f112135b;

    public b(l tradingConfigInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f112134a = tradingConfigInteractor;
        this.f112135b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "invest") && Intrinsics.f(cVar.e(2), "global-markets") && Intrinsics.f(cVar.e(3), "overview");
    }

    public final d0 b() {
        d0 d0VarFirstOrError = e.c(mo3.a.e(nim.a.v(com.revolut.data.database.models.openbanking.d.x("GlobalMarketsOverviewActionPerformerImpl", "performAction", l.d(this.f112134a)), new p0(11)), new o0(2), new o0(3)), g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof d87.a
            if (r4 == 0) goto L13
            r4 = r5
            d87.a r4 = (d87.a) r4
            int r0 = r4.f112133w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f112133w = r0
            goto L1a
        L13:
            d87.a r4 = new d87.a
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f112133w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            efm.d0 r5 = r3.b()
            r4.f112133w = r2
            java.lang.Object r5 = nim.a.b(r5, r4)
            if (r5 != r0) goto L41
            return r0
        L41:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r5 = 0
            if (r4 == 0) goto L52
            q06.h r4 = new q06.h
            com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$GlobalMarketsDestination r0 = com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$GlobalMarketsDestination.f74564a
            r4.<init>(r0, r5)
            return r4
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d87.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b();
        n nVar = new n(new d34.b(this, 18), 5);
        d0VarB.getClass();
        f fVar = new f(d0VarB, nVar, 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }
}
