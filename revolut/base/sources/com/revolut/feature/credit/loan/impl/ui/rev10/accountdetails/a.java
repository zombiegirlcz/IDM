package com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ky4.e;
import l35.b;
import m35.c;
import m35.f;
import m35.p;
import mra.d;
import oki.h;
import she.g;
import vkm.j2;
import y45.i;
import y4f.o;
import yji.l;
import z55.q;
import z55.t;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements t {
    public final e A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f70351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ra5.b f70352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LoanAccountDetailsScreenContract$InputData f70353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f70354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f70355t;
    public final m35.i u;
    public final b55.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f15.a f70356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r35.a f70357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f70358y;
    public final g z;

    public a(n stateMapper, b loanInteractor, i loanProductInteractor, ra5.b creditPostTerminationPlanInteractor, LoanAccountDetailsScreenContract$InputData inputData, f loanDialogMapper, p loanStateExplainerMapper, m35.i loanLateDisbursalDialogMapper, b55.b loanHelpRequestProvider, f15.a getCreditHelpExtension, r35.a loanCommandsFactory, c loanAutopayAccountMapper, g productAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(creditPostTerminationPlanInteractor, "creditPostTerminationPlanInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(loanStateExplainerMapper, "loanStateExplainerMapper");
        Intrinsics.checkNotNullParameter(loanLateDisbursalDialogMapper, "loanLateDisbursalDialogMapper");
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(loanCommandsFactory, "loanCommandsFactory");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        this.o = loanInteractor;
        this.f70351p = loanProductInteractor;
        this.f70352q = creditPostTerminationPlanInteractor;
        this.f70353r = inputData;
        this.f70354s = loanDialogMapper;
        this.f70355t = loanStateExplainerMapper;
        this.u = loanLateDisbursalDialogMapper;
        this.v = loanHelpRequestProvider;
        this.f70356w = getCreditHelpExtension;
        this.f70357x = loanCommandsFactory;
        this.f70358y = loanAutopayAccountMapper;
        this.z = productAccountDestinationResolver;
        this.A = new e(0);
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this.B = d.b(this, new q(data, data2, data3, data4, data5, od0.i.f224256b, null, null), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new yz4.b(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, vkm.q.Q(this.A, new o(continuation, this, 29)), null, null, new yy6.f(this, continuation, 11), 3);
    }

    public final Data I2() {
        return ((q) ((j2) this.B.f22677a).getValue()).f319502a;
    }

    public final void J2() {
        C1(new LoanKompotFeatureConfig.SelectBackupCardFlowNavigationDestination(this.f70353r.f70343a, (LoanBackupCard) zi0.c.I(((q) ((j2) this.B.f22677a).getValue()).d), false));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    public final void K2(LoanAccountDetailsScreenContract$ModalStep loanAccountDetailsScreenContract$ModalStep) {
        h.v2(this.C, loanAccountDetailsScreenContract$ModalStep, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
