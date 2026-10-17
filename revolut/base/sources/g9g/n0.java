package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsTravellerInformationEditScreenContract$InputData f141749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141751c;
    public final e4m.e d;

    public n0(d dVar, t tVar, TravelHotelsTravellerInformationEditScreenContract$InputData travelHotelsTravellerInformationEditScreenContract$InputData) {
        this.f141750b = dVar;
        this.f141749a = travelHotelsTravellerInformationEditScreenContract$InputData;
        int i = 3;
        this.f141751c = e4m.b.b(new e0(dVar, this, 1, i));
        this.d = e4m.b.b(new e0(dVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
