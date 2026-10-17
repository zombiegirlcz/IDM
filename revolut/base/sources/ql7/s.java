package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.ClaimsFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements qji.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClaimsFlowContract$InputData f247456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f247458c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247460h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f247461j;

    public s(k0 k0Var, BaseFlow baseFlow, ClaimsFlowContract$InputData claimsFlowContract$InputData) {
        this.f247457b = k0Var;
        this.f247456a = claimsFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseFlow));
        int i = 29;
        this.e = e4m.b.b(new prk.u(this, 3, i));
        this.f = e4m.b.b(new prk.u(this, 2, i));
        this.f247459g = e4m.b.b(new prk.u(this, 1, i));
        this.f247460h = e4m.b.b(new prk.u(this, 0, i));
        this.i = e4m.b.b(new prk.u(this, 4, i));
        this.f247461j = e4m.b.b(new prk.u(this, 5, i));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247457b, this.f247458c, 7);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247460h.get(), (yji.d) this.i.get());
    }
}
