package com.revolut.retail.feature.esim.impl.ui.screens.help;

import cli.n;
import cli.y;
import dfj.g0;
import dfj.v2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import w4l.i;
import wli.x;
import xhj.e;
import xhj.f;
import xhj.g;
import xhj.j;
import xhj.k;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements g {

    @NotNull
    public static final j Companion = new j();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f100981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f100982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v2 f100983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aij.a f100984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f100985t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final vii.b v;

    public b(f inputData, g0 helpInteractor, x deeplinkHandler, v2 profilesInteractor, aij.a reinstallDialogBuilder, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(helpInteractor, "helpInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(profilesInteractor, "profilesInteractor");
        Intrinsics.checkNotNullParameter(reinstallDialogBuilder, "reinstallDialogBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f100981p = helpInteractor;
        this.f100982q = deeplinkHandler;
        this.f100983r = profilesInteractor;
        this.f100984s = reinstallDialogBuilder;
        this.f100985t = d.b(this, new e(0), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new x2g.b(this, 26));
        this.v = new vii.b(i.f294643c);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        k kVar = new k(0, this, continuation);
        vii.b bVar = this.v;
        l.a1(this, q.Q(bVar, kVar), null, null, new xhj.l(0, this, null), 3);
        l.a1(this, q.Q(bVar, new k(1, this, continuation)), null, null, new xhj.l(1, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f100985t;
    }
}
