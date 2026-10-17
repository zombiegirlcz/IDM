package com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow;

import ang.f;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements r85.a {
    public final LoanSelectBackupCardFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l35.b f70594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zwc.a f70595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f70596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f70597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f70598t;

    public b(LoanSelectBackupCardFlowContract$InputData inputData, l35.b loanInteractor, zwc.a selectPaymentFlowProvider, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(selectPaymentFlowProvider, "selectPaymentFlowProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f70594p = loanInteractor;
        this.f70595q = selectPaymentFlowProvider;
        this.f70596r = userInteractor;
        this.f70597s = e.b(this, new LoanSelectBackupCardFlowContract$State(null));
        this.f70598t = d8l.d.a(this, new r6f.i(this, 6));
    }

    public static final boolean I2(b bVar, LoanBackupCard loanBackupCard) {
        if (loanBackupCard instanceof LoanBackupCard.ExternalCard.Personal) {
            return ((LoanBackupCard.ExternalCard.Personal) loanBackupCard).f70132c.f268141h;
        }
        if ((loanBackupCard instanceof LoanBackupCard.ExternalCard.CoBorrower) || (loanBackupCard instanceof LoanBackupCard.Stale) || (loanBackupCard instanceof LoanBackupCard.None)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yki.j
    public final void M0() {
        l2(new qc8.b(this, null, 26), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f70597s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70598t;
    }
}
