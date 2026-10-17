package com.revolut.trading.orders.ui.invest.placement.wrapper_flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import d8l.d;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import nii.y0;
import nii.z;
import s99.i;
import t99.k;
import tx0.g4;
import u83.f;
import uea.e;
import un8.j;
import vul.c;
import vul.h;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends uul.b {
    public final InvestOrderContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f107021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f107022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f107023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f107024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f107025t;
    public final n u;
    public final UUID v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.i f107026w;

    public b(InvestOrderContract$InputData inputData, gte.a featureToggleInteractor, i exchangeGlobalAccessInteractor, k exchangeGlobalAccessFlowProvider, h noteSellOrderInputDataBuilder, c bondOrderInputDataBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(noteSellOrderInputDataBuilder, "noteSellOrderInputDataBuilder");
        Intrinsics.checkNotNullParameter(bondOrderInputDataBuilder, "bondOrderInputDataBuilder");
        this.o = inputData;
        this.f107021p = featureToggleInteractor;
        this.f107022q = exchangeGlobalAccessInteractor;
        this.f107023r = exchangeGlobalAccessFlowProvider;
        this.f107024s = noteSellOrderInputDataBuilder;
        this.f107025t = bondOrderInputDataBuilder;
        this.u = inputData.getF91696a();
        this.v = inputData.getF91697b();
        this.f107026w = d.a(this, new umd.n(this, 13));
    }

    public static final void I2(b bVar) {
        bVar.getClass();
        l.a1(bVar, bVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.trading_order_error_create, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new e(bVar, null, 25), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b r7, com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.J2(com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b, com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData, gim.c):java.lang.Object");
    }

    public final void K2(InvestOrderContract$InputData investOrderContract$InputData) {
        l2(new j(this, investOrderContract$InputData, null, 11), new g4(1, this, b.class, "handleInitialisationError", "handleInitialisationError(Ljava/lang/Throwable;)Z", 0, 25));
    }

    @Override // yki.j
    public final void M0() {
        if (!((jte.d) this.f107021p).c(TradingOrdersApi$Toggles.McyActivationGate.f106791c)) {
            K2(this.o);
            return;
        }
        l2(new f(this, null, 26), new g4(1, this, b.class, "handleInitialisationError", "handleInitialisationError(Ljava/lang/Throwable;)Z", 0, 26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f107026w;
    }
}
