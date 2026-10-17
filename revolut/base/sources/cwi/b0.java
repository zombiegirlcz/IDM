package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements xki.c, uyi.a, tyi.a, pxi.a, hyi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungePassDetailsFlowContract$InputData f109637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f109639c = this;
    public final e4m.e d;

    public b0(h0 h0Var, AirportLoungePassDetailsFlowContract$InputData airportLoungePassDetailsFlowContract$InputData) {
        this.f109638b = h0Var;
        this.f109637a = airportLoungePassDetailsFlowContract$InputData;
        this.d = e4m.b.b(new bt6.r(h0Var, this, 18));
    }

    @Override // pxi.a
    public final x0 b() {
        return new x0(this.f109638b, this.f109639c, 0);
    }

    @Override // tyi.a
    public final e1 c() {
        return new e1(this.f109638b, this.f109639c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hyi.b
    public final hyi.a j() {
        return new b1(this.f109638b, this.f109639c, 1);
    }

    @Override // uyi.a
    public final g1 q() {
        return new g1(this.f109638b, this.f109639c, 0);
    }
}
