package com.revolut.feature.travel.flights.impl.ui.screen.checkin;

import at.r;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import l5g.e;
import l5g.f;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements f {
    public final b4g.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f93290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f93291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93292r;

    public a(r stateMapper, TravelFlightsCheckInScreenContract$InputData inputData, b4g.f repository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = repository;
        this.f93290p = new b();
        this.f93291q = d.b(this, new e(new Data(null, null, true, 3, null), inputData.f93286a), stateMapper, null, false, 12);
        this.f93292r = hx7.e.a(this, new v(15));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f93290p, new a3(continuation, this, 19)), null, null, new l1g.e(this, continuation, 6), 3);
    }

    public final void I2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (!Intrinsics.f(str, "CHECK_IN_SELF_TRANSFER_INFO_CLICK")) {
            Intrinsics.f(str, "SEPARATE_TICKETS_INFO_CLICK");
            return;
        }
        h.v2(this.f93292r, TravelFlightsCheckInScreenContract$ModalStep.SelfTransfer.f93289a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93292r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93291q;
    }
}
