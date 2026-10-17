package com.revolut.feature.crypto.tfr.validation.impl.pob;

import bhi.c;
import bn5.e;
import bn5.i;
import bn5.n;
import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nm5.f;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements bn5.h {
    public final PlaceOfBirthScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f71046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f71047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f71048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71049s;

    public a(i stateMapper, PlaceOfBirthScreenContract$InputData inputData, n tfrCountryOfBirthPickerControllerInteractor, f updateCounterpartyDataInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tfrCountryOfBirthPickerControllerInteractor, "tfrCountryOfBirthPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(updateCounterpartyDataInteractor, "updateCounterpartyDataInteractor");
        this.o = inputData;
        this.f71046p = tfrCountryOfBirthPickerControllerInteractor;
        this.f71047q = updateCounterpartyDataInteractor;
        this.f71048r = d.b(this, new e(null), stateMapper, null, false, 12);
        this.f71049s = hx7.e.a(this, new c(this, 9));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71049s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f71048r;
    }
}
