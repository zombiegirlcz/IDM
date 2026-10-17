package com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreenContract$ModalStep;
import dwi.t0;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import svi.t1;
import svi.v1;
import ukm.f;
import vkm.q;
import vkm.z1;
import xyi.b;
import y4f.o;
import yji.l;
import yw9.j;
import yyi.g;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements yyi.h {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f99153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f99154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f99155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f99156s;

    public a(n stateMapper, b actionHandlerControllerExtension, t0 schemeAirportLoungesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(actionHandlerControllerExtension, "actionHandlerControllerExtension");
        Intrinsics.checkNotNullParameter(schemeAirportLoungesInteractor, "schemeAirportLoungesInteractor");
        this.o = actionHandlerControllerExtension;
        this.f99153p = schemeAirportLoungesInteractor;
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f99154q = z1VarB;
        this.f99155r = d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f99156s = e.a(this, new j(24));
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (!(obj2 instanceof t1)) {
            if (obj2 instanceof v1) {
                C1(u0.b(new FeatureCommand(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870910))));
            }
        } else {
            t1 t1Var = (t1) obj2;
            h.v2(this.f99156s, new SchemeLoungesHomeScreenContract$ModalStep.HowToActivate(t1Var.f265995a, t1Var.f265996b, t1Var.f265997c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f99156s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f99154q, new o(continuation, this, 24)), null, new yy6.f(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f99155r;
    }
}
