package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments;

import al4.m;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuotes;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lk4.g;
import lp2.c;
import ls4.f;
import ls4.j;
import ls4.n;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ql4.v;
import vkm.j2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements j {

    @NotNull
    public static final n Companion = new n();
    public final CreditCardChooseInstalmentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f69439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69440r;

    public a(CreditCardChooseInstalmentsScreenContract$InputData inputData, m creditCardInstalmentInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69438p = creditCardInstalmentInteractor;
        this.f69439q = d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f69440r = e.a(this, new c(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final ls4.e I2() {
        return (ls4.e) zi0.c.I(((f) ((j2) this.f69439q.f22677a).getValue()).f199614a);
    }

    public final void J2() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(nim.a.v(ngm.n.K(new l40.j(this, continuation, 12)), new ls4.m(this, 0)), h0.f322473a), null, null, new lph.h(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69440r;
    }

    public final void K2(int i) {
        ls4.e eVarI2 = I2();
        CreditCardInstalmentAnticipationQuotes anticipationQuote = eVarI2.f199612b;
        v instalmentType = eVarI2.f199613c;
        Intrinsics.checkNotNullParameter(anticipationQuote, "anticipationQuote");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        H2(this.f69439q, new g(new ls4.e(i, anticipationQuote, instalmentType), 26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69439q;
    }
}
