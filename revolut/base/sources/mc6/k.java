package mc6;

import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreenContract$InputData;
import java.time.LocalDate;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import yua.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecurringDonationScheduleScreenContract$InputData f204284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f204285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l80.e f204286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f204287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nc6.b f204288t;
    public final oc6.b u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDate f204289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Period f204290x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, RecurringDonationScheduleScreenContract$InputData inputData, xua.a recurringPaymentInteractor, l80.e dateProvider, j60.a bottomExpandableDialogControllerExtension, nc6.b datePickerBottomDialogFactory, oc6.b periodBottomDialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(datePickerBottomDialogFactory, "datePickerBottomDialogFactory");
        Intrinsics.checkNotNullParameter(periodBottomDialogFactory, "periodBottomDialogFactory");
        this.f204284p = inputData;
        this.f204285q = recurringPaymentInteractor;
        this.f204286r = dateProvider;
        this.f204287s = bottomExpandableDialogControllerExtension;
        this.f204288t = datePickerBottomDialogFactory;
        this.u = periodBottomDialogFactory;
        this.v = new f(0);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(nim.a.w(((q) this.f204285q).r(this.f204284p.f72110a), new m98.k(this, 11))), null, null, new m75.i(this, null, 14), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }
}
