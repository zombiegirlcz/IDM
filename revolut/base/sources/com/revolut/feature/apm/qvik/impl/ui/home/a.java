package com.revolut.feature.apm.qvik.impl.ui.home;

import com.revolut.feature.apm.qvik.impl.ui.home.QvikHomeFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import lx1.d;
import oki.h;
import omg.e;
import p5f.c;
import pc2.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f62810p;

    public a(d apmContactsInteractor) {
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        this.o = apmContactsInteractor;
        c cVar = new c(this, 11);
        this.f62810p = cp5.d.a(this, QvikHomeFlowContract$Step.Area.f62809a, f0.f322471a, cVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new e(this, null, 27), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62810p;
    }
}
