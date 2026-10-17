package com.revolut.feature.credit.application.plugins.impl.ui.amount_input;

import chj.p;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import dx4.t;
import dx4.x;
import dz6.o;
import e06.g;
import e54.e;
import e54.l;
import e54.m;
import e54.r;
import e54.s;
import e54.u;
import e54.v;
import e54.z;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements l {

    @NotNull
    public static final s Companion = new s();
    public final z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e54.a f67045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n60.b f67046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f67047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CreditAmountInputScreenContract$InputData f67048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f67049t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final j2 v;

    public b(z inputValueMapper, e54.a amountCalculator, n60.b keyboardView, e creditAmountInputFlowInteractor, v stateMapper, CreditAmountInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputValueMapper, "inputValueMapper");
        Intrinsics.checkNotNullParameter(amountCalculator, "amountCalculator");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(creditAmountInputFlowInteractor, "creditAmountInputFlowInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputValueMapper;
        this.f67045p = amountCalculator;
        this.f67046q = keyboardView;
        this.f67047r = creditAmountInputFlowInteractor;
        this.f67048s = inputData;
        long j2 = inputData.f67036a;
        long j3 = inputData.f67037b;
        Long l2 = inputData.f67038c;
        t tVar = inputData.f67040h;
        Clause clause = inputData.e;
        x xVar = inputData.f;
        Clause clause2 = inputData.f67039g;
        CreditAmountInputScreenContract$Configuration creditAmountInputScreenContract$Configuration = inputData.f67041j;
        List list = inputData.i;
        String strValueOf = l2 != null ? String.valueOf(l2.longValue()) : null;
        this.f67049t = d.b(this, new m(j2, j3, l2, strValueOf == null ? "" : strValueOf, clause, xVar, clause2, creditAmountInputScreenContract$Configuration, false, tVar, list, false), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new r(this, 0));
        Long l3 = inputData.f67038c;
        String strValueOf2 = l3 != null ? String.valueOf(l3.longValue()) : null;
        this.v = q.c(strValueOf2 != null ? strValueOf2 : "");
    }

    public final void I2(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.f67048s.f67042l) {
            n2(new o(this, text, null, 21), new whi.b(6));
        } else {
            H2(this.f67049t, new g(this.o.a(text), text.toString(), 1));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (this.f67048s.f67042l) {
            yji.l.b1(this, q.H(new p(this, continuation, 1), new q0(new cqh.m(this.v, this, 20), new u(this, continuation, 0), 1)), null, null, 7);
        }
        yji.l.b1(this, rd0.e.b(this.f67046q.d), null, new u(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67049t;
    }
}
