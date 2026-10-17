package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 implements j7g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsTicketRulesScreenContract$InputData f132227c;

    public z0(b bVar) {
        this.f132225a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132226b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132226b, ViewController.class);
        vc.s.h(this.f132227c, TravelFlightsTicketRulesScreenContract$InputData.class);
        return new y0(this.f132225a, this.f132227c);
    }

    @Override // j7g.a
    public final j7g.a j(TravelFlightsTicketRulesScreenContract$InputData travelFlightsTicketRulesScreenContract$InputData) {
        this.f132227c = travelFlightsTicketRulesScreenContract$InputData;
        return this;
    }
}
