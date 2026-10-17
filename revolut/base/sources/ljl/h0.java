package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements qji.a, he9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordFlowContract$InputData f195966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UICustomization f195967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f195968c;
    public final h0 d = this;
    public final e4m.e e;

    public h0(q0 q0Var, PasswordFlowContract$InputData passwordFlowContract$InputData, UICustomization uICustomization) {
        this.f195968c = q0Var;
        this.f195966a = passwordFlowContract$InputData;
        this.f195967b = uICustomization;
        this.e = e4m.b.b(new ld1.g(q0Var, this, 13));
    }

    @Override // he9.k
    public final he9.f b() {
        return new he9.f(this.f195968c, this.d, 3);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
