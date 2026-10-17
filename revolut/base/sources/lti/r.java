package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTimeSlotPickerScreenContract$InputData f199948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199950c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public r(g gVar, k kVar, ViewController viewController, AsftTimeSlotPickerScreenContract$InputData asftTimeSlotPickerScreenContract$InputData) {
        this.f199949b = gVar;
        this.f199948a = asftTimeSlotPickerScreenContract$InputData;
        this.f199950c = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.d = e4m.b.b(new l(gVar, this, 0, i));
        this.e = e4m.b.b(new l(gVar, this, 2, i));
        this.f = e4m.b.b(new l(gVar, this, 1, i));
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
