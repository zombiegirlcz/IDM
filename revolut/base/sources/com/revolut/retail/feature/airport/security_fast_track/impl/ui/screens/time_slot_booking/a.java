package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import gui.g;
import gui.j;
import hx7.e;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mti.n;
import oki.h;
import pti.k;
import vii.b;
import vkm.j2;
import vkm.q;
import y4f.o;
import yui.l;
import yui.p;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements p, g {
    public final AsftTimeSlotBookingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mti.a f98887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f98888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zsi.h f98889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f98890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yui.a f98891t;
    public final nd.n u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f98892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f98893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f98894y;

    public a(cli.n stateMapper, AsftTimeSlotBookingScreenContract$InputData inputData, mti.a airportsInteractor, n terminalsInteractor, zsi.h slotPrebookingInteractor, k configRepository, yui.a dateProvider, nd.n dateTimeSlotsProvider, j purchaseExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(airportsInteractor, "airportsInteractor");
        Intrinsics.checkNotNullParameter(terminalsInteractor, "terminalsInteractor");
        Intrinsics.checkNotNullParameter(slotPrebookingInteractor, "slotPrebookingInteractor");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(dateTimeSlotsProvider, "dateTimeSlotsProvider");
        Intrinsics.checkNotNullParameter(purchaseExtension, "purchaseExtension");
        this.o = inputData;
        this.f98887p = airportsInteractor;
        this.f98888q = terminalsInteractor;
        this.f98889r = slotPrebookingInteractor;
        this.f98890s = configRepository;
        this.f98891t = dateProvider;
        this.u = dateTimeSlotsProvider;
        this.v = purchaseExtension;
        this.f98892w = new b();
        this.f98893x = d.b(this, new l(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), 1, null, null, null, null, null, false, false, false, false), stateMapper, null, false, 12);
        this.f98894y = e.a(this, new yi3.d(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        j jVar = this.v;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "delegate");
        jVar.o = this;
        Continuation continuation = null;
        yji.l.a1(this, jVar.f146959q, null, null, new yui.y(this, continuation, 1), 3);
        yji.l.a1(this, q.Q(this.f98892w, new o(continuation, this, 17)), null, null, new yui.y(this, continuation, 0), 3);
    }

    public final LocalDate I2(bti.a aVar, AsftTerminal asftTerminal) {
        TimeZone airportTimeZone;
        LocalDateTime localDateTimeG;
        LocalDate localDate;
        List list = asftTerminal != null ? asftTerminal.f98743l : null;
        Integer num = asftTerminal != null ? asftTerminal.i : null;
        if (aVar == null || (airportTimeZone = aVar.f) == null) {
            airportTimeZone = TimeZone.getDefault();
        }
        Intrinsics.h(airportTimeZone);
        nd.n nVar = this.u;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(airportTimeZone, "airportTimeZone");
        if (list == null || (localDateTimeG = nVar.g(list, num, airportTimeZone)) == null || (localDate = localDateTimeG.toLocalDate()) == null) {
            return null;
        }
        if (nVar.f(list, num, localDate, airportTimeZone) != null && (!r5.isEmpty())) {
            return localDate;
        }
        Set setI = nd.n.i(list);
        LocalDate localDatePlusDays = localDate.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        while (setI.contains(localDatePlusDays.getDayOfWeek())) {
            localDatePlusDays = localDatePlusDays.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        }
        return localDatePlusDays;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f98894y;
    }

    @Override // gui.g
    public final int d() {
        return 0;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f98893x;
    }

    @Override // gui.g
    public final boolean s0() {
        bti.d dVar = ((l) ((j2) this.f98893x.f22677a).getValue()).f317033j;
        if (dVar != null) {
            return dVar.k.f18603b.k();
        }
        return false;
    }
}
