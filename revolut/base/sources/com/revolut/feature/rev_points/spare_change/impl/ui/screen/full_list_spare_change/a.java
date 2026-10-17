package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change;

import cli.y;
import com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dp4.y0;
import hng.g;
import j2c.e;
import j2c.f;
import j2c.n;
import j2c.o;
import j2c.p;
import j2c.q;
import j2c.s;
import j2c.t;
import j2c.u;
import j2c.x;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p2c.z;
import vii.b;
import vkm.j2;
import xvh.c;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements e {

    @NotNull
    public static final q Companion = new q();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rul.e f84165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f84166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f84167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l61.a f84168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f84169t;
    public final b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84170w;

    public a(x stateMapper, c autoInvestInteractor, rul.e revPointsSpareChangeInteractor, mre.c termsNavigationFactory, z statusDialogMapper, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = autoInvestInteractor;
        this.f84165p = revPointsSpareChangeInteractor;
        this.f84166q = termsNavigationFactory;
        this.f84167r = statusDialogMapper;
        this.f84168s = userCompanyInteractor;
        this.f84169t = new b();
        this.u = new b();
        this.v = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f84170w = hx7.e.a(this, new n(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, vkm.q.Q(this.f84169t, new t(0, this, continuation)), null, null, new u(0, this, continuation), 3);
        l.a1(this, vkm.q.Q(this.u, new t(1, this, continuation)), null, null, new u(1, this, continuation), 3);
        l.a1(this, rd0.e.b(g.b(((ang.b) this.f84168s).f7765a)), null, null, new u(2, this, continuation), 3);
    }

    public final void I2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (!Intrinsics.f(clickData.f275445a, "SPARE_CHANGE_POINTS_LEARN_MORE_ITEM_ID")) {
            if (Intrinsics.f(clickData.d, RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a)) {
                l2(new s(1, this, null), new yi5.b(26));
            }
        } else {
            SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) ((f) ((j2) this.v.f22677a).getValue()).d.getContent();
            if (spareChangeCalculations != null) {
                h.v2(this.f84170w, new RevPointsSpareChangeFullListControllerContract$ModalStep.Breakdown(spareChangeCalculations), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
    }

    public final void J2() {
        yvh.b bVar;
        yvh.b bVar2;
        y yVar = this.v;
        List<yvh.b> list = (List) ((f) ((j2) yVar.f22677a).getValue()).f170808c.getContent();
        Continuation continuation = null;
        if (list != null) {
            yvh.b bVar3 = null;
            bVar = null;
            for (yvh.b bVar4 : list) {
                if (bVar4.f317177b) {
                    bVar = bVar4;
                }
                if (bVar4.e == yvh.h.LOYALTY_PROFILE) {
                    bVar3 = bVar4;
                }
            }
            bVar2 = bVar3;
        } else {
            bVar = null;
            bVar2 = null;
        }
        j2c.l lVar = ((f) ((j2) yVar.f22677a).getValue()).f170807b;
        if (bVar != null) {
            yvh.h hVar = bVar.e;
            yvh.h hVar2 = yvh.h.LOYALTY_PROFILE;
            if (hVar != hVar2) {
                f2(e1(new bwh.a(bVar, hVar2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new o(this, 0, bVar2, lVar));
                return;
            }
        }
        l2(new y0(this, bVar2, lVar.a(), continuation, 6), new p(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84170w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
