package ey5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import cu8.r0;
import et6.u1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f130577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f130578n;
    public final xh5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f130579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f130580q;

    public j(CryptoCollectionDetailsControllerContract$InputData inputData, n walletInteractor, r0 kycRequiredActionTransformer, xh5.a cryptoFeatureEnabledInteractor, f mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f130577m = walletInteractor;
        this.f130578n = kycRequiredActionTransformer;
        this.o = cryptoFeatureEnabledInteractor;
        this.f130579p = mapper;
        this.f130580q = new c(inputData.f71594a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g3(ey5.j r4, com.revolut.retail.core.navigation.FeatureCommand r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof ey5.h
            if (r0 == 0) goto L16
            r0 = r6
            ey5.h r0 = (ey5.h) r0
            int r1 = r0.f130576x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f130576x = r1
            goto L1b
        L16:
            ey5.h r0 = new ey5.h
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f130576x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ey5.j r4 = r0.u
            yhm.o.b(r6)
            goto L48
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            xh5.a r6 = r4.o
            efm.d0 r5 = xh5.a.a(r6, r5)
            r0.u = r4
            r0.f130576x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            r4.A2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ey5.j.g3(ey5.j, com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f130580q;
    }

    @Override // ey5.d
    public final Flow e3() {
        return new u1(c3(), this, 3);
    }

    @Override // ey5.d
    public final void f3() {
        V2(new esa.i(this, new i(this, null), null, 10), new yi5.b(29));
    }
}
