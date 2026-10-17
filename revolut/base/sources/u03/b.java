package u03;

import efm.r;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e03.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f276041a;

    public b(c juniorCardUnsupportedSettingsProvider) {
        Intrinsics.checkNotNullParameter(juniorCardUnsupportedSettingsProvider, "juniorCardUnsupportedSettingsProvider");
        this.f276041a = juniorCardUnsupportedSettingsProvider;
    }

    @Override // e03.c
    public final r a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return this.f276041a.a(card);
    }

    @Override // e03.c
    public final boolean b() {
        return false;
    }

    @Override // e03.c
    public final boolean c() {
        return false;
    }
}
