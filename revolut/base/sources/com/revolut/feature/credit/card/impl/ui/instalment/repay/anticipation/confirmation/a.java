package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation;

import al4.m;
import cli.g;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nk4.o;
import ns4.e;
import ns4.i;
import oki.h;
import vt4.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements i {
    public final CreditCardAnticipationConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f69446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f69447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69448s;

    public a(CreditCardAnticipationConfirmationScreenContract$InputData inputData, m creditCardInstalmentInteractor, b creditCardDialogMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69445p = creditCardInstalmentInteractor;
        this.f69446q = creditCardDialogMapper;
        this.f69447r = d.b(this, new e(inputData.f69443c, inputData.d, inputData.e), stateMapper, null, false, 12);
        this.f69448s = hx7.e.a(this, new o(this, 14));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69448s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f69447r;
    }
}
