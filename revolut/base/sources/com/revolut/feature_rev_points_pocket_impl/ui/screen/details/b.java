package com.revolut.feature_rev_points_pocket_impl.ui.screen.details;

import cli.g;
import cli.n;
import cli.y;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ldi.f;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q06.l;
import tjf.k0;
import u7k.w;
import udi.j;
import udi.k;
import udi.m;
import udi.r;
import udi.t;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements k {

    @NotNull
    public static final m Companion = new m();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final udi.a f97814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f97815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f97816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kdi.b f97817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f97818t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f97819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f97820x;

    public b(n stateMapper, f revPointsPocketInteractor, udi.a revPointsPocketDetailsDialogMapper, wj0.a idempotencyKeyHolder, j60.a bottomExpandableDialogControllerExtension, kdi.b revPointsPocketThresholdsBreakdownControllerExtension, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketDetailsDialogMapper, "revPointsPocketDetailsDialogMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(revPointsPocketThresholdsBreakdownControllerExtension, "revPointsPocketThresholdsBreakdownControllerExtension");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = revPointsPocketInteractor;
        this.f97814p = revPointsPocketDetailsDialogMapper;
        this.f97815q = idempotencyKeyHolder;
        this.f97816r = bottomExpandableDialogControllerExtension;
        this.f97817s = revPointsPocketThresholdsBreakdownControllerExtension;
        this.f97818t = deeplinkRouter;
        this.u = e.a(this, new w(this, 12));
        this.v = new vii.b();
        this.f97819w = new vii.b();
        this.f97820x = d.b(this, new j(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f97815q.a("CLOSE_POINTS_POCKET_IDEMPOTENCY_TAG");
        Continuation continuation = null;
        int i = 1;
        yji.l.a1(this, new k0(q.Q(this.v, new r(0, this, continuation)), i), null, null, new t(0, this, null), 3);
        yji.l.a1(this, q.Q(this.f97819w, new r(i, this, continuation)), null, null, new t(1, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f97820x;
    }
}
