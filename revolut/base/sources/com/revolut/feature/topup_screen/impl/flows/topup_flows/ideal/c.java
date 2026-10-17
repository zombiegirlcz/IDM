package com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal;

import d8l.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements lze.b {
    public final IdealTopUpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f91001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f91002q;

    public c(IdealTopUpFlowContract$InputData inputData, y51.a externalCardsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        this.o = inputData;
        this.f91001p = externalCardsInteractor;
        this.f91002q = d.a(this, new lp2.c(this, 18));
    }

    @Override // yki.j
    public final void M0() {
        l2(new ll6.i(this, (Continuation) null, 29), new o(this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91002q;
    }
}
