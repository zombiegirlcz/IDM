package rzh;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p0i.b f258684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f258685n;
    public final wj0.a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p0i.b fxOrderInteractor, b orderFlowStatusDialogConfigurationProvider, wj0.a idempotencyKeyHolder) {
        super(orderFlowStatusDialogConfigurationProvider);
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        this.f258684m = fxOrderInteractor;
        this.f258685n = orderFlowStatusDialogConfigurationProvider;
        this.o = idempotencyKeyHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nzh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof rzh.d
            if (r0 == 0) goto L13
            r0 = r15
            rzh.d r0 = (rzh.d) r0
            int r1 = r0.f258683w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258683w = r1
            goto L18
        L13:
            rzh.d r0 = new rzh.d
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258683w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L7b
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            com.revolut.feature.exchange.models.ExchangeOrderSpec r4 = new com.revolut.feature.exchange.models.ExchangeOrderSpec
            wd6.h r5 = r14.f
            double r6 = r14.f96700r
            java.math.BigDecimal r15 = r14.f96693h
            if (r15 == 0) goto L81
            double r8 = r15.doubleValue()
            wd6.e r10 = r14.e
            kotlin.Pair r11 = new kotlin.Pair
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r15 = r14.f96689a
            xi0.b r15 = r15.f96683a
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r2 = r14.f96690b
            xi0.b r2 = r2.f96683a
            r11.<init>(r15, r2)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r14 = kyh.k.d(r14)
            dj0.d r12 = oyh.b.d(r14)
            r4.<init>(r5, r6, r8, r10, r11, r12)
            java.lang.String r14 = "payments_exchange"
            wj0.a r15 = r13.o
            java.lang.String r14 = r15.b(r14)
            if (r14 != 0) goto L6a
            java.lang.String r14 = "toString(...)"
            java.lang.String r14 = j6.a.p(r14)
        L6a:
            p0i.b r15 = r13.f258684m
            x0i.g r15 = (x0i.g) r15
            ufm.n r14 = r15.b(r4, r14)
            r0.f258683w = r3
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto L7b
            return r1
        L7b:
            java.lang.String r14 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            return r15
        L81:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Current rate should be present"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rzh.e.b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    @Override // nzh.c
    public final j0 c3(Object obj2, CryptoOrderDraft draft) {
        ExchangeOrder.Active result = (ExchangeOrder.Active) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(draft, "draft");
        return this.f258685n.b(result);
    }
}
