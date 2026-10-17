package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomDetailsScreenContract$InputData f141664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141666c;
    public final e4m.e d;
    public final e4m.e e;

    public f0(d dVar, n nVar, TravelHotelsRoomDetailsScreenContract$InputData travelHotelsRoomDetailsScreenContract$InputData) {
        this.f141664a = travelHotelsRoomDetailsScreenContract$InputData;
        int i = 0;
        this.f141665b = e4m.b.b(new e0(dVar, this, 1, i));
        this.f141666c = e4m.b.b(new e0(dVar, this, 0, i));
        this.d = e4m.b.b(new e0(dVar, this, 3, i));
        this.e = e4m.b.b(new e0(dVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f141666c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
