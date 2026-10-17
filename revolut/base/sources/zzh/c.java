package zzh;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p0i.b f326752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rzh.b f326753n;
    public final wj0.a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p0i.b fxOrderInteractor, rzh.b orderFlowStatusDialogConfigurationProvider, wj0.a idempotencyKeyHolder) {
        super(orderFlowStatusDialogConfigurationProvider);
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        this.f326752m = fxOrderInteractor;
        this.f326753n = orderFlowStatusDialogConfigurationProvider;
        this.o = idempotencyKeyHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nzh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof zzh.b
            if (r0 == 0) goto L13
            r0 = r14
            zzh.b r0 = (zzh.b) r0
            int r1 = r0.f326751w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326751w = r1
            goto L18
        L13:
            zzh.b r0 = new zzh.b
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f326751w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r14)
            goto La6
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            yhm.o.b(r14)
            com.revolut.feature.exchange.models.ExchangeLinkedOrderSpec r4 = new com.revolut.feature.exchange.models.ExchangeLinkedOrderSpec
            java.math.BigDecimal r14 = r13.f96693h
            if (r14 == 0) goto Lac
            double r5 = r14.doubleValue()
            wd6.e r7 = r13.e
            kotlin.Pair r8 = new kotlin.Pair
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r14 = r13.f96689a
            xi0.b r2 = r14.f96683a
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r9 = r13.f96690b
            xi0.b r10 = r9.f96683a
            r8.<init>(r2, r10)
            kyh.g r2 = r13.d
            kyh.g r10 = kyh.g.TOP
            if (r2 != r10) goto L58
            dj0.d r14 = oyh.b.d(r14)
        L56:
            r9 = r14
            goto L5d
        L58:
            dj0.d r14 = oyh.b.d(r9)
            goto L56
        L5d:
            com.revolut.feature.exchange.models.TakeProfitStopLoss r13 = r13.f96697n
            r14 = 0
            if (r13 == 0) goto L66
            java.lang.Double r2 = r13.f72160b
            r10 = r2
            goto L67
        L66:
            r10 = r14
        L67:
            if (r13 == 0) goto L6b
            java.lang.Double r14 = r13.f72161c
        L6b:
            r11 = r14
            r4.<init>(r5, r7, r8, r9, r10, r11)
            wj0.a r13 = r12.o
            java.lang.String r14 = "payments_exchange"
            java.lang.String r2 = r13.b(r14)
            if (r2 != 0) goto L95
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = "idempotencyTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r5)
            java.lang.String r5 = "idempotencyKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            ne0.j r13 = r13.f297952b
            r13.f(r14, r2)
        L95:
            p0i.b r13 = r12.f326752m
            x0i.g r13 = (x0i.g) r13
            ufm.n r13 = r13.c(r4, r2)
            r0.f326751w = r3
            java.lang.Object r14 = nim.a.b(r13, r0)
            if (r14 != r1) goto La6
            return r1
        La6:
            java.lang.String r13 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r13)
            return r14
        Lac:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Current rate should be present"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zzh.c.b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    @Override // nzh.c
    public final j0 c3(Object obj2, CryptoOrderDraft draft) {
        ExchangeOrder.Active result = (ExchangeOrder.Active) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(draft, "draft");
        return this.f326753n.b(result);
    }
}
