package com.revolut.feature.credit.card.impl.ui.documents_rates;

import al4.n;
import an4.e;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import lt4.d;
import oki.h;
import om4.x2;
import or4.f;
import or4.i;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements f {
    public final CreditCardDocumentsRatesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f69289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f69290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f69292t;

    public a(CreditCardDocumentsRatesScreenContract$InputData inputData, n creditCardInteractor, e navigationFactory, d creditCardDialogModelMapper, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69288p = creditCardInteractor;
        this.f69289q = navigationFactory;
        this.f69290r = creditCardDialogModelMapper;
        this.f69291s = hx7.e.a(this, new i(this, 0));
        this.f69292t = mra.d.b(this, new or4.e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardDocumentsRatesScreenContract$InputData creditCardDocumentsRatesScreenContract$InputData = this.o;
        String str = creditCardDocumentsRatesScreenContract$InputData.f69286a;
        x2 x2Var = (x2) this.f69288p;
        akg.n nVarD = x2Var.d(str);
        String str2 = creditCardDocumentsRatesScreenContract$InputData.f69286a;
        w4l.h hVar = w4l.h.f294642c;
        l.a1(this, rd0.e.n(nim.a.v(u0.i(nVarD, x2Var.E(str2, hVar), x2Var.h(str2, hVar)), new or4.h(0)), h0.f322473a), null, null, new oli.f(this, null, 17), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69291s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f69292t;
    }
}
