package com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add;

import aw0.f4;
import bq9.d;
import cli.y;
import cnc.t;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import cq9.f;
import cq9.g;
import cq9.m;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import w80.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements cq9.h {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ldd.b f79272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f79273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f79274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i90.b f79275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f79276t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(m stateMapper, b amountFormatter, ldd.b focusRequesterDelegate, g inputData, d splitItemizationDialogInputDataProvider, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(splitItemizationDialogInputDataProvider, "splitItemizationDialogInputDataProvider");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.o = amountFormatter;
        this.f79272p = focusRequesterDelegate;
        this.f79273q = inputData;
        this.f79274r = splitItemizationDialogInputDataProvider;
        this.f79275s = uuidUtils;
        SplitBillItem splitBillItem = inputData.f108051b;
        String str = splitBillItem != null ? splitBillItem.f79226b : null;
        this.f79276t = mra.d.b(this, new f(splitBillItem != null ? splitBillItem.f79227c : 0L, str == null ? "" : str, 0), stateMapper, null, false, 12);
        this.u = e.a(this, new t(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        this.f79272p.b(new f4("split_item_amount", true));
        H2(this.f79276t, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(22));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f79276t;
    }
}
