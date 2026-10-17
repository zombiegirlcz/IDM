package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFavouritesCounterpartChooserScreenContract$InputData f214472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f214473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f214474c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public k(e eVar, c cVar, BaseScreen baseScreen, SharedFavouritesCounterpartChooserScreenContract$InputData sharedFavouritesCounterpartChooserScreenContract$InputData) {
        this.f214472a = sharedFavouritesCounterpartChooserScreenContract$InputData;
        this.f214473b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 19;
        this.f214474c = e4m.b.b(new s(eVar, this, 1, i));
        this.d = e4m.b.b(new s(eVar, this, 0, i));
        this.e = e4m.b.b(new s(eVar, this, 3, i));
        this.f = e4m.b.b(new s(eVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
