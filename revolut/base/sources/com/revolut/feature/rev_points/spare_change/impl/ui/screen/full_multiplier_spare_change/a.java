package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change;

import cli.y;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1B;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.kompot.common.ModalDestination;
import dp4.y0;
import java.util.List;
import khg.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l2c.f;
import l2c.g;
import l2c.i;
import l2c.j;
import l2c.m;
import l2c.n;
import l2c.r;
import l2c.x;
import mra.d;
import nyb.k;
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
public final class a extends h implements f {

    @NotNull
    public static final n Companion = new n();
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f84173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f84174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f84175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mre.c f84176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f84177t;
    public final l61.a u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f84178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f84179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f84180y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(x stateMapper, RevPointsSpareChangeControllerApi$InputData inputData, k revPointsInteractor, c autoInvestInteractor, e revPointsSpareChangeInteractor, z statusDialogMapper, mre.c termsNavigationFactory, gte.a featureToggleInteractor, l61.a userCompanyInteractor) {
        g gVar;
        Float f;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = revPointsInteractor;
        this.f84173p = autoInvestInteractor;
        this.f84174q = revPointsSpareChangeInteractor;
        this.f84175r = statusDialogMapper;
        this.f84176s = termsNavigationFactory;
        this.f84177t = featureToggleInteractor;
        this.u = userCompanyInteractor;
        this.v = new b();
        this.f84178w = new b();
        this.f84179x = new b();
        RevPointsSpareChangeControllerApi$Mode revPointsSpareChangeControllerApi$Mode = inputData.f84125a;
        if (revPointsSpareChangeControllerApi$Mode instanceof RevPointsSpareChangeControllerApi$Mode.Adjust) {
            RevPointsSpareChangeControllerApi$Mode.Adjust adjust = (RevPointsSpareChangeControllerApi$Mode.Adjust) revPointsSpareChangeControllerApi$Mode;
            Integer num = adjust.f84128c;
            yvh.b bVar = adjust.f84126a;
            int iFloatValue = (bVar == null || (f = bVar.i) == null) ? 1 : (int) f.floatValue();
            int iA = p2c.a.a(num != null ? num.intValue() : iFloatValue);
            gVar = new g(iFloatValue, num != null ? new i(iA) : new l2c.h(iA), zi0.c.P(v.l(bVar), false, null, 3), 56);
        } else {
            gVar = new g(0, null, null, 63);
        }
        this.f84180y = d.b(this, gVar, stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new l0c.v(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.v, new l2c.q(0, this, continuation)), null, null, new r(0, this, continuation), 3);
        l.a1(this, q.Q(this.f84178w, new l2c.q(1, this, continuation)), null, null, new r(1, this, continuation), 3);
        if (((jte.d) this.f84177t).c(RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1B.f84111c)) {
            l.a1(this, nim.a.v(q.Q(this.f84179x, new l2c.q(2, this, continuation)), new l0g.a(27)), null, null, new r(2, this, continuation), 3);
        }
        l.a1(this, rd0.e.b(hng.g.b(((ang.b) this.u).f7765a)), null, null, new r(3, this, continuation), 3);
    }

    public final void I2() {
        yvh.b bVar;
        yvh.b bVar2;
        y yVar = this.f84180y;
        List<yvh.b> list = (List) ((g) ((j2) yVar.f22677a).getValue()).f191744c.getContent();
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
        j jVar = ((g) ((j2) yVar.f22677a).getValue()).f191743b;
        if (bVar != null) {
            yvh.h hVar = bVar.e;
            yvh.h hVar2 = yvh.h.LOYALTY_PROFILE;
            if (hVar != hVar2) {
                f2(e1(new bwh.a(bVar, hVar2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new s(this, 16, bVar2, jVar));
                return;
            }
        }
        l2(new y0(this, bVar2, jVar.a(), continuation, 10), new m(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f84180y;
    }
}
