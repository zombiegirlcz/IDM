package nbk;

import efm.d0;
import elm.f;
import jf0.d;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import q06.k;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f214085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tbk.b f214086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lbk.a f214087c;

    public b(m navigator, tbk.b planGiftingAvailabilityInteractor, lbk.a planGiftingSenderFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(planGiftingAvailabilityInteractor, "planGiftingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(planGiftingSenderFlowCommandProvider, "planGiftingSenderFlowCommandProvider");
        this.f214085a = navigator;
        this.f214086b = planGiftingAvailabilityInteractor;
        this.f214087c = planGiftingSenderFlowCommandProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "birthday-gifting");
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
            boolean r6 = r7 instanceof nbk.a
            if (r6 == 0) goto L13
            r6 = r7
            nbk.a r6 = (nbk.a) r6
            int r0 = r6.f214084w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f214084w = r0
            goto L1a
        L13:
            nbk.a r6 = new nbk.a
            gim.c r7 = (gim.c) r7
            r6.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f214084w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r7)
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            tbk.b r7 = r5.f214086b
            boolean r7 = r7.a()
            if (r7 != 0) goto L3e
            return r3
        L3e:
            kbk.l r7 = kbk.l.BIRTHDAY
            r6.f214084w = r2
            lbk.a r1 = r5.f214087c
            r4 = 0
            com.revolut.retail.core.navigation.FeatureCommand r7 = lbk.a.a(r1, r4, r7, r6, r2)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            com.revolut.retail.core.navigation.FeatureCommand r7 = (com.revolut.retail.core.navigation.FeatureCommand) r7
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            r6.<init>(r0, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nbk.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f214086b.a()) {
            p0 p0Var = p0.f264001a;
            return w.o0(f.f127540b, new x(this, null, 7));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
