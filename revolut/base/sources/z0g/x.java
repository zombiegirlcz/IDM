package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318466a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesBookingsScreenContract$InputData f318467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f318468c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public x(b bVar, j jVar, TravelExperiencesBookingsScreenContract$InputData travelExperiencesBookingsScreenContract$InputData) {
        this.f318468c = bVar;
        this.f318467b = travelExperiencesBookingsScreenContract$InputData;
        int i = 19;
        this.d = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 0, i));
        this.f = e4m.b.b(new yre.a(bVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f318466a) {
        }
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f318466a) {
        }
        return ImmutableSet.of();
    }

    public x(b bVar, q qVar, TravelExperiencesBookingsScreenContract$InputData travelExperiencesBookingsScreenContract$InputData) {
        this.f318468c = bVar;
        this.f318467b = travelExperiencesBookingsScreenContract$InputData;
        int i = 18;
        this.d = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 0, i));
        this.f = e4m.b.b(new yre.a(bVar, this, 2, i));
    }
}
