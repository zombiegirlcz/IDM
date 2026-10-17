package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141803a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsHomeBookingsScreenContract$InputData f141804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141805c;
    public final e4m.e d;
    public final e4m.e e;

    public r0(d dVar, t tVar, TravelHotelsHomeBookingsScreenContract$InputData travelHotelsHomeBookingsScreenContract$InputData) {
        this.f141804b = travelHotelsHomeBookingsScreenContract$InputData;
        int i = 6;
        this.f141805c = e4m.b.b(new e0(dVar, this, 1, i));
        this.d = e4m.b.b(new e0(dVar, this, 0, i));
        this.e = e4m.b.b(new e0(dVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f141803a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f141803a) {
        }
        return ImmutableSet.of();
    }

    public r0(d dVar, v vVar, TravelHotelsHomeBookingsScreenContract$InputData travelHotelsHomeBookingsScreenContract$InputData) {
        this.f141804b = travelHotelsHomeBookingsScreenContract$InputData;
        int i = 5;
        this.f141805c = e4m.b.b(new e0(dVar, this, 1, i));
        this.d = e4m.b.b(new e0(dVar, this, 0, i));
        this.e = e4m.b.b(new e0(dVar, this, 2, i));
    }
}
