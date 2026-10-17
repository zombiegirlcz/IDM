package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements xki.c, keg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomsSelectionScreenContract$InputData f141765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f141767c = this;
    public final e4m.e d;
    public final e4m.e e;

    public o0(d dVar, TravelHotelsRoomsSelectionScreenContract$InputData travelHotelsRoomsSelectionScreenContract$InputData) {
        this.f141766b = dVar;
        this.f141765a = travelHotelsRoomsSelectionScreenContract$InputData;
        int i = 4;
        this.d = e4m.b.b(new e0(dVar, this, 1, i));
        this.e = e4m.b.b(new e0(dVar, this, 0, i));
    }

    @Override // keg.a
    public final i1 b() {
        return new i1(this.f141766b, this.f141767c, 1);
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
