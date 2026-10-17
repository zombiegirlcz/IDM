package com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards;

import cli.n;
import cli.y;
import jwb.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import ss4.a0;
import swb.j;
import tqi.g;
import yji.l;
import zk0.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements swb.h {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f83699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f83700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l80.e f83701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f83702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83703t;

    public a(e revPointsGiftcardsInteractor, g shareNaviCommandFactory, b fileSystemRepository, l80.e dateProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = revPointsGiftcardsInteractor;
        this.f83699p = shareNaviCommandFactory;
        this.f83700q = fileSystemRepository;
        this.f83701r = dateProvider;
        this.f83702s = d.b(this, new swb.e(0), stateMapper, null, false, 12);
        this.f83703t = hx7.e.a(this, new a0(9));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83703t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, nim.a.u(new j(this, continuation, 0), this.o.c(null, w4l.h.f294642c)), null, new j(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83702s;
    }
}
