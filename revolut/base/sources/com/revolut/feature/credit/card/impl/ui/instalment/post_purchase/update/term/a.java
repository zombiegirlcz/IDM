package com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term;

import akg.n;
import al4.m;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentChangeTermQuote;
import gs4.i;
import java.util.NoSuchElementException;
import jlh.g;
import js4.e;
import js4.f;
import js4.k;
import js4.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.r1;
import skm.a2;
import vkm.j2;
import vkm.q;
import vt4.b;
import w4l.j;
import yji.l;
import zh9.u0;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements f {
    public final CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f69429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f69430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f69431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f69432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f69433t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData inputData, i instalmentDialogMapper, m creditCardInstalmentInteractor, ang.f userInteractor, b creditCardDialogMapper, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instalmentDialogMapper, "instalmentDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69429p = instalmentDialogMapper;
        this.f69430q = creditCardInstalmentInteractor;
        this.f69431r = userInteractor;
        this.f69432s = creditCardDialogMapper;
        this.u = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new jnf.d(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        K2();
    }

    public final js4.d I2() {
        return (js4.d) c.I(((e) ((j2) this.u.f22677a).getValue()).f178124a);
    }

    public final void J2(int i) {
        for (CreditCardInstalmentChangeTermQuote.UpdatedInstalment selectedInstalment : I2().f178121a.f68792b) {
            if (selectedInstalment.f68796a == i) {
                js4.d dVarI2 = I2();
                CreditCardInstalmentChangeTermQuote quote = dVarI2.f178121a;
                dj0.d principalAmount = dVarI2.f178123c;
                wi0.b countryCode = dVarI2.d;
                int i2 = dVarI2.e;
                Intrinsics.checkNotNullParameter(quote, "quote");
                Intrinsics.checkNotNullParameter(selectedInstalment, "selectedInstalment");
                Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                H2(this.u, new g(new js4.d(quote, selectedInstalment, principalAmount, countryCode, i2), 15));
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
        a2 a2Var = this.f69433t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        n nVarV = nim.a.v(this.f69431r.j(j.f294644c), k.f);
        CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData creditCardEditPostPurchaseInstalmentTermScreenContract$InputData = this.o;
        this.f69433t = l.a1(this, rd0.e.n(nim.a.u(new js4.l(this, null), q.R(u0.m(nVarV, ((r1) this.f69430q).k(creditCardEditPostPurchaseInstalmentTermScreenContract$InputData.f69419a, creditCardEditPostPurchaseInstalmentTermScreenContract$InputData.f69420b, w4l.h.f294642c)), new hr4.b(3, 4, continuation))), h0.f322473a), null, null, new jij.h(this, continuation, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
