package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.password_flow.password_input.PasswordInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordInputScreenContract$InputData f195977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f195978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195979c;

    public i0(q0 q0Var, h0 h0Var, PasswordInputScreenContract$InputData passwordInputScreenContract$InputData) {
        this.f195977a = passwordInputScreenContract$InputData;
        int i = 2;
        this.f195978b = e4m.b.b(new u(q0Var, this, 1, i));
        this.f195979c = e4m.b.b(new u(q0Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
