package o26;

import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n1g.p;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DeFiAssetDetailsScreenContract$InputData f221502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k18.c f221503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f8j.a f221504n;

    public g(DeFiAssetDetailsScreenContract$InputData inputData, k18.c accountsInteractor, f8j.a commonActionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(commonActionsMapper, "commonActionsMapper");
        this.f221502l = inputData;
        this.f221503m = accountsInteractor;
        this.f221504n = commonActionsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(o26.g r5, wd6.e r6, gim.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof o26.d
            if (r0 == 0) goto L16
            r0 = r7
            o26.d r0 = (o26.d) r0
            int r1 = r0.f221498x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f221498x = r1
            goto L1b
        L16:
            o26.d r0 = new o26.d
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221498x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            wd6.e r6 = r0.u
            yhm.o.b(r7)
            goto L54
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            k18.c r7 = r5.f221503m
            wkm.l r7 = r7.F()
            nz7.g r2 = new nz7.g
            r4 = 15
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.u = r6
            r0.f221498x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            e16.b r7 = (e16.b) r7
            com.revolut.feature.defi.exchange.api.navigation.DeFiExchangeDestination r0 = new com.revolut.feature.defi.exchange.api.navigation.DeFiExchangeDestination
            com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData r5 = r5.f221502l
            xi0.b r5 = r5.f71679a
            java.lang.String r7 = r7.f121886a
            r0.<init>(r6, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o26.g.e3(o26.g, wd6.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f3(o26.g r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof o26.e
            if (r0 == 0) goto L16
            r0 = r6
            o26.e r0 = (o26.e) r0
            int r1 = r0.f221499w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f221499w = r1
            goto L1b
        L16:
            o26.e r0 = new o26.e
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221499w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L50
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            k18.c r6 = r5.f221503m
            wkm.l r6 = r6.F()
            nz7.g r2 = new nz7.g
            r4 = 14
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f221499w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            e16.b r6 = (e16.b) r6
            com.revolut.feature.defi.remittances.api.navigation.DeFiReceiveDestination r0 = new com.revolut.feature.defi.remittances.api.navigation.DeFiReceiveDestination
            java.lang.String r6 = r6.f121886a
            com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData r5 = r5.f221502l
            xi0.b r5 = r5.f71679a
            java.lang.String r5 = r5.f306286a
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o26.g.f3(o26.g, gim.c):java.lang.Object");
    }

    @Override // o26.a
    public final Flow Z2() {
        return new p(this.f221503m.F(), this, 25);
    }

    @Override // o26.a
    public final void b3() {
        V2(new f(this, null, 0), new yi5.b(29));
    }

    @Override // o26.a
    public final void c3() {
        V2(new f(this, null, 1), new yi5.b(29));
    }

    @Override // o26.a
    public final void d3() {
        V2(new f(this, null, 2), new yi5.b(29));
    }
}
