package com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest;

import cli.g;
import cli.y;
import ghl.c;
import gv4.f;
import gv4.k;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements gv4.h {
    public final CreditCardAccruedInterestsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f69670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69671q;

    public a(CreditCardAccruedInterestsScreenContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69670p = d.b(this, new f(inputData.f69667b, inputData.f69668c), stateMapper, null, false, 12);
        this.f69671q = e.a(this, new c(this, 19));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69671q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f69670p;
    }
}
