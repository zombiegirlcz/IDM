package com.revolut.feature.raffle.impl.flow;

import com.revolut.feature.raffle.impl.flow.RaffleFlowContract$Step;
import cp5.d;
import ghl.c;
import gta.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skd.i;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final RaffleFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f81639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f81640q;

    public a(RaffleFlowContract$InputData inputData, i slotManagerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        this.o = inputData;
        this.f81639p = slotManagerInteractor;
        c cVar = new c(this, 16);
        this.f81640q = d.a(this, RaffleFlowContract$Step.Raffle.f81637a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81640q;
    }
}
