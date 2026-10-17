package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import org.jetbrains.annotations.NotNull;
import v60.e;
import yik.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final c7j.a Companion = new c7j.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f99820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f99821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f99822c;
    public final e d;

    public a(xv5.a commodityInteractor, t pricingPlanInteractor, h pricingPlanStringMapper, sf0.h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(commodityInteractor, "commodityInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f99820a = pricingPlanInteractor;
        this.f99821b = pricingPlanStringMapper;
        this.f99822c = serverErrorParser;
        this.d = serverErrorsProvider;
    }

    public static z b(TextLocalisedClause textLocalisedClause) {
        return new z(textLocalisedClause, null, null, new TextLocalisedClause(R$string.fx_orders_status_action_retry, null, null, 14), null, null, false, null, null, null, null, null, null, 32734);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c7j.c
            if (r0 == 0) goto L13
            r0 = r7
            c7j.c r0 = (c7j.c) r0
            int r1 = r0.f22040x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22040x = r1
            goto L18
        L13:
            c7j.c r0 = new c7j.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22040x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xi0.b r6 = r0.u
            yhm.o.b(r7)
            goto L69
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            wd6.e r7 = r6.f99887c
            wd6.e r2 = wd6.e.BUY
            if (r7 != r2) goto L3f
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r6 = r6.f99885a
            xi0.b r6 = r6.f99903a
            goto L43
        L3f:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r6 = r6.f99886b
            xi0.b r6 = r6.f99903a
        L43:
            ffk.t r7 = r5.f99820a
            efm.r r7 = r7.n()
            c2f.m r2 = new c2f.m
            r4 = 19
            r2.<init>(r4)
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r2, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r6
            r0.f22040x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            java.util.List r7 = (java.util.List) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.util.ArrayList r7 = xv5.a.a(r7, r6)
            hha.u r0 = xv5.a.b(r6)
            i7j.b r1 = new i7j.b
            r1.<init>(r6, r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a.a(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a.c(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }
}
