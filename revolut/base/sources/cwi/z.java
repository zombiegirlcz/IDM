package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.entries.AirportLoungePassCheckoutEntriesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungePassCheckoutEntriesScreenContract$InputData f109823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109825c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public z(h0 h0Var, y yVar, ViewController viewController, AirportLoungePassCheckoutEntriesScreenContract$InputData airportLoungePassCheckoutEntriesScreenContract$InputData) {
        this.f109824b = h0Var;
        this.f109823a = airportLoungePassCheckoutEntriesScreenContract$InputData;
        this.f109825c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new bt7.e(h0Var, this, 0, 27));
        this.e = e4m.b.b(new bt7.e(h0Var, this, 2, 27));
        this.f = e4m.b.b(new bt7.e(h0Var, this, 1, 27));
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
