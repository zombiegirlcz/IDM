package com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import lk5.b;
import lk5.j;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final CommonRemittanceFieldDialogFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f70958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f70959q;

    public a(CommonRemittanceFieldDialogFlowContract$InputData inputData, j interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f70958p = interactor;
        this.f70959q = d.a(this, new c(this, 18));
    }

    @Override // yki.j
    public final void M0() {
        n2(new kze.h(this, null, 22), new whi.b(6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70959q;
    }
}
