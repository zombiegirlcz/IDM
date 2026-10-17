package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftFlightDatePickerScreenContract$InputData f199893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199895c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(g gVar, k kVar, ViewController viewController, AsftFlightDatePickerScreenContract$InputData asftFlightDatePickerScreenContract$InputData) {
        this.f199894b = gVar;
        this.f199893a = asftFlightDatePickerScreenContract$InputData;
        this.f199895c = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.d = e4m.b.b(new ljl.u(gVar, this, 0, i));
        this.e = e4m.b.b(new ljl.u(gVar, this, 2, i));
        this.f = e4m.b.b(new ljl.u(gVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
