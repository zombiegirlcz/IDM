package com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow;

import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.RevIQFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vh9.b;
import vqd.c;
import vqd.d;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements c {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f87879p;

    public a(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f87879p = d8l.d.a(this, new b(this, 18));
    }

    @Override // yki.j
    public final void M0() {
        h.u2(this, this.f87879p, RevIQFlowContract$Step.Home.f87877a, null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87879p;
    }
}
