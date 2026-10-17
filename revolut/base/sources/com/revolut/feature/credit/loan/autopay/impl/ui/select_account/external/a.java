package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external;

import cli.y;
import h43.q;
import h45.f;
import h45.g;
import h45.l;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements g {
    public final b45.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f70296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70297q;

    public a(b45.h loanAutopayInteractor, l stateMapper) {
        Intrinsics.checkNotNullParameter(loanAutopayInteractor, "loanAutopayInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = loanAutopayInteractor;
        m70.a.c(t0.f186434a);
        this.f70296p = d.b(this, new f(new x35.h("")), stateMapper, null, false, 12);
        this.f70297q = e.a(this, new q(2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70297q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70296p;
    }
}
