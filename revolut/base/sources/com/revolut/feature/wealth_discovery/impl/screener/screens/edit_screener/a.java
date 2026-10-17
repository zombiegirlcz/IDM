package com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener;

import cli.g;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import gqh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import moh.e;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ugl.c;
import vkm.j2;
import vkm.q;
import vkm.t0;
import w4l.i;
import wgb.v;
import wph.b;
import wph.f;
import wph.m;
import wph.n;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements m {

    @NotNull
    public static final b Companion = new b();
    public final EditScreenerScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f96236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f96237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f96238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f96239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f96240t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(j stateMapper, EditScreenerScreenContract$Input input, e nameValidator, c screenerInteractor, f dialogsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(nameValidator, "nameValidator");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        this.o = input;
        this.f96236p = nameValidator;
        this.f96237q = screenerInteractor;
        this.f96238r = dialogsProvider;
        y yVarB = d.b(this, new n(input.f96234a, 30), stateMapper, null, false, 12);
        this.f96239s = yVarB;
        this.f96240t = q.c(((n) ((j2) yVarB.f22677a).getValue()).f299333b);
        this.u = hx7.e.a(this, new wde.f(this, 23));
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarV = nim.a.v(((yhl.f) this.f96237q).c(i.f294643c), new wph.a(this, 0));
        Continuation continuation = null;
        l.a1(this, nVarV, null, null, new wph.e(this, continuation, 0), 3);
        l.a1(this, mo3.a.g(nVarV, null, null, 3), null, null, new wph.e(this, continuation, 1), 3);
        l.a1(this, new t0(t1.d(this.f96240t, 300L), 1), null, null, new v(this, continuation, 24), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f96239s;
    }
}
