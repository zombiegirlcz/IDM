package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 implements j7g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f132217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132218c;
    public TravelFlightsTicketRulesScreenContract$InputData d;

    public x0(b bVar, p pVar) {
        this.f132216a = bVar;
        this.f132217b = pVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132218c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132218c, ViewController.class);
        vc.s.h(this.d, TravelFlightsTicketRulesScreenContract$InputData.class);
        return new y0(this.f132216a, this.f132217b, this.d);
    }

    @Override // j7g.a
    public final j7g.a j(TravelFlightsTicketRulesScreenContract$InputData travelFlightsTicketRulesScreenContract$InputData) {
        this.d = travelFlightsTicketRulesScreenContract$InputData;
        return this;
    }
}
