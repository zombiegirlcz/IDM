package com.revolut.feature.credit.card.impl.ui.statement_financing.setup;

import al4.m;
import boh.f;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import inh.g;
import is6.t;
import iw4.k;
import iw4.l;
import iw4.n;
import iw4.r;
import iw4.s;
import knd.g0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.r1;
import om4.x2;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements n {

    @NotNull
    public static final r Companion = new r();
    public final CreditCardStatementFinancingSetupScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final al4.n f69776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f69777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f69778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f69779t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(CreditCardStatementFinancingSetupScreenContract$InputData inputData, m creditCardInstalmentInteractor, al4.n creditCardInteractor, j60.a bottomDialogExtension, a dialogExplainerMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogExplainerMapper, "dialogExplainerMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69775p = creditCardInstalmentInteractor;
        this.f69776q = creditCardInteractor;
        this.f69777r = bottomDialogExtension;
        this.f69778s = dialogExplainerMapper;
        this.f69779t = d.b(this, new l(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new in1.a(this, 18));
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final k I2() {
        return (k) zi0.c.I(((l) ((j2) this.f69779t.f22677a).getValue()).f168950a);
    }

    public final void J2() {
        CreditCardStatementFinancingSetupScreenContract$InputData creditCardStatementFinancingSetupScreenContract$InputData = this.o;
        String str = creditCardStatementFinancingSetupScreenContract$InputData.f69768a;
        r1 r1Var = (r1) this.f69775p;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.b1(this, rd0.e.n(new g0(f.e(q.q(u0.m(nim.a.v(r1Var.t(str, hVar), new iui.a(23)), ((x2) this.f69776q).p(creditCardStatementFinancingSetupScreenContract$InputData.f69768a, hVar))), new iw4.q(this, 0)), new iaf.d(this, null, 24), 1), h0.f322473a), null, new s(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    public final void K2(dj0.d dVar) {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.n(nim.a.v(ngm.n.K(new g(this, dVar, continuation, 4)), new t(I2(), dVar, 15)), h0.f322473a), null, new s(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69779t;
    }
}
