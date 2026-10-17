package com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker;

import cli.g;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rul.e;
import u36.d;
import u36.j;
import u36.l;
import vii.b;
import vkm.q;
import w4l.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements d {

    @NotNull
    private static final j Companion = new j();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u36.a f71745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f71746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f71747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71748s;

    public a(l stateMapper, e assetsInteractor, u36.a bottomSheetProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(assetsInteractor, "assetsInteractor");
        Intrinsics.checkNotNullParameter(bottomSheetProvider, "bottomSheetProvider");
        this.o = assetsInteractor;
        this.f71745p = bottomSheetProvider;
        this.f71746q = new b(i.f294643c);
        this.f71747r = mra.d.b(this, new u36.b(0), stateMapper, null, false, 12);
        this.f71748s = hx7.e.a(this, new tp8.l(this, 24));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71748s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f71746q, new tik.b(continuation, this.o, 19)), null, new tz6.e(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f71747r;
    }
}
