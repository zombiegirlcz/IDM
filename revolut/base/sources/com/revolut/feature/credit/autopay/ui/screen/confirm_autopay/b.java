package com.revolut.feature.credit.autopay.ui.screen.confirm_autopay;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import naf.j;
import nk4.o;
import oki.h;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements nk4.b {
    public final ConfirmAutopayContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ck4.a f68640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj4.b f68641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pk4.a f68642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f68643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68644t;

    public b(ConfirmAutopayContract$InputData inputData, ck4.a autoPayRepaymentInteractor, wj4.b backUpCardInfoDialogFactory, pk4.a repaymentDayInfoDialogFactory, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(autoPayRepaymentInteractor, "autoPayRepaymentInteractor");
        Intrinsics.checkNotNullParameter(backUpCardInfoDialogFactory, "backUpCardInfoDialogFactory");
        Intrinsics.checkNotNullParameter(repaymentDayInfoDialogFactory, "repaymentDayInfoDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f68640p = autoPayRepaymentInteractor;
        this.f68641q = backUpCardInfoDialogFactory;
        this.f68642r = repaymentDayInfoDialogFactory;
        this.f68643s = d.b(this, new nk4.a(new Data(null, null, true, 3, null), false, inputData.getF68627c(), inputData.getD(), inputData.getF68625a().getF68537a()), stateMapper, null, false, 12);
        this.f68644t = e.a(this, new o(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        l.a1(this, rd0.e.n(rd0.e.b(this.f68640p.a(this.o.getF68625a())), h0.f322473a), null, null, new j(this, null, 24), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68644t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f68643s;
    }
}
