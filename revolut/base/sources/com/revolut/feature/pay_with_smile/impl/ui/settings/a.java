package com.revolut.feature.pay_with_smile.impl.ui.settings;

import bw4.s;
import c9f.c;
import cli.y;
import cm9.g;
import cm9.j;
import cm9.k;
import cm9.o;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ql9.d;
import rp0.l0;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements cm9.h {

    @NotNull
    public static final j Companion = new j();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f78983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f78984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f78986s;

    public a(o stateMapper, d settingsRepository, l0 popupMenuDialogDisplayer) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        this.o = settingsRepository;
        this.f78983p = popupMenuDialogDisplayer;
        this.f78984q = new b();
        this.f78985r = e.a(this, new c(this, 27));
        this.f78986s = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f78984q, new s(continuation, this, 19)), null, null, new k(this, continuation, 0), 3);
        l.a1(this, rd0.e.b(this.f78983p.f256113c), null, null, new k(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78985r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f78986s;
    }
}
