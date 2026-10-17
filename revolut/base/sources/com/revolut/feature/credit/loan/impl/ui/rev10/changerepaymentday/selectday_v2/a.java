package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ky4.e;
import l35.b;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s20.c;
import s56.i;
import s65.f;
import s65.n;
import s65.s;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements s65.h {

    @NotNull
    public static final n Companion = new n();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n65.a f70412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f70413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f70414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70415s;

    public a(s stateMapper, LoanSelectNewRepaymentDayV2ScreenContract$InputData inputData, b loanInteractor, n65.a loanChangeRepaymentDayDialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanChangeRepaymentDayDialogMapper, "loanChangeRepaymentDayDialogMapper");
        this.o = loanInteractor;
        this.f70412p = loanChangeRepaymentDayDialogMapper;
        this.f70413q = new e(0);
        LoanDetails loanDetails = inputData.f70409b;
        this.f70414r = d.b(this, new f(loanDetails, loanDetails.f70146c, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f70415s = hx7.e.a(this, new c(26));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f70413q, new pti.d(this, continuation, 17)), null, null, new i(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70415s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f70414r;
    }
}
