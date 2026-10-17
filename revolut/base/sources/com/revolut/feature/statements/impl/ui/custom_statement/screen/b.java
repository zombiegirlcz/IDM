package com.revolut.feature.statements.impl.ui.custom_statement.screen;

import a0e.w;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import hx7.e;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.z1;
import wzd.c;
import xzd.k;
import xzd.m;
import xzd.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements m {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f88348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zxd.c f88349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final phm.a f88350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l2j.a f88351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f88352t;
    public final hk0.a u;
    public final vyd.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n0e.b f88353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f88354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f88355y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(n stateMapper, i customisationInteractor, c customStatementDialogProvider, zxd.c statementsInteractor, ede.a languagePickerInteractor, l2j.a currencyChooserFlowFactory, w taxYearPeriodCalculator, hk0.a networkFileRepository, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandsFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(customisationInteractor, "customisationInteractor");
        Intrinsics.checkNotNullParameter(customStatementDialogProvider, "customStatementDialogProvider");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(languagePickerInteractor, "languagePickerInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(taxYearPeriodCalculator, "taxYearPeriodCalculator");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        this.o = customisationInteractor;
        this.f88348p = customStatementDialogProvider;
        this.f88349q = statementsInteractor;
        this.f88350r = languagePickerInteractor;
        this.f88351s = currencyChooserFlowFactory;
        this.f88352t = taxYearPeriodCalculator;
        this.u = networkFileRepository;
        this.v = dialogModelConfigurationFactory;
        this.f88353w = statementsNaviCommandsFactory;
        this.f88354x = d.b(this, new k(new Data(null, null, true, 3, null), CustomisationSelection.INSTANCE.getEMPTY(), null, false), stateMapper, null, false, 12);
        this.f88355y = q.b(0, 7, null);
        this.z = e.a(this, new xwd.a(this, 8));
    }

    @Override // yji.l
    public final void I1() {
        l2(new p(this, null, 0), new yi5.b(26));
    }

    public final CustomisationSelection I2() {
        return ((k) ((j2) this.f88354x.f22677a).getValue()).f309931b;
    }

    public final void J2(CustomisationSelection customisationSelection) {
        H2(this.f88354x, new fzd.n(customisationSelection, 6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final g getState() {
        return this.f88354x;
    }
}
