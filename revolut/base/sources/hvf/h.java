package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassengerDetailsScreenContract$InputData f155906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155908c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f155909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f155910h;
    public final e4m.e i;

    public h(q qVar, ViewController viewController, PassengerDetailsScreenContract$InputData passengerDetailsScreenContract$InputData) {
        this.f155907b = qVar;
        this.f155906a = passengerDetailsScreenContract$InputData;
        this.f155908c = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.d = e4m.b.b(new hjg.b(qVar, this, 2, i));
        this.e = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.f = e4m.b.b(new hjg.b(qVar, this, 0, i));
        this.f155909g = e4m.b.b(new hjg.b(qVar, this, 3, i));
        this.f155910h = e4m.b.b(new hjg.b(qVar, this, 5, i));
        this.i = e4m.b.b(new hjg.b(qVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155907b.f155949n.get(), (yji.n) this.f155909g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
