package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesDisclaimerAcceptanceContract$InputData f109689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109691c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g0(h0 h0Var, b0 b0Var, ViewController viewController, AirportLoungesDisclaimerAcceptanceContract$InputData airportLoungesDisclaimerAcceptanceContract$InputData) {
        this.f109690b = h0Var;
        this.f109689a = airportLoungesDisclaimerAcceptanceContract$InputData;
        this.f109691c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new d0(h0Var, this, 0, 1));
        this.e = e4m.b.b(new d0(h0Var, this, 2, 1));
        this.f = e4m.b.b(new d0(h0Var, this, 1, 1));
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
