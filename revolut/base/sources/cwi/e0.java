package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungePassPassengersContract$InputData f109661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109663c;
    public final e4m.e d;
    public final e4m.e e;

    public e0(h0 h0Var, b0 b0Var, ViewController viewController, AirportLoungePassPassengersContract$InputData airportLoungePassPassengersContract$InputData) {
        this.f109662b = h0Var;
        this.f109661a = airportLoungePassPassengersContract$InputData;
        this.f109663c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new d0(h0Var, this, 0, 0));
        this.e = e4m.b.b(new d0(h0Var, this, 1, 0));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
