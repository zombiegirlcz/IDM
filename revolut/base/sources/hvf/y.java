package hvf;

import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements ewf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f155985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TicketDetailsScreenContract$InputData f155986c;

    public y(q qVar) {
        this.f155984a = qVar;
    }

    @Override // ewf.a
    public final ewf.a P(TicketDetailsScreenContract$InputData ticketDetailsScreenContract$InputData) {
        ticketDetailsScreenContract$InputData.getClass();
        this.f155986c = ticketDetailsScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f155985b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f155985b, ViewController.class);
        vc.s.h(this.f155986c, TicketDetailsScreenContract$InputData.class);
        return new x(this.f155984a, this.f155985b, this.f155986c);
    }
}
