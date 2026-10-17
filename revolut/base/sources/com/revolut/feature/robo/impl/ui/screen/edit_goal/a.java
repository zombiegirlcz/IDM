package com.revolut.feature.robo.impl.ui.screen.edit_goal;

import a3e.u;
import akg.n;
import anc.f;
import anc.g;
import anc.v;
import anc.w;
import cli.y;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l80.e;
import mra.d;
import od0.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import w80.b;
import yji.l;
import zh9.u0;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {

    @NotNull
    public static final v Companion = new v();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.f f85133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f85134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f85135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f85136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85137t;

    public a(u mapper, f input, zjh.f portfolioInteractor, b amountFormatter, e dateProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = input;
        this.f85133p = portfolioInteractor;
        this.f85134q = amountFormatter;
        this.f85135r = dateProvider;
        this.f85136s = d.b(this, new anc.e(0), mapper, null, false, 12);
        this.f85137t = hx7.e.a(this, new anc.b(this, 1));
    }

    @Override // yji.l
    public final void I1() {
        Flow flowV;
        f fVar = this.o;
        r rVarN = mo3.a.n(this.f85133p.B(fVar.f6745a, w4l.h.f294642c));
        if (fVar.f6746b) {
            i.Companion.getClass();
            flowV = c.i(i.f224256b);
        } else {
            flowV = nim.a.v(rd0.e.b(rVarN), new amf.i(17));
        }
        Flow flow = flowV;
        Continuation continuation = null;
        l.a1(this, flow, null, null, new w(this, continuation, 0), 3);
        n nVarV = nim.a.v(rd0.e.b(rVarN), new amf.i(18));
        l.a1(this, nVarV, null, null, new w(this, continuation, 1), 3);
        l.a1(this, mo3.a.g(u0.m(flow, nVarV), null, new an4.g(5), 1), null, null, new w(this, continuation, 2), 3);
        l.a1(this, nim.a.v(rd0.e.b(rVarN), new amf.i(19)), null, null, new w(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85137t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85136s;
    }
}
