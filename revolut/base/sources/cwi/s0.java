package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemeLoungesHowToAccessScreenContract$InputData f109766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109768c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f109770h;
    public final e4m.e i;

    public s0(h0 h0Var, ViewController viewController, SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData) {
        this.f109767b = h0Var;
        this.f109766a = schemeLoungesHowToAccessScreenContract$InputData;
        this.f109768c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new d0(h0Var, this, 0, 8));
        this.e = e4m.b.b(new d0(h0Var, this, 2, 8));
        this.f = e4m.b.b(new d0(h0Var, this, 1, 8));
        this.f109769g = e4m.b.b(new d0(h0Var, this, 4, 8));
        this.f109770h = e4m.b.b(new d0(h0Var, this, 5, 8));
        this.i = e4m.b.b(new d0(h0Var, this, 3, 8));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
