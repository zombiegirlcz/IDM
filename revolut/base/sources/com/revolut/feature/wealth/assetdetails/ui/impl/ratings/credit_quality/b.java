package com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality;

import cli.g;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qee.s;
import u4h.c;
import v4h.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements f {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f95430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95431q;

    public b(CreditQualityScreenContract$InputData inputData, s stateMapper, c infoDialogFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(infoDialogFactory, "infoDialogFactory");
        this.o = infoDialogFactory;
        this.f95430p = d.b(this, new v4h.d(inputData.f95427a), stateMapper, null, false, 12);
        this.f95431q = e.a(this, new v48.d(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95431q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f95430p;
    }
}
