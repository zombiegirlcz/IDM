package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsBaggageSelectionScreenContract$InputData f132093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f132095c = e4m.b.b(new euh.a(this, 1, 13));
    public final e4m.e d = e4m.b.b(new euh.a(this, 0, 13));
    public final e4m.e e = e4m.b.b(new euh.a(this, 3, 13));
    public final e4m.e f = e4m.b.b(new euh.a(this, 2, 13));

    public d(b bVar, p pVar, TravelFlightsBaggageSelectionScreenContract$InputData travelFlightsBaggageSelectionScreenContract$InputData) {
        this.f132094b = bVar;
        this.f132093a = travelFlightsBaggageSelectionScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
