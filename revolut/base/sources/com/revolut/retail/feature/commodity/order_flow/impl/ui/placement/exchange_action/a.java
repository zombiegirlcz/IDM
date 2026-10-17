package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action;

import a7j.g;
import kotlin.jvm.internal.Intrinsics;
import p0i.b;
import rea.m;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f99882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f99883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f99884c;
    public final n d;
    public final xua.a e;

    public a(g exchangeOperationFactory, b fxOrderInteractor, m pocketDetailsInteractor, n walletInteractor, xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(exchangeOperationFactory, "exchangeOperationFactory");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f99882a = exchangeOperationFactory;
        this.f99883b = fxOrderInteractor;
        this.f99884c = pocketDetailsInteractor;
        this.d = walletInteractor;
        this.e = recurringPaymentInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a.a(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r76, gim.c r77) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a.b(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof h7j.d
            if (r3 == 0) goto L19
            r3 = r2
            h7j.d r3 = (h7j.d) r3
            int r4 = r3.f149907x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f149907x = r4
            goto L1e
        L19:
            h7j.d r3 = new h7j.d
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f149907x
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r1 = r3.u
            yhm.o.b(r2)
            goto L86
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.revolut.feature.exchange.models.ExchangeOrderSpec r7 = new com.revolut.feature.exchange.models.ExchangeOrderSpec
            wd6.h r8 = r1.e
            double r9 = r1.k
            java.math.BigDecimal r2 = r1.f99888g
            if (r2 == 0) goto L9b
            double r11 = r2.doubleValue()
            wd6.e r13 = r1.f99887c
            kotlin.Pair r14 = new kotlin.Pair
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r2 = r1.f99885a
            xi0.b r5 = r2.f99903a
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r15 = r1.f99886b
            xi0.b r6 = r15.f99903a
            r14.<init>(r5, r6)
            i7j.j r5 = r1.f
            i7j.j r6 = i7j.j.TOP
            if (r5 != r6) goto L68
            dj0.d r2 = md6.s.D(r2)
        L66:
            r15 = r2
            goto L6d
        L68:
            dj0.d r2 = md6.s.D(r15)
            goto L66
        L6d:
            r7.<init>(r8, r9, r11, r13, r14, r15)
            java.lang.String r2 = r1.v
            p0i.b r5 = r0.f99883b
            x0i.g r5 = (x0i.g) r5
            ufm.n r2 = r5.b(r7, r2)
            r3.u = r1
            r5 = 1
            r3.f149907x = r5
            java.lang.Object r2 = nim.a.b(r2, r3)
            if (r2 != r4) goto L86
            return r4
        L86:
            r9 = r2
            com.revolut.feature.exchange.models.ExchangeOrder$Active r9 = (com.revolut.feature.exchange.models.ExchangeOrder.Active) r9
            com.revolut.feature.exchange.models.ExchangeOrderInfo r2 = r9.f72129a
            xi0.b r4 = r2.e
            xi0.b r5 = r2.f
            wd6.h r8 = r2.f72139c
            wd6.e r6 = r2.d
            wd6.i r7 = r1.d
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult$Pending r3 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult$Pending
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L9b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Current rate should be present"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a.c(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }
}
