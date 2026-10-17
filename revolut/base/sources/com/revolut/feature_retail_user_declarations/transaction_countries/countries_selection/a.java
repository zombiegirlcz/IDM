package com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection;

import cli.y;
import hx7.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;
import q5g.f0;
import qci.c;
import qci.g;
import qci.j;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements g {
    public final CountriesSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f97762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97763q;

    public a(CountriesSelectionScreenContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        Set set = inputData.i;
        m70.a.c(t0.f186434a);
        this.f97762p = d.b(this, new c("", set), stateMapper, null, false, 12);
        this.f97763q = e.a(this, new f0(this, 14));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97763q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f97762p;
    }
}
