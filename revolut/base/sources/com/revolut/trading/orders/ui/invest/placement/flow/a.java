package com.revolut.trading.orders.ui.invest.placement.flow;

import bfl.g;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.invest.placement.flow.InvestOrderFlowContract$Step;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import cp5.d;
import dfl.r;
import hsc.c;
import java.math.BigDecimal;
import java.util.UUID;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import oki.h;
import wtl.b;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final InvestOrderContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f106840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f106841q;

    public a(InvestOrderContract$InputData inputData, c scaPromptShotDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(scaPromptShotDialogProvider, "scaPromptShotDialogProvider");
        this.o = inputData;
        this.f106840p = scaPromptShotDialogProvider;
        n f91696a = inputData.getF91696a();
        UUID f91697b = inputData.getF91697b();
        g d = inputData.getD();
        r0 f91698c = inputData.getF91698c();
        BigDecimal e = inputData.getE();
        boolean f = inputData.getF();
        sel.a f91699g = inputData.getF91699g();
        Amount f91700h = inputData.getF91700h();
        r i = inputData.getI();
        this.f106841q = d.a(this, new InvestOrderFlowContract$Step.Edit(new InvestOrderEditScreenContract$InputData(f91696a, f91697b, d, f91698c, e, f, f91699g, f91700h, i != null ? v04.b.K(i) : null)), f0.f322471a, new wtj.c(this, 2));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106841q;
    }
}
