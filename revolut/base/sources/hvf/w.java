package hvf;

import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements ewf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f155972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f155973c;
    public TicketDetailsScreenContract$InputData d;

    public w(q qVar, r rVar) {
        this.f155971a = qVar;
        this.f155972b = rVar;
    }

    @Override // ewf.a
    public final ewf.a P(TicketDetailsScreenContract$InputData ticketDetailsScreenContract$InputData) {
        ticketDetailsScreenContract$InputData.getClass();
        this.d = ticketDetailsScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f155973c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f155973c, ViewController.class);
        vc.s.h(this.d, TicketDetailsScreenContract$InputData.class);
        return new x(this.f155971a, this.f155972b, this.f155973c, this.d);
    }
}
