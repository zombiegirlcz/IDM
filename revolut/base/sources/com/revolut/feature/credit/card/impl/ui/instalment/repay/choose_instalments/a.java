package com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments;

import al4.m;
import al4.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import om4.r1;
import om4.x2;
import org.jetbrains.annotations.NotNull;
import ql4.v;
import sxe.g;
import up5.k;
import us4.j;
import us4.o;
import us4.p;
import us4.r;
import vkm.j2;
import vkm.q;
import vkm.t0;
import w4l.i;
import yji.l;
import zh9.u0;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements j {

    @NotNull
    public static final o Companion = new o();
    public final CreditCardChooseFutureInstalmentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f69468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f69469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69470s;

    public a(CreditCardChooseFutureInstalmentsScreenContract$InputData inputData, m creditCardInstalmentInteractor, n creditCardInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69467p = creditCardInstalmentInteractor;
        this.f69468q = creditCardInteractor;
        this.f69469r = d.b(this, new us4.h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f69470s = e.a(this, new umd.n(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarV;
        CreditCardChooseFutureInstalmentsScreenContract$InputData creditCardChooseFutureInstalmentsScreenContract$InputData = this.o;
        v vVar = creditCardChooseFutureInstalmentsScreenContract$InputData.f69464c;
        String str = creditCardChooseFutureInstalmentsScreenContract$InputData.f69463b;
        String str2 = creditCardChooseFutureInstalmentsScreenContract$InputData.f69462a;
        int i = p.f282437a[vVar.ordinal()];
        w4l.h hVar = w4l.h.f294642c;
        m mVar = this.f69467p;
        if (i == 1) {
            nVarV = nim.a.v(((r1) mVar).u(str2, str, hVar), new urd.y(6));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nVarV = nim.a.v(((r1) mVar).k(str2, str, hVar), new urd.y(7));
        }
        Flow flowQ = q.q(nim.a.u(new g(this, (Continuation) null, 10), u0.m(nVarV, ((x2) this.f69468q).y(str2, i.f294643c))));
        h0 h0Var = h0.f322473a;
        l.a1(this, rd0.e.n(flowQ, h0Var), null, null, new r(this, null, 0), 3);
        l.a1(this, rd0.e.d(new dr2.l(q.r(new k(25), new t0(this.f69469r.B(new urd.y(5)), 1)), 8), h0Var), null, null, new r(this, null, 1), 3);
    }

    public final us4.g I2() {
        return (us4.g) c.I(((us4.h) ((j2) this.f69469r.f22677a).getValue()).f282425a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69470s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69469r;
    }
}
