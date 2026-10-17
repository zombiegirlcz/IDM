package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsSuggestedExperiencesScreenContract$InputData f141739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141741c;
    public final e4m.e d;
    public final e4m.e e;

    public m0(d dVar, t tVar, TravelHotelsSuggestedExperiencesScreenContract$InputData travelHotelsSuggestedExperiencesScreenContract$InputData) {
        this.f141739a = travelHotelsSuggestedExperiencesScreenContract$InputData;
        int i = 2;
        this.f141740b = e4m.b.b(new e0(dVar, this, 3, i));
        this.f141741c = e4m.b.b(new e0(dVar, this, 2, i));
        this.d = e4m.b.b(new e0(dVar, this, 1, i));
        this.e = e4m.b.b(new e0(dVar, this, 0, i));
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
