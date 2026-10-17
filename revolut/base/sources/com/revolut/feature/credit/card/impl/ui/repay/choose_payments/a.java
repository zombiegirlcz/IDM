package com.revolut.feature.credit.card.impl.ui.repay.choose_payments;

import al4.m;
import al4.n;
import ang.f;
import au.c0;
import cli.y;
import com.revolut.data.model.Data;
import eq4.g;
import eu4.b0;
import eu4.u;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import om4.r1;
import om4.w;
import om4.x2;
import w4l.i;
import w4l.j;
import wsg.b;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements u {
    public final CreditCardChoosePaymentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f69564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f69565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f69566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f69567t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(CreditCardChoosePaymentsScreenContract$InputData inputData, n creditCardInteractor, f userInteractor, w creditCardBoletoInteractor, m creditCardInstalmentInteractor, b walletInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardBoletoInteractor, "creditCardBoletoInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69563p = creditCardInteractor;
        this.f69564q = userInteractor;
        this.f69565r = creditCardBoletoInteractor;
        this.f69566s = creditCardInstalmentInteractor;
        this.f69567t = walletInteractor;
        this.u = d.b(this, new eu4.n(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new b0(0));
    }

    @Override // yji.l
    public final void I1() {
        CreditCardChoosePaymentsScreenContract$InputData creditCardChoosePaymentsScreenContract$InputData = this.o;
        String str = creditCardChoosePaymentsScreenContract$InputData.f69561a;
        x2 x2Var = (x2) this.f69563p;
        j jVar = j.f294644c;
        akg.n nVarH = x2Var.h(str, jVar);
        String facilityId = creditCardChoosePaymentsScreenContract$InputData.f69561a;
        r1 r1Var = (r1) this.f69566s;
        i loadingStrategy = i.f294643c;
        cxe.u uVarT = r1Var.t(facilityId, loadingStrategy);
        w wVar = this.f69565r;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarC = wVar.f226728c.c(facilityId, yw4.f.PAYMENT_OPTION_BOLETO, w4l.h.f294642c);
        od0.i.Companion.getClass();
        Continuation continuation = null;
        Flow flowH = xam.a.h(new c0(continuation, wVar, facilityId, 19), nVarC);
        l.a1(this, rd0.e.n(boh.f.e(nim.a.u(new d4f.m(2, 14, continuation), u0.m(u0.i(nVarH, uVarT, flowH), nim.a.v(this.f69564q.j(jVar), eu4.c0.f))), new g(this, 29)), h0.f322473a), null, null, new enb.f(this, continuation, 21), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
