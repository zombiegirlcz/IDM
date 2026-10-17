package com.revolut.retail.feature.commodity.order_flow.impl.ui;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.CommodityOrderFlowContract$Step;
import cp5.d;
import hsc.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import x6j.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final wj0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CommodityOrderFlowContract$InputData f99816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f99817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f99818r;

    public a(wj0.a idempotencyKeyHolder, CommodityOrderFlowContract$InputData inputData, c scaPromptShotDialogProvider) {
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(scaPromptShotDialogProvider, "scaPromptShotDialogProvider");
        this.o = idempotencyKeyHolder;
        this.f99816p = inputData;
        this.f99817q = scaPromptShotDialogProvider;
        x2g.b bVar = new x2g.b(this, 7);
        this.f99818r = d.a(this, CommodityOrderFlowContract$Step.Edit.f99812a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final void I1() {
        this.o.a("payments_exchange");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f99818r;
    }
}
