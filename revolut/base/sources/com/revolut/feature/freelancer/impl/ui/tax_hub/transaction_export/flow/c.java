package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow;

import ang.f;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import hx7.e;
import java.time.LocalDate;
import ji1.m;
import k3k.k;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements k47.b {
    public final TaxHubTransactionExportFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zxd.c f74397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m47.a f74398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f74399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f74400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f74401t;

    public c(TaxHubTransactionExportFlowContract$InputData inputData, zxd.c statementsInteractor, m47.a taxHubDialogFactory, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(taxHubDialogFactory, "taxHubDialogFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f74397p = statementsInteractor;
        this.f74398q = taxHubDialogFactory;
        this.f74399r = userInteractor;
        LocalDate localDate = inputData.f74383a;
        LocalDate localDate2 = inputData.f74384b;
        FlowStep filter = (localDate == null || localDate2 == null) ? null : new TaxHubTransactionExportFlowContract$Step.Filter(localDate, localDate2);
        this.f74400s = cp5.d.a(this, filter == null ? TaxHubTransactionExportFlowContract$Step.PeriodPicker.f74392a : filter, f0.f322471a, new k(this, 2));
        this.f74401t = e.b(this, new TaxHubTransactionExportFlowContract$State(0));
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 25), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f74401t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74400s;
    }
}
