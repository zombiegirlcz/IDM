package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements ho7.a, do7.a, zo7.a, fp7.a, z7a.c, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MtaFlowContract$InputData f247470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f247472c = this;
    public final e4m.e d;
    public final e4m.e e;

    public t0(k0 k0Var, MtaFlowContract$InputData mtaFlowContract$InputData) {
        this.f247471b = k0Var;
        this.f247470a = mtaFlowContract$InputData;
        int i = 16;
        this.d = e4m.b.b(new l(k0Var, this, 0, i));
        this.e = e4m.b.b(new l(k0Var, this, 1, i));
    }

    @Override // fp7.a
    public final x1 b() {
        return new x1(this.f247471b, this.f247472c, 0);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f247471b, this.f247472c, 5);
    }

    @Override // dki.t
    public final Set f() {
        gm7.d extension = (gm7.d) this.d.get();
        hm7.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return ImmutableSet.of(extension);
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // ho7.a
    public final s1 j() {
        return new s1(this.f247471b, this.f247472c, 1);
    }

    @Override // zo7.a
    public final u1 q() {
        return new u1(this.f247471b, this.f247472c, 0);
    }

    @Override // do7.a
    public final q1 s() {
        return new q1(this.f247471b, this.f247472c, 1);
    }
}
