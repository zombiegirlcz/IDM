package com.revolut.feature.apm.multibanco.impl.ui.home;

import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import lx1.d;
import oki.h;
import yzb.c;
import z72.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final MultibancoHomeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f62594q;

    public a(MultibancoHomeFlowContract$InputData inputData, d apmContactsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        this.o = inputData;
        this.f62593p = apmContactsInteractor;
        yz4.b bVar = new yz4.b(this, 17);
        this.f62594q = cp5.d.a(this, MultibancoHomeFlowContract$Step.Area.f62592a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new c(this, null, 4), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62594q;
    }
}
