package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlowContract$InputData$Amendment;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 implements xki.c, keg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomsSelectionFlowContract$InputData$Amendment f141775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f141777c = this;
    public final e4m.e d;
    public final e4m.e e;

    public p0(d dVar, TravelHotelsRoomsSelectionFlowContract$InputData$Amendment travelHotelsRoomsSelectionFlowContract$InputData$Amendment) {
        this.f141776b = dVar;
        this.f141775a = travelHotelsRoomsSelectionFlowContract$InputData$Amendment;
        int i = 24;
        this.d = e4m.b.b(new fd2.n(this, 0, i));
        this.e = e4m.b.b(new fd2.n(this, 1, i));
    }

    @Override // keg.a
    public final i1 b() {
        return new i1(this.f141776b, this.f141777c, 0);
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
