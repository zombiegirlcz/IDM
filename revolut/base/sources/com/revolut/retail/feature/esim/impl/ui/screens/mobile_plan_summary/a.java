package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary;

import bej.m;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ModalStep;
import hx7.e;
import i90.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import pmj.f;
import pmj.g;
import pmj.j;
import pmj.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements j {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final unj.j f101410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f101411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f101412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101413s;

    public a(b uuidUtils, n stateMapper, m esimStatementsInteractor, unj.j esimStatementsDialogBuilder) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsDialogBuilder, "esimStatementsDialogBuilder");
        this.o = esimStatementsInteractor;
        this.f101410p = esimStatementsDialogBuilder;
        this.f101411q = wp5.y.u(uuidUtils, "toString(...)");
        this.f101412r = d.b(this, k.f25028a, stateMapper, new l(this), false, 8);
        this.f101413s = e.a(this, new pj9.m(this, 18));
    }

    public final void I2(pmj.h parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        boolean z = parcel instanceof f;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f101413s;
        if (z) {
            h.v2(aVar, new EsimMobilePlanSummaryScreenContract$ModalStep.IncludedCountries(((f) parcel).f237599a), ModalDestination.Style.POPUP.f98311a);
        } else {
            if (!(parcel instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            g gVar = (g) parcel;
            h.v2(aVar, new EsimMobilePlanSummaryScreenContract$ModalStep.PerkInfoBottomSheet(gVar.f237601b, gVar.f237600a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101413s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101412r;
    }
}
