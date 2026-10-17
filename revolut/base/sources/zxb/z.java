package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTrophyRoomHighlightsSharingScreenContract$InputData f326314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f326315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326316c;
    public final e4m.e d;

    public z(e eVar, y yVar, RevPointsTrophyRoomHighlightsSharingScreenContract$InputData revPointsTrophyRoomHighlightsSharingScreenContract$InputData) {
        this.f326315b = eVar;
        this.f326314a = revPointsTrophyRoomHighlightsSharingScreenContract$InputData;
        int i = 1;
        this.f326316c = e4m.b.b(new s(eVar, this, 1, i));
        this.d = e4m.b.b(new s(eVar, this, 0, i));
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
