package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule;

import cli.n;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ly3.c;
import mra.d;
import o23.l;
import o74.f;
import o74.g;
import o74.i;
import o74.j;
import o74.k;
import o74.m;
import o74.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements m {

    @NotNull
    private static final o Companion = new o();
    public final ScheduleScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f67326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67327q;

    public a(ScheduleScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67326p = d.b(this, new f(((c) d0.b0(inputData.f67324a.f200665g)).f200660a, null), stateMapper, null, false, 12);
        this.f67327q = e.a(this, new nx2.f(this, 24));
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof j) {
            B2();
            return;
        }
        if (event instanceof i) {
            h.v2(this.f67327q, ScheduleScreenContract$ModalStep.Calendar.f67325a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        boolean z = event instanceof o74.h;
        y yVar = this.f67326p;
        if (z) {
            Object obj2 = ((o74.h) event).f222709a.i;
            if (obj2 instanceof String) {
                H2(yVar, new l((String) obj2, 11));
                return;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ScheduleScreenModel", a0.d.m(obj2, "Unsupported parcel: "), null, h0Var);
            return;
        }
        if (!(event instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar = (f) ((j2) yVar.f22677a).getValue();
        LocalDate localDate = fVar.f222706a;
        if (localDate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C2(new o74.l(fVar.f222707b, localDate));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67327q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67326p;
    }
}
