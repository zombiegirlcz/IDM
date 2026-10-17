package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreenContract$InputData;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFavouritesInitScreenContract$InputData f214481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f214482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f214483c;

    public m(e eVar, g gVar, SharedFavouritesInitScreenContract$InputData sharedFavouritesInitScreenContract$InputData) {
        this.f214481a = sharedFavouritesInitScreenContract$InputData;
        int i = 22;
        this.f214482b = e4m.b.b(new s(eVar, this, 1, i));
        this.f214483c = e4m.b.b(new s(eVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
