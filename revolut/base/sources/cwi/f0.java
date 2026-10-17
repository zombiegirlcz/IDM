package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements qji.a, vwi.a, txi.a, hyi.b, zwi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungeSearchFlowContract$InputData f109667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f109669c = this;
    public final e4m.e d = e4m.b.b(new c2h.a(this, 22));

    public f0(h0 h0Var, AirportLoungeSearchFlowContract$InputData airportLoungeSearchFlowContract$InputData) {
        this.f109668b = h0Var;
        this.f109667a = airportLoungeSearchFlowContract$InputData;
    }

    @Override // vwi.a
    public final t0 c() {
        return new t0(this.f109668b, this.f109669c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hyi.b
    public final hyi.a j() {
        return new b1(this.f109668b, this.f109669c, 2);
    }

    @Override // zwi.a
    public final v0 s() {
        return new v0(this.f109668b, this.f109669c, 0);
    }

    @Override // txi.a
    public final z0 y() {
        return new z0(this.f109668b, this.f109669c, 0);
    }
}
