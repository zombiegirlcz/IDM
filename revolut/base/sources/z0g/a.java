package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceLocationPickerScreenContract$InputData f318292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318294c;

    public a(b bVar, f fVar, TravelExperienceLocationPickerScreenContract$InputData travelExperienceLocationPickerScreenContract$InputData) {
        this.f318292a = travelExperienceLocationPickerScreenContract$InputData;
        int i = 5;
        this.f318293b = e4m.b.b(new yxj.c(this, 1, i));
        this.f318294c = e4m.b.b(new yxj.c(this, 0, i));
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
