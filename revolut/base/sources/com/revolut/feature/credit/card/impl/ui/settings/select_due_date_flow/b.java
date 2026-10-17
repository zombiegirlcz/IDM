package com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow;

import al4.n;
import d8l.d;
import dt4.p;
import dv4.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements dv4.b {
    public final CreditCardSelectDueDateFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.a f69649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f69650r;

    public b(CreditCardSelectDueDateFlowContract$InputData inputData, n creditCardInteractor, vt4.a creditCardBottomSheetMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardBottomSheetMapper, "creditCardBottomSheetMapper");
        this.o = inputData;
        this.f69648p = creditCardInteractor;
        this.f69649q = creditCardBottomSheetMapper;
        this.f69650r = d.a(this, new p(this, 5));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69650r;
    }
}
