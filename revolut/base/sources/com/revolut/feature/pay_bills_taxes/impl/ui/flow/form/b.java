package com.revolut.feature.pay_bills_taxes.impl.ui.flow.form;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import yzb.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements zf9.b {
    public final wo1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FormFlowContract$InputData f78702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f78703q;

    public b(wo1.b interactor, FormFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f78702p = inputData;
        this.f78703q = d.a(this, new zba.a(this, 7));
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null, 12), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78703q;
    }
}
