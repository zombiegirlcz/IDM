package com.revolut.feature.credit.card.impl.ui.instalment.create;

import al4.m;
import al4.n;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$Step;
import hx7.e;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import vr4.f;
import vr4.k;
import vr4.l;
import vr4.s;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements k {
    public final InstalmentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vt4.b f69342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f69343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f69344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f69345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f69346t;
    public final wr4.a u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f69347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f69348x;

    public b(InstalmentFlowContract$InputData inputData, vt4.b creditCardDialogMapper, m creditCardInstalmentInteractor, f createInstalmentFlowInteractor, s instalmentIntroConfigInteractor, n creditCardInteractor, wr4.a ineligibilityDialogExplainerMapper, ang.f userInteractor) {
        InstalmentFlowContract$State instalmentFlowContract$State;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(createInstalmentFlowInteractor, "createInstalmentFlowInteractor");
        Intrinsics.checkNotNullParameter(instalmentIntroConfigInteractor, "instalmentIntroConfigInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(ineligibilityDialogExplainerMapper, "ineligibilityDialogExplainerMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f69342p = creditCardDialogMapper;
        this.f69343q = creditCardInstalmentInteractor;
        this.f69344r = createInstalmentFlowInteractor;
        this.f69345s = instalmentIntroConfigInteractor;
        this.f69346t = creditCardInteractor;
        this.u = ineligibilityDialogExplainerMapper;
        this.v = userInteractor;
        if (inputData instanceof InstalmentFlowContract$InputData.Create) {
            InstalmentFlowContract$InputData.Create create = (InstalmentFlowContract$InputData.Create) inputData;
            instalmentFlowContract$State = new InstalmentFlowContract$State(create.f69320a, h0.f322473a, null, create.f69321b, null);
        } else {
            if (!(inputData instanceof InstalmentFlowContract$InputData.CreateWithTransactions)) {
                throw new NoWhenBranchMatchedException();
            }
            InstalmentFlowContract$InputData.CreateWithTransactions createWithTransactions = (InstalmentFlowContract$InputData.CreateWithTransactions) inputData;
            String str = createWithTransactions.f69322a;
            Set set = createWithTransactions.f69323b;
            InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType transactionType = createWithTransactions.f69324c;
            instalmentFlowContract$State = new InstalmentFlowContract$State(str, set, null, transactionType.f69326b, transactionType.getF69325a());
        }
        this.f69347w = e.b(this, instalmentFlowContract$State);
        this.f69348x = d8l.d.a(this, new vh9.b(this, 20));
    }

    public static InstalmentFlowContract$Step I2(InstalmentFlowContract$InputData instalmentFlowContract$InputData) {
        if (instalmentFlowContract$InputData instanceof InstalmentFlowContract$InputData.Create) {
            return InstalmentFlowContract$Step.TransactionsList.f69341a;
        }
        if (!(instalmentFlowContract$InputData instanceof InstalmentFlowContract$InputData.CreateWithTransactions)) {
            throw new NoWhenBranchMatchedException();
        }
        InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType transactionType = ((InstalmentFlowContract$InputData.CreateWithTransactions) instalmentFlowContract$InputData).f69324c;
        if (transactionType instanceof InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType.Debit) {
            return InstalmentFlowContract$Step.Term.Debit.f69340a;
        }
        if (transactionType instanceof InstalmentFlowContract$InputData.CreateWithTransactions.TransactionType.Credit) {
            return InstalmentFlowContract$Step.Term.Credit.f69339a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new l(this, 0));
    }

    @Override // qki.e
    public final d getState() {
        return this.f69347w;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69348x;
    }
}
