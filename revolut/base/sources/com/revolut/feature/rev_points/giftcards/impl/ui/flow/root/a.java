package com.revolut.feature.rev_points.giftcards.impl.ui.flow.root;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qm2.c;
import qwb.b;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final RevPointsGiftcardsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f83695p;

    public a(RevPointsGiftcardsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f83695p = d.a(this, new c(this, 12));
    }

    @Override // yki.j
    public final void M0() {
        h.u2(this, this.f83695p, this.o.f83685a, null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83695p;
    }
}
