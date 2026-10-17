package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements qji.a, kn7.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarPolicyFlowContract$InputData f247407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f247409c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247410g;

    public o(k0 k0Var, BaseFlow baseFlow, CarPolicyFlowContract$InputData carPolicyFlowContract$InputData) {
        this.f247408b = k0Var;
        this.f247407a = carPolicyFlowContract$InputData;
        int i = 2;
        this.d = e4m.b.b(new l(k0Var, this, 0, i));
        this.e = e4m.b.b(new l(k0Var, this, 1, i));
        this.f = e4m.b.b(e4m.c.a(baseFlow));
        this.f247410g = e4m.b.b(new l(k0Var, this, 2, 2));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247408b, this.f247409c, 9);
    }

    @Override // dki.t
    public final Set f() {
        gm7.d extension = (gm7.d) this.d.get();
        dn7.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return ImmutableSet.of(extension);
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // kn7.a
    public final o1 j() {
        return new o1(this.f247408b, this.f247409c, 0);
    }
}
