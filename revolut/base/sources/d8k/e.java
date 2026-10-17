package d8k;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n5k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8k.a f112291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twg.c f112292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f112293c;

    public e(o8k.a transferDataObservable, twg.c flowInteractor, f transferQuoteChargesMapper) {
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(transferQuoteChargesMapper, "transferQuoteChargesMapper");
        this.f112291a = transferDataObservable;
        this.f112292b = flowInteractor;
        this.f112293c = transferQuoteChargesMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof d8k.a
            if (r2 == 0) goto L17
            r2 = r1
            d8k.a r2 = (d8k.a) r2
            int r3 = r2.f112287x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f112287x = r3
            goto L1e
        L17:
            d8k.a r2 = new d8k.a
            gim.c r1 = (gim.c) r1
            r2.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f112287x
            twg.c r5 = r0.f112292b
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L40
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r2 = r2.u
            yhm.o.b(r1)
            goto L65
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r1)
            goto L50
        L40:
            yhm.o.b(r1)
            o8k.a r1 = r0.f112291a
            ihm.j r1 = r1.f255130a
            r2.f112287x = r7
            java.lang.Object r1 = nim.a.c(r1, r2)
            if (r1 != r3) goto L50
            goto L5f
        L50:
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r1 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData) r1
            kotlin.jvm.internal.Intrinsics.h(r1)
            r2.u = r1
            r2.f112287x = r6
            java.lang.Object r2 = r5.x(r1, r2)
            if (r2 != r3) goto L60
        L5f:
            return r3
        L60:
            r16 = r2
            r2 = r1
            r1 = r16
        L65:
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r1 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r1
            if (r1 == 0) goto L91
            kotlin.jvm.internal.Intrinsics.h(r2)
            com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams r7 = r5.y(r2)
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig r6 = new com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig
            com.revolut.shared.feature.market_data.models.domain.models.Charges r1 = r1.f104755g
            com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r8 = r1.f104731a
            c4i.a r9 = c4i.a.EXCHANGE
            grl.k9 r1 = grl.k9.Payments
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r3 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r3 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r10 = com.google.android.gms.internal.mlkit_vision_face.a.h(r1, r3, r1)
            r14 = 0
            r15 = 2032(0x7f0, float:2.847E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.<init>(r6)
            return r2
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "OrderQuote cannot be null when requiring PaymentBreakdownAction"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d8k.e.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof d8k.c
            if (r0 == 0) goto L13
            r0 = r5
            d8k.c r0 = (d8k.c) r0
            int r1 = r0.f112289w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112289w = r1
            goto L18
        L13:
            d8k.c r0 = new d8k.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112289w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            o8k.a r5 = r4.f112291a
            ihm.j r5 = r5.f255130a
            r0.f112289w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r5 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData) r5
            com.revolut.feature.transfer.core.models.FundingSource r5 = r5.d
            xi0.b r5 = r5.f92241b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d8k.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof d8k.d
            if (r0 == 0) goto L13
            r0 = r5
            d8k.d r0 = (d8k.d) r0
            int r1 = r0.f112290w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112290w = r1
            goto L18
        L13:
            d8k.d r0 = new d8k.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112290w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            o8k.a r5 = r4.f112291a
            ihm.j r5 = r5.f255130a
            r0.f112290w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r5 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData) r5
            xi0.b r5 = r5.f102235b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d8k.e.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r0 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r24) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8k.e.d(gim.c):java.lang.Object");
    }

    @Override // n5k.a
    public final Object e(Continuation continuation) {
        throw new IllegalStateException("FeeBreakdownAction Dialog not supported in P2P");
    }
}
