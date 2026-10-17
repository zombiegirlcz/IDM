package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow;

import aii.m;
import aii.n;
import c8g.c;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;
import ml3.y;
import mnl.g;
import mod.l;
import mod.o;
import mod.p;
import mod.r;
import mod.s;
import mod.t;
import mod.v;
import mod.x;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;
import vkm.q;
import yi5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements v {

    @NotNull
    public static final x Companion = new x();
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f87628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TripsFlowContract$InputData f87629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f87630r;

    public a(l actionsHandler, g1 shotDialogDisplayer, TripsFlowContract$InputData inputData) {
        FlowStep countryPicker;
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = actionsHandler;
        this.f87628p = shotDialogDisplayer;
        this.f87629q = inputData;
        if (inputData instanceof TripsFlowContract$InputData.List) {
            countryPicker = new TripsFlowContract$Step.List(((TripsFlowContract$InputData.List) inputData).f87611a);
        } else {
            if (!(inputData instanceof TripsFlowContract$InputData.AddTrip)) {
                throw new NoWhenBranchMatchedException();
            }
            countryPicker = new TripsFlowContract$Step.CountryPicker(null);
        }
        this.f87630r = d.a(this, countryPicker, f0.f322471a, new g(this, 2));
    }

    public static final Object I2(a aVar, int i, i iVar) {
        Object objX = q.x(aVar.X1(new y0(null, new z(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.trips_common_error_description, null, null, 14), new TextLocalisedClause(R$string.trips_common_action_gotIt, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), iVar);
        return objX == fim.a.COROUTINE_SUSPENDED ? objX : Unit.f186387a;
    }

    public static final void J2(a aVar, int i) {
        ((k1) aVar.f87628p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "trip_success", new TextLocalisedClause(i, null, null, 14), null, null, null, 60));
    }

    @Override // yji.l
    public final void I1() {
        l lVar = this.o;
        yji.l.a1(this, c.d(j0j.a.a(lVar.f207622a), new y(lVar, 15)), null, null, null, 7);
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event instanceof o) {
            h.t2(this, this.f87630r, new TripsFlowContract$Step.CountryPicker(((o) event).f207629b), true, null, false, 12);
            return null;
        }
        if (event instanceof mod.n) {
            mod.n nVar = (mod.n) event;
            h.t2(this, this.f87630r, new TripsFlowContract$Step.DatePicker(nVar.f207627b, nVar.f207628c), true, null, false, 12);
            return null;
        }
        if (event instanceof p) {
            p pVar = (p) event;
            h.w2(this.f87630r, new TripsFlowContract$Step.EditOptions(pVar.f207630b, pVar.f207631c, pVar.d, pVar.e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return null;
        }
        if (event instanceof t) {
            t tVar = (t) event;
            h.t2(this, this.f87630r, new TripsFlowContract$Step.Share(tVar.f207635b, tVar.f207636c, tVar.d, tVar.e, tVar.f, tVar.f207637g), true, null, false, 12);
            return null;
        }
        if (event instanceof r) {
            h.t2(this, this.f87630r, new TripsFlowContract$Step.GroupDetails(((r) event).f207633b), true, null, false, 12);
            return null;
        }
        if (event instanceof s) {
            h.t2(this, this.f87630r, new TripsFlowContract$Step.ManageCategories(((s) event).f207634b), true, null, false, 12);
            return null;
        }
        if (!(event instanceof mod.q)) {
            return super.o2(event);
        }
        l2(new p0(this, event, continuation, 27), new b(26));
        return null;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87630r;
    }
}
