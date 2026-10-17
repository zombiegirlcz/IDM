package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsAmendmentConfirmationScreenContract$InputData f141604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141606c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f141608h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f141609j;

    public c(d dVar, g gVar, TravelHotelsAmendmentConfirmationScreenContract$InputData travelHotelsAmendmentConfirmationScreenContract$InputData) {
        this.f141605b = dVar;
        this.f141604a = travelHotelsAmendmentConfirmationScreenContract$InputData;
        int i = 16;
        this.f141606c = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.d = e4m.b.b(new fta.e(dVar, this, 0, i));
        this.e = e4m.b.b(new fta.e(dVar, this, 3, i));
        this.f = e4m.b.b(new fta.e(dVar, this, 2, i));
        this.f141607g = e4m.b.b(new fta.e(dVar, this, 5, i));
        this.f141608h = e4m.b.b(new fta.e(dVar, this, 4, i));
        this.i = e4m.b.b(new fta.e(dVar, this, 7, i));
        this.f141609j = e4m.b.b(new fta.e(dVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get(), (yji.n) this.f141608h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
