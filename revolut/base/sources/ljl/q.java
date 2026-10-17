package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements xki.c, he9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreatePasscodeFlowContract$InputData f196052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f196053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f196054c = this;
    public final e4m.e d = e4m.b.b(new kyk.n(this, 1, 25));
    public final e4m.e e = e4m.b.b(new kyk.n(this, 0, 25));

    public q(q0 q0Var, CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData) {
        this.f196053b = q0Var;
        this.f196052a = createPasscodeFlowContract$InputData;
    }

    @Override // he9.k
    public final he9.f b() {
        return new he9.f(this.f196053b, this.f196054c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
