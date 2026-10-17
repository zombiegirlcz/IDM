package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change;

import cli.y;
import com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dp4.y0;
import eul.f;
import f2c.g;
import f2c.i;
import f2c.j;
import f2c.k;
import f2c.n;
import f2c.o;
import f2c.r;
import f2c.s;
import f2c.t;
import f2c.x;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p2c.z;
import rul.e;
import vii.b;
import vkm.j2;
import vkm.q;
import xvh.c;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {

    @NotNull
    public static final o Companion = new o();
    public final RevPointsSpareChangeFullBannerGridControllerApi$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f84147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f84148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f84149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mre.c f84150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l61.a f84151t;
    public final b u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f84152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84153x;

    public a(x stateMapper, RevPointsSpareChangeFullBannerGridControllerApi$InputData inputData, c autoInvestInteractor, e revPointsSpareChangeInteractor, z statusDialogMapper, mre.c termsNavigationFactory, l61.a userCompanyInteractor) {
        f2c.h hVar;
        Float f;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = inputData;
        this.f84147p = autoInvestInteractor;
        this.f84148q = revPointsSpareChangeInteractor;
        this.f84149r = statusDialogMapper;
        this.f84150s = termsNavigationFactory;
        this.f84151t = userCompanyInteractor;
        this.u = new b();
        this.v = new b();
        RevPointsSpareChangeControllerApi$Mode revPointsSpareChangeControllerApi$Mode = inputData.f84140a.f84125a;
        if (revPointsSpareChangeControllerApi$Mode instanceof RevPointsSpareChangeControllerApi$Mode.Adjust) {
            RevPointsSpareChangeControllerApi$Mode.Adjust adjust = (RevPointsSpareChangeControllerApi$Mode.Adjust) revPointsSpareChangeControllerApi$Mode;
            Integer num = adjust.f84128c;
            yvh.b bVar = adjust.f84126a;
            int iFloatValue = (bVar == null || (f = bVar.i) == null) ? 1 : (int) f.floatValue();
            int iA = p2c.a.a(num != null ? num.intValue() : iFloatValue);
            hVar = new f2c.h(iFloatValue, num != null ? new j(iA) : new i(iA), zi0.c.P(v.l(bVar), false, null, 3), 24);
        } else {
            hVar = new f2c.h(0, null, null, 31);
        }
        this.f84152w = d.b(this, hVar, stateMapper, null, false, 12);
        this.f84153x = hx7.e.a(this, new f(this, 13));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new s(0, this, continuation)), null, null, new t(0, this, continuation), 3);
        l.a1(this, q.Q(this.v, new s(1, this, continuation)), null, null, new t(1, this, continuation), 3);
        l.a1(this, rd0.e.b(hng.g.b(((ang.b) this.f84151t).f7765a)), null, null, new t(2, this, continuation), 3);
    }

    public final void I2(ty0.a clickData) {
        SpareChangeCalculations spareChangeCalculations;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (Intrinsics.f(clickData.d, RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a)) {
            l2(new r(1, this, null), new yi5.b(26));
        } else {
            if (!Intrinsics.f(clickData.f275445a, "SPARE_CHANGE_FBGB_POINTS_INFO_ITEM_ID") || (spareChangeCalculations = (SpareChangeCalculations) ((f2c.h) ((j2) this.f84152w.f22677a).getValue()).d.getContent()) == null) {
                return;
            }
            h.v2(this.f84153x, new RevPointsSpareChangeFullBannerGridControllerContract$ModalStep.Breakdown(spareChangeCalculations), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final void J2() {
        yvh.b bVar;
        yvh.b bVar2;
        y yVar = this.f84152w;
        List<yvh.b> list = (List) ((f2c.h) ((j2) yVar.f22677a).getValue()).f131499c.getContent();
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
        k kVar = ((f2c.h) ((j2) yVar.f22677a).getValue()).f131498b;
        if (bVar != null) {
            yvh.h hVar = bVar.e;
            yvh.h hVar2 = yvh.h.LOYALTY_PROFILE;
            if (hVar != hVar2) {
                f2(e1(new bwh.a(bVar, hVar2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new eed.i(this, 12, bVar2, kVar));
                return;
            }
        }
        l2(new y0(this, bVar2, kVar.a(), continuation, 2), new n(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84153x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f84152w;
    }
}
