package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungePassDetailsScreenContract$InputData f109644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109646c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109647g;

    public c0(h0 h0Var, b0 b0Var, ViewController viewController, AirportLoungePassDetailsScreenContract$InputData airportLoungePassDetailsScreenContract$InputData) {
        this.f109645b = h0Var;
        this.f109644a = airportLoungePassDetailsScreenContract$InputData;
        this.f109646c = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.d = e4m.b.b(new bt7.e(h0Var, this, 0, i));
        this.e = e4m.b.b(new bt7.e(h0Var, this, 3, i));
        this.f = e4m.b.b(new bt7.e(h0Var, this, 2, i));
        this.f109647g = e4m.b.b(new bt7.e(h0Var, this, 1, i));
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
