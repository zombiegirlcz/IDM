package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import ngm.n;
import oki.h;
import vkm.j2;
import y8a.g;
import ye1.m;
import yh4.b;
import yh4.c;
import yh4.f;
import yh4.i;
import yh4.j;
import yh4.k;
import yh4.x;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final SepaDirectDebitSetUpContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ey3.a f68367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b45.h f68368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uh4.a f68369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f68370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68371t;

    public a(SepaDirectDebitSetUpContract$InputData inputData, ey3.a interactor, b45.h loanAutopayInteractor, uh4.a dialogMapper, yh4.y stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(loanAutopayInteractor, "loanAutopayInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f68367p = interactor;
        this.f68368q = loanAutopayInteractor;
        this.f68369r = dialogMapper;
        this.f68370s = d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f68371t = e.a(this, new g(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(u0.m(n.K(new x(this, continuation, 0)), n.K(new x(this, continuation, 1))), new m(26)), null, null, new y83.d(this, continuation, 26), 3);
    }

    public final void J2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof yh4.d) {
            C2(new yh4.l(((yh4.a) zi0.c.I(((c) ((j2) this.f68370s.f22677a).getValue()).f313751a)).f313750b, ((yh4.d) event).f313752a));
            return;
        }
        boolean z = event instanceof yh4.e;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f68371t;
        if (z) {
            h.v2(aVar, new SepaDirectDebitSetUpContract$ModalStep.WaitForCoBorrowerExplainer(((yh4.e) event).f313753a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        boolean z3 = event instanceof f;
        k kVar = k.f313758a;
        if (z3) {
            C2(kVar);
            return;
        }
        if (event instanceof yh4.g) {
            I2();
        } else if (event instanceof yh4.h) {
            h.v2(aVar, SepaDirectDebitSetUpContract$ModalStep.SelectAccount.f68365a, ModalDestination.Style.POPUP.f98311a);
        } else {
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(kVar);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68371t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68370s;
    }
}
