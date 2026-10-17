package com.revolut.feature.atm.impl.ui.redesign.v2.map;

import ah0.c;
import aii.q;
import ang.f;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.l0;
import nii.y0;
import oki.h;
import sk2.i;
import skm.a2;
import tk2.p;
import u36.g;
import v0b.b;
import vkm.j2;
import vkm.v1;
import vy5.d0;
import wk2.a0;
import wk2.b0;
import wk2.c0;
import wk2.e0;
import wk2.f0;
import wk2.g0;
import wk2.h0;
import wk2.i0;
import wk2.j0;
import wk2.k;
import wk2.m;
import wk2.z;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements m {
    public boolean A;
    public c0 B;
    public final y C;
    public final b D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.a f63183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sk2.a f63184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y80.a f63185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f63186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f63187t;
    public final c u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f63188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f63189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f63190y;
    public a2 z;

    public a(n stateMapper, p atmCoordinator, s70.a intentProvider, sk2.a locationPermissionsProvider, y80.a permissionProvider, f userInteractor, i userLocationProvider, c boundsFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(atmCoordinator, "atmCoordinator");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(locationPermissionsProvider, "locationPermissionsProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userLocationProvider, "userLocationProvider");
        Intrinsics.checkNotNullParameter(boundsFactory, "boundsFactory");
        this.o = atmCoordinator;
        this.f63183p = intentProvider;
        this.f63184q = locationPermissionsProvider;
        this.f63185r = permissionProvider;
        this.f63186s = userInteractor;
        this.f63187t = userLocationProvider;
        this.u = boundsFactory;
        this.B = a0.f298173a;
        this.C = d.b(this, new k(0), stateMapper, null, false, 12);
        this.D = ta6.a.g(atmCoordinator.o, atmCoordinator.f271854p, atmCoordinator.f271856r, atmCoordinator.f271858t, new b88.m(5, 2, null));
        this.E = e.a(this, new wde.f(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        p pVar = this.o;
        Continuation continuation = null;
        l.a1(this, pVar.f271849h, null, null, new j0(this, continuation, 1), 3);
        l.a1(this, pVar.f271850j, null, null, new j0(this, continuation, 2), 3);
        l.a1(this, new d0(pVar.f271851l, 5), null, null, new w65.c(this, continuation, 29), 3);
        l.a1(this, pVar.f271846b, null, null, new j0(this, continuation, 3), 3);
    }

    public final void I2() {
        y80.a aVar = this.f63185r;
        boolean zC = aVar.c("android.permission.ACCESS_FINE_LOCATION");
        y yVar = this.C;
        if (zC && aVar.c("android.permission.ACCESS_COARSE_LOCATION")) {
            this.v = true;
            H2(yVar, new wje.m(11));
            M2();
        } else {
            if (this.v) {
                R2();
                return;
            }
            this.v = true;
            H2(yVar, new wje.m(7));
            h.v2(this.E, AtmMapScreenContract$ModalStep.RequestLocationPermissions.f63179a, ModalDestination.Style.POPUP.f98311a);
        }
    }

    public final void J2() {
        c0 c0Var = this.B;
        if (c0Var instanceof wk2.y) {
            i0 i0Var = ((wk2.y) c0Var).f298228a;
            if (i0Var instanceof g0) {
                N2(((g0) i0Var).f298187a);
                return;
            } else {
                if (!(i0Var instanceof h0)) {
                    throw new NoWhenBranchMatchedException();
                }
                O2();
                return;
            }
        }
        if (c0Var instanceof z) {
            O2();
        } else if (c0Var instanceof b0) {
            this.B = a0.f298173a;
            C2(q.f5292a);
        } else if (!(c0Var instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    public final void K2() {
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.z = l2(new w76.a(this, continuation, 17), new vsl.f(1, this, a.class, "showErrorScreen", "showErrorScreen(Ljava/lang/Throwable;)Z", 0, 29));
    }

    public final void L2() {
        y yVar = this.C;
        ah0.b bVar = ((k) ((j2) yVar.f22677a).getValue()).f298198l;
        if (bVar != null) {
            H2(yVar, new wje.m(10));
            if (!(this.B instanceof b0)) {
                P2(e0.f298183a);
            }
            this.o.a(new tk2.d(bVar));
        }
    }

    public final void M2() {
        a2 a2Var = this.f63190y;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        i iVar = this.f63187t;
        iVar.getClass();
        this.f63190y = l.a1(this, vkm.q.q(new v1(new sk2.h(iVar, null))), null, null, new j0(this, continuation, 0), 3);
    }

    public final void N2(Atm atm) {
        this.B = new z(atm);
        h.v2(this.E, new AtmMapScreenContract$ModalStep.ShowAtmDetails(atm), new ModalDestination.Style.ExpandableBottomDialog(1));
    }

    public final void O2() {
        this.B = b0.f298176a;
        h.v2(this.E, AtmMapScreenContract$ModalStep.ShowAtmList.f63181a, new ModalDestination.Style.ExpandableBottomDialog(1));
    }

    public final void P2(f0 f0Var) {
        c0 c0Var = this.B;
        if (c0Var instanceof a0) {
            if (f0Var instanceof e0) {
                O2();
                return;
            } else {
                if (!(f0Var instanceof wk2.d0)) {
                    throw new NoWhenBranchMatchedException();
                }
                N2(((wk2.d0) f0Var).f298181a);
                return;
            }
        }
        if (c0Var instanceof b0) {
            if (f0Var instanceof e0) {
                return;
            }
            if (!(f0Var instanceof wk2.d0)) {
                throw new NoWhenBranchMatchedException();
            }
            this.B = new wk2.y(new g0(((wk2.d0) f0Var).f298181a));
            B2();
            return;
        }
        boolean z = c0Var instanceof z;
        i0 pendingAction = h0.f298189a;
        if (!z) {
            if (!(c0Var instanceof wk2.y)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(f0Var instanceof e0)) {
                if (!(f0Var instanceof wk2.d0)) {
                    throw new NoWhenBranchMatchedException();
                }
                pendingAction = new g0(((wk2.d0) f0Var).f298181a);
            }
            Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
            this.B = new wk2.y(pendingAction);
            return;
        }
        if (f0Var instanceof e0) {
            this.B = new wk2.y(pendingAction);
            B2();
        } else {
            if (!(f0Var instanceof wk2.d0)) {
                throw new NoWhenBranchMatchedException();
            }
            this.B = new z(((wk2.d0) f0Var).f298181a);
            this.o.a(new tk2.b(zv0.b.HALF_EXPANDED));
        }
    }

    public final void Q2(Throwable th10) {
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        h.v2(this.E, AtmMapScreenContract$ModalStep.ShowError.f63182a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
    }

    public final void R2() {
        l.a1(this, X1(new y0(null, new l0(new TextLocalisedClause(R.string.permission_location_reason_title, null, null, 14), new TextLocalisedClause(R.string.permission_location_reason_subtitle, null, null, 14), null, new TextLocalisedClause(R.string.permission_location_reason_action, null, null, 14), new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), null, false, null, 996), false, 5)), new g(2, this, a.class, "showErrorScreen", "showErrorScreen(Ljava/lang/Throwable;)Z", 4, 26), null, new j0(this, null, 5), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
