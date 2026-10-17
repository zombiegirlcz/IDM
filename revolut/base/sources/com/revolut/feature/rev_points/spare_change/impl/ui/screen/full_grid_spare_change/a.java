package com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change;

import cli.y;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.kompot.common.ModalDestination;
import dp4.y0;
import h2c.i;
import h2c.j;
import h2c.k;
import h2c.o;
import h2c.p;
import h2c.s;
import h2c.t;
import h2c.x;
import hng.g;
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
public final class a extends h implements h2c.h {

    @NotNull
    public static final p Companion = new p();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f84155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f84156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f84157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l61.a f84158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f84159t;
    public final b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84160w;

    public a(x stateMapper, RevPointsSpareChangeControllerApi$InputData inputData, c autoInvestInteractor, e revPointsSpareChangeInteractor, z statusDialogMapper, mre.c termsNavigationFactory, l61.a userCompanyInteractor) {
        i iVar;
        Float f;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = autoInvestInteractor;
        this.f84155p = revPointsSpareChangeInteractor;
        this.f84156q = statusDialogMapper;
        this.f84157r = termsNavigationFactory;
        this.f84158s = userCompanyInteractor;
        this.f84159t = new b();
        this.u = new b();
        RevPointsSpareChangeControllerApi$Mode revPointsSpareChangeControllerApi$Mode = inputData.f84125a;
        if (revPointsSpareChangeControllerApi$Mode instanceof RevPointsSpareChangeControllerApi$Mode.Adjust) {
            RevPointsSpareChangeControllerApi$Mode.Adjust adjust = (RevPointsSpareChangeControllerApi$Mode.Adjust) revPointsSpareChangeControllerApi$Mode;
            Integer num = adjust.f84128c;
            yvh.b bVar = adjust.f84126a;
            int iFloatValue = (bVar == null || (f = bVar.i) == null) ? 1 : (int) f.floatValue();
            int iA = p2c.a.a(num != null ? num.intValue() : iFloatValue);
            iVar = new i(iFloatValue, num != null ? new k(iA) : new j(iA), zi0.c.P(v.l(bVar), false, null, 3), 24);
        } else {
            iVar = new i(0, null, null, 31);
        }
        this.v = d.b(this, iVar, stateMapper, null, false, 12);
        this.f84160w = hx7.e.a(this, new h1c.c(this, 1));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f84159t, new s(0, this, continuation)), null, null, new t(0, this, continuation), 3);
        l.a1(this, q.Q(this.u, new s(1, this, continuation)), null, null, new t(1, this, continuation), 3);
        l.a1(this, rd0.e.b(g.b(((ang.b) this.f84158s).f7765a)), null, null, new t(2, this, continuation), 3);
    }

    public final void I2() {
        yvh.b bVar;
        yvh.b bVar2;
        y yVar = this.v;
        List<yvh.b> list = (List) ((i) ((j2) yVar.f22677a).getValue()).f148775c.getContent();
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
        h2c.l lVar = ((i) ((j2) yVar.f22677a).getValue()).f148774b;
        if (bVar != null) {
            yvh.h hVar = bVar.e;
            yvh.h hVar2 = yvh.h.LOYALTY_PROFILE;
            if (hVar != hVar2) {
                f2(e1(new bwh.a(bVar, hVar2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new g31.e(this, 16, bVar2, lVar));
                return;
            }
        }
        l2(new y0(this, bVar2, lVar.a(), continuation, 4), new o(this, 1));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84160w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
