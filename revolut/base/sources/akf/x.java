package akf;

import com.revolut.feature.subscriptions.api.block_future_payments.BlockFuturePaymentsFlowDestination;
import klf.z2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends yji.n implements elf.s0 {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z2 f5913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.c f5914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.h0 f5915n;
    public final klf.m1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bla.b f5916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f5917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vr2.d f5918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final od0.i f5919s;

    public x(z2 subscriptionDataSource, klf.c blockedMerchantDataSource, klf.h0 commonDataSource, klf.m1 juniorDataSource, bla.b productCatalogueInteractor, gte.a featureToggleInteractor, vr2.d blockMerchantDestinationResolver) {
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(blockedMerchantDataSource, "blockedMerchantDataSource");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(blockMerchantDestinationResolver, "blockMerchantDestinationResolver");
        od0.i customActionsProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(customActionsProvider, "customActionsProvider");
        this.f5913l = subscriptionDataSource;
        this.f5914m = blockedMerchantDataSource;
        this.f5915n = commonDataSource;
        this.o = juniorDataSource;
        this.f5916p = productCatalogueInteractor;
        this.f5917q = featureToggleInteractor;
        this.f5918r = blockMerchantDestinationResolver;
        this.f5919s = customActionsProvider;
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, new u(vkm.q.t(vkm.q.q(new a35.d((SharedFlow) this.f5914m.e.getValue(), 9)), 1), 0), null, new a07.d(this, null, 27), 3);
    }

    public final cmf.f Z2() {
        return new cmf.f(ta6.a.g(this.f5915n.d(), (SharedFlow) this.f5914m.e.getValue(), this.f5913l.a(), this.o.a(), new s(5, 4, x.class, this, "buildAction", "buildAction(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/blocked_merchants/api/model/TransactionBlockedMerchantInfo;Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPayment;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;")), zhm.u.c(this), "BlockFuturePayments");
    }

    public final boolean b3(qua.p pVar) {
        boolean z = false;
        if (((jla.h) this.f5916p).d("security_hub.block_merchants", null) != bla.c.ENABLED) {
            return false;
        }
        qua.g gVar = pVar.f249332w;
        if (gVar != null && gVar.f) {
            z = true;
        }
        return !z;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (this.f5919s.g() != null) {
            throw new ClassCastException();
        }
        boolean z = false;
        if (a10.b.B(v1.Companion, t1.BLOCK_SUBSCRIPTION, str)) {
            qua.p pVar = obj2 instanceof qua.p ? (qua.p) obj2 : null;
            if (pVar != null) {
                A2(new BlockFuturePaymentsFlowDestination(pVar.f249314a.f160150a, false));
                z = true;
            }
        } else if (Intrinsics.f(str, u1.a(t1.BLOCK_MERCHANT))) {
            return c3(obj2, (gim.c) continuation);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.Object r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof akf.w
            if (r0 == 0) goto L13
            r0 = r7
            akf.w r0 = (akf.w) r0
            int r1 = r0.f5911w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5911w = r1
            goto L18
        L13:
            akf.w r0 = new akf.w
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5911w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4b
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof tof.a3
            if (r7 == 0) goto L3a
            tof.a3 r6 = (tof.a3) r6
            goto L3b
        L3a:
            r6 = r4
        L3b:
            if (r6 != 0) goto L40
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L40:
            r0.f5911w = r3
            vr2.d r7 = r5.f5918r
            java.lang.Object r7 = r7.c(r6, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.revolut.kompot.common.ParcelableDestination r7 = (com.revolut.kompot.common.ParcelableDestination) r7
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r6 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            yhi.b r0 = yhi.b.BOTTOM_DIALOG
            r1 = 12
            r6.<init>(r7, r0, r4, r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r6)
            r5.A2(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.x.c3(java.lang.Object, gim.c):java.lang.Object");
    }
}
