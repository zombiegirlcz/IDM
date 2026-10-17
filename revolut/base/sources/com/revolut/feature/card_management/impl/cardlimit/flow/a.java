package com.revolut.feature.card_management.impl.cardlimit.flow;

import com.revolut.feature.card_management.impl.cardlimit.flow.CardLimitFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mz2.b;
import mz2.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f64827p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        g gVar = new g(this, 29);
        this.f64827p = d.a(this, CardLimitFlowContract$Step.CardLimitOverview.f64825a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64827p;
    }
}
