package com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters;

import cli.g;
import cli.y;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import hx7.e;
import i2l.e0;
import ich.t;
import java.util.List;
import jch.i;
import jch.j;
import jch.k;
import jch.p;
import jch.r;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final lch.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f95619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f95620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95621r;

    public a(r stateMapper, InstrumentsCollectionFiltersControllerContract$InputData inputData, lch.a dialogProvider, t filtersMutator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(filtersMutator, "filtersMutator");
        this.o = dialogProvider;
        this.f95619p = filtersMutator;
        this.f95620q = d.b(this, new j(inputData.f95615b, inputData.f95616c), stateMapper, null, false, 12);
        this.f95621r = e.a(this, new p(this, 0));
    }

    public final void I2(k kVar) {
        InstrumentsCollectionFilterId instrumentsCollectionFilterId = kVar.f172803a;
        y yVar = this.f95620q;
        List list = ((j) ((j2) yVar.f22677a).getValue()).f172802b;
        InstrumentsCollectionFilter.ListFilter.Value valueC = adh.d.c(kVar.f172804b);
        this.f95619p.getClass();
        H2(yVar, new e0(t.b(list, instrumentsCollectionFilterId, valueC), 16));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95621r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f95620q;
    }
}
