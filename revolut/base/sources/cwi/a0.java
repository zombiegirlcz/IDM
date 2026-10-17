package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f109622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirportLoungePassCheckoutScreenContract$InputData f109623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f109624c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f109626h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f109627j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f109628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f109629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f109630n;
    public final e4m.e o;

    public a0(h0 h0Var, y yVar, ViewController viewController, AirportLoungePassCheckoutScreenContract$InputData airportLoungePassCheckoutScreenContract$InputData) {
        this.f109624c = h0Var;
        this.f109622a = viewController;
        this.f109623b = airportLoungePassCheckoutScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.e = e4m.b.b(new bt7.e(h0Var, this, 0, i));
        this.f = e4m.b.b(new bt7.e(h0Var, this, 2, i));
        this.f109625g = e4m.b.b(new bt7.e(h0Var, this, 4, i));
        this.f109626h = e4m.b.b(new bt7.e(h0Var, this, 3, i));
        this.i = e4m.b.b(new bt7.e(h0Var, this, 5, i));
        this.f109627j = e4m.b.b(new bt7.e(h0Var, this, 1, i));
        this.k = e4m.b.b(new bt7.e(h0Var, this, 6, i));
        this.f109628l = e4m.b.b(new bt7.e(h0Var, this, 8, i));
        this.f109629m = e4m.b.b(new bt7.e(h0Var, this, 7, i));
        this.f109630n = e4m.b.b(new bt7.e(h0Var, this, 10, i));
        this.o = e4m.b.b(new bt7.e(h0Var, this, 9, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.k.get(), (yji.n) this.f109629m.get(), (yji.n) this.f109626h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f109627j.get());
    }
}
