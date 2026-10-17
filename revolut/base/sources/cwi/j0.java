package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesPassActivityFiltersScreenContract$InputData f109727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109729c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j0(h0 h0Var, p0 p0Var, ViewController viewController, AirportLoungesPassActivityFiltersScreenContract$InputData airportLoungesPassActivityFiltersScreenContract$InputData) {
        this.f109728b = h0Var;
        this.f109727a = airportLoungesPassActivityFiltersScreenContract$InputData;
        this.f109729c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new d0(h0Var, this, 0, 3));
        this.e = e4m.b.b(new d0(h0Var, this, 2, 3));
        this.f = e4m.b.b(new d0(h0Var, this, 1, 3));
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
