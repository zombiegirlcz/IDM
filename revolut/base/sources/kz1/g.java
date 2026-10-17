package kz1;

import com.revolut.feature.apm.core.api.product.ApmUpi;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements xw1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax1.a f191048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f191049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uw1.c f191050c;

    public g(ax1.a apmMoneyRequestsInteractor, m navigator, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmMoneyRequestsInteractor, "apmMoneyRequestsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f191048a = apmMoneyRequestsInteractor;
        this.f191049b = navigator;
        this.f191050c = apmFeatureChecker;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apm-money-request");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kz1.f
            if (r0 == 0) goto L13
            r0 = r7
            kz1.f r0 = (kz1.f) r0
            int r1 = r0.f191047w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191047w = r1
            goto L1a
        L13:
            kz1.f r0 = new kz1.f
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191047w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            java.util.HashMap r7 = r6.d
            java.lang.String r2 = "kind"
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            com.revolut.feature.apm.core.api.product.ApmUpi r2 = com.revolut.feature.apm.core.api.product.ApmUpi.f61828c
            r2.getClass()
            java.lang.String r2 = "UPI"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L85
            uw1.c r7 = r5.f191050c
            ty1.b r7 = (ty1.b) r7
            r7.getClass()
            uw1.f r2 = uw1.f.UPI
            boolean r7 = r7.b(r2)
            if (r7 != 0) goto L5c
            goto L85
        L5c:
            r7 = 2
            java.lang.String r6 = r6.e(r7)
            r0.f191047w = r3
            ax1.a r7 = r5.f191048a
            pz1.c r7 = (pz1.c) r7
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            com.revolut.domain.models.moneyrequest.MoneyRequest r7 = (com.revolut.domain.models.moneyrequest.MoneyRequest) r7
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest r2 = new com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest
            r2.<init>(r7, r4)
            r1.<init>(r2)
            r0.<init>(r1)
            r6.<init>(r0, r4)
            return r6
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kz1.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("kind");
        ApmUpi.f61828c.getClass();
        if (Intrinsics.f(str, "UPI")) {
            ty1.b bVar = (ty1.b) this.f191050c;
            bVar.getClass();
            if (bVar.b(uw1.f.UPI)) {
                ufm.i iVar = new ufm.i(w.o0(p0.f264003c, new kq5.d(this, deeplink, null, 21)), new kxj.e(new kv7.g(this, 26), 2), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            }
        }
        return d0.m(Boolean.FALSE);
    }
}
