package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.api.passcode.change.ChangePasscodeInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements xki.c, he9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangePasscodeInputData f195945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f195946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f195947c = this;
    public final e4m.e d;

    public g(q0 q0Var, ChangePasscodeInputData changePasscodeInputData) {
        this.f195946b = q0Var;
        this.f195945a = changePasscodeInputData;
        this.d = e4m.b.b(new ld1.g(q0Var, this, 10));
    }

    @Override // he9.k
    public final he9.f b() {
        return new he9.f(this.f195946b, this.f195947c, 2);
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
