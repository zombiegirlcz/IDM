package com.revolut.feature.credit.card.impl.ui.instalment.term;

import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import cqh.m;
import dmj.e0;
import dt4.o;
import gs4.i;
import gs4.s;
import hx7.e;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import te0.w;
import tof.i7;
import tof.s9;
import tof.xa;
import vkm.j2;
import vkm.q;
import w4l.j;
import whf.p;
import yji.l;
import zh9.u0;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements dt4.h {
    public final InstalmentTermScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f69523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f69524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f69525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f69526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final whf.b f69527t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(InstalmentTermScreenContract$InputData inputData, i instalmentDialogMapper, a instalmentQuoteScreenInteractor, s transactionsOverviewControllerProvider, f userInteractor, whf.b transactionItemsProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instalmentDialogMapper, "instalmentDialogMapper");
        Intrinsics.checkNotNullParameter(instalmentQuoteScreenInteractor, "instalmentQuoteScreenInteractor");
        Intrinsics.checkNotNullParameter(transactionsOverviewControllerProvider, "transactionsOverviewControllerProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69523p = instalmentDialogMapper;
        this.f69524q = instalmentQuoteScreenInteractor;
        this.f69525r = transactionsOverviewControllerProvider;
        this.f69526s = userInteractor;
        this.f69527t = transactionItemsProvider;
        this.u = d.b(this, new dt4.f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new dgj.h(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        K2();
    }

    public final dt4.e I2() {
        return (dt4.e) c.I(((dt4.f) ((j2) this.u.f22677a).getValue()).f117367a);
    }

    public final void J2(int i) {
        for (ql4.s selectedQuote : I2().f117364a) {
            if (selectedQuote.f247179a == i) {
                dt4.e eVarI2 = I2();
                List instalmentQuotes = eVarI2.f117364a;
                dj0.d principalAmount = eVarI2.f117366c;
                wi0.b countryCode = eVarI2.d;
                p transactionsContent = eVarI2.e;
                Intrinsics.checkNotNullParameter(instalmentQuotes, "instalmentQuotes");
                Intrinsics.checkNotNullParameter(selectedQuote, "selectedQuote");
                Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                H2(this.u, new e0(new dt4.e(instalmentQuotes, selectedQuote, principalAmount, countryCode, transactionsContent), 25));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2() {
        InstalmentTermScreenContract$InputData instalmentTermScreenContract$InputData = this.o;
        Set f69514a = instalmentTermScreenContract$InputData.getF69514a();
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new s9(f69514a), new xa(instalmentTermScreenContract$InputData.getF69515b())};
        cVar.getClass();
        t38.e eVarM = u0.m(rd0.e.b(whf.b.a(this.f69527t, w.h(i7.c.a(i7VarArr)), null, null, null, 14)), nim.a.v(this.f69526s.j(j.f294644c), o.f));
        h0 h0Var = h0.f322473a;
        l.a1(this, new vkm.y(new a35.j(2, 16, null), rd0.e.e(new m(q.P(mo3.a.g(rd0.e.n(eVarM, h0Var), null, new dmb.m(25), 1), 1), this, 14), h0Var, new a82.q(3, 11, null))), null, null, new dob.c(this, null, 15), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
