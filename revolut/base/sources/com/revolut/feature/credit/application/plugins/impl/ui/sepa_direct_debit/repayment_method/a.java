package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import ngm.n;
import oki.h;
import vkm.j2;
import w50.g;
import wde.f;
import wh4.b;
import wh4.c;
import wh4.i;
import wh4.j;
import wh4.k;
import wh4.x;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final SepaDirectDebitRepaymentMethodContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ey3.a f68360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f68361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68362r;

    public a(SepaDirectDebitRepaymentMethodContract$InputData inputData, ey3.a interactor, x stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f68360p = interactor;
        this.f68361q = d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f68362r = e.a(this, new f(this, 11));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(n.K(new uk9.h(this, continuation, 27)), new wgk.f(1)), null, null, new g(this, continuation, 23), 3);
    }

    public final void J2(i event) {
        x35.e eVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof wh4.e) {
            wh4.e eVar2 = (wh4.e) event;
            wh4.a aVar = (wh4.a) ((c) ((j2) this.f68361q.f22677a).getValue()).f297396a.getContent();
            if (aVar == null || (eVar = aVar.f297395b) == null) {
                return;
            }
            C2(new k(eVar, eVar2.f297398a));
            return;
        }
        if (event instanceof wh4.g) {
            h.v2(this.f68362r, SepaDirectDebitRepaymentMethodContract$ModalStep.SelectAccount.f68359a, ModalDestination.Style.POPUP.f98311a);
            return;
        }
        boolean z = event instanceof wh4.d;
        j jVar = j.f297402a;
        if (z) {
            C2(jVar);
        } else if (event instanceof wh4.h) {
            C2(jVar);
        } else {
            if (!(event instanceof wh4.f)) {
                throw new NoWhenBranchMatchedException();
            }
            I2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68362r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68361q;
    }
}
