package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates;

import cli.n;
import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import i9g.h0;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ycg.g;
import ycg.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements g {

    @NotNull
    public static final i Companion = new i();
    public final TravelHotelsDatesPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f93954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f93955q;

    public a(n stateMapper, TravelHotelsDatesPickerScreenContract$InputData inputData, e dateProvider, h0 travelHotelsSearchParamsInteractor) {
        LocalDate localDateB;
        LocalDate localDateC;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(travelHotelsSearchParamsInteractor, "travelHotelsSearchParamsInteractor");
        this.o = inputData;
        this.f93954p = travelHotelsSearchParamsInteractor;
        f fVar = (f) dateProvider;
        LocalDate localDateE = fVar.e();
        LocalDate localDatePlusYears = fVar.e().plusYears(2L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
        vim.e eVarB = vim.i.b(localDateE, localDatePlusYears);
        boolean z = inputData instanceof TravelHotelsDatesPickerScreenContract$InputData.NoSelection;
        vim.e eVarB2 = null;
        if (z) {
            localDateB = null;
        } else if (inputData instanceof TravelHotelsDatesPickerScreenContract$InputData.CustomSelectedDates) {
            localDateB = ((TravelHotelsDatesPickerScreenContract$InputData.CustomSelectedDates) inputData).f93950a;
        } else {
            if (!(inputData instanceof TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates)) {
                throw new NoWhenBranchMatchedException();
            }
            localDateB = travelHotelsSearchParamsInteractor.b();
        }
        if (z) {
            localDateC = null;
        } else if (inputData instanceof TravelHotelsDatesPickerScreenContract$InputData.CustomSelectedDates) {
            localDateC = ((TravelHotelsDatesPickerScreenContract$InputData.CustomSelectedDates) inputData).f93951b;
        } else {
            if (!(inputData instanceof TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates)) {
                throw new NoWhenBranchMatchedException();
            }
            localDateC = travelHotelsSearchParamsInteractor.c();
        }
        if (localDateB != null) {
            eVarB2 = localDateC != null ? vim.i.b(localDateB, localDateC) : vim.i.b(localDateB, localDateB);
        } else if (localDateC != null) {
            eVarB2 = vim.i.b(localDateC, localDateC);
        }
        this.f93955q = d.b(this, new ycg.d(eVarB, eVarB2, fVar.e(), fVar.e()), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93955q;
    }
}
