package com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker;

import cli.g;
import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import com.revolut.feature.travel.flights.models.domain.search.ChildPassenger;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import mra.d;
import oki.h;
import r6f.i;
import r6g.j;
import r6g.n;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements j {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r6g.a f93383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LocalDate f93384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LocalDate f93385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f93386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93387t;

    public a(cli.n stateMapper, TravelFlightsPassengersPickerScreenContract$InputData inputData, e dateProvider, n removeAdultBottomSheetFactory, r6g.a addAdultBottomSheetFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(removeAdultBottomSheetFactory, "removeAdultBottomSheetFactory");
        Intrinsics.checkNotNullParameter(addAdultBottomSheetFactory, "addAdultBottomSheetFactory");
        this.o = removeAdultBottomSheetFactory;
        this.f93383p = addAdultBottomSheetFactory;
        LocalDate localDateE = ((f) dateProvider).e();
        this.f93384q = localDateE;
        this.f93385r = localDateE.minusYears(18L).plusDays(1L);
        Passengers passengers = inputData.f93377a;
        int i = passengers.f93595a;
        List list = passengers.f93596b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            TravelFlightsPassengersPickerScreenContract$Child.Companion companion = TravelFlightsPassengersPickerScreenContract$Child.INSTANCE;
            LocalDate birthDate = ((ChildPassenger) obj2).f93564a;
            companion.getClass();
            Intrinsics.checkNotNullParameter(birthDate, "birthDate");
            arrayList.add(new TravelFlightsPassengersPickerScreenContract$Child(i3, birthDate));
            i2 = i3;
        }
        this.f93386s = d.b(this, new r6g.h(i, arrayList, inputData.f93378b), stateMapper, null, false, 12);
        this.f93387t = hx7.e.a(this, new i(this, 1));
    }

    public final int I2(List list) {
        List list2 = list;
        int i = 0;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 0;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((TravelFlightsPassengersPickerScreenContract$Child) it8.next()).a(this.f93384q) && (i = i + 1) < 0) {
                v.r();
                throw null;
            }
        }
        return i;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93387t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93386s;
    }
}
