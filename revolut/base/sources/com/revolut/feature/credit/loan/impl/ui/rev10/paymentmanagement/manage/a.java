package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage;

import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import imk.p0;
import j2c.n;
import j75.f;
import j75.g;
import j75.k;
import kotlin.jvm.internal.Intrinsics;
import m35.c;
import mra.d;
import oki.h;
import y45.i;
import yi5.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements g {
    public final LoanManageRepaymentsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f70476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f70477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f70478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70479s;

    public a(LoanManageRepaymentsControllerContract$InputData inputData, i loanProductInteractor, c loanAutopayAccountMapper, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f70476p = loanProductInteractor;
        this.f70477q = loanAutopayAccountMapper;
        this.f70478r = d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f70479s = e.a(this, new n(this, 13));
    }

    @Override // yji.l
    public final void I1() {
        l2(new p0(this, null, 18), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70479s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70478r;
    }
}
