package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318403a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesSearchScreenContract$InputData f318404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318405c;
    public final e4m.e d;

    public l0(b bVar, j jVar, TravelExperiencesSearchScreenContract$InputData travelExperiencesSearchScreenContract$InputData) {
        this.f318404b = travelExperiencesSearchScreenContract$InputData;
        int i = 1;
        this.f318405c = e4m.b.b(new k0(bVar, this, 1, i));
        this.d = e4m.b.b(new k0(bVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f318403a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f318403a) {
        }
        return ImmutableSet.of();
    }

    public l0(b bVar, f fVar, TravelExperiencesSearchScreenContract$InputData travelExperiencesSearchScreenContract$InputData) {
        this.f318404b = travelExperiencesSearchScreenContract$InputData;
        int i = 0;
        this.f318405c = e4m.b.b(new k0(bVar, this, 1, i));
        this.d = e4m.b.b(new k0(bVar, this, 0, i));
    }
}
