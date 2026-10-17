package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split;

import cli.y;
import hx7.e;
import k1a.g;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qee.s;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements w1a.b {
    public final RecurringPaymentsManageSplitContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f79888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f79889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79890r;

    public b(RecurringPaymentsManageSplitContract$InputData inputData, g recurringSplitInteractor, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringSplitInteractor, "recurringSplitInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f79888p = recurringSplitInteractor;
        this.f79889q = d.b(this, new w1a.a(0), stateMapper, null, false, 12);
        this.f79890r = e.a(this, new vvc.s(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f79888p.d(this.o.f79879a), null, null, new vrl.d(this, null, 19), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79890r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f79889q;
    }
}
