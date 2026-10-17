package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheetContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SignInSessionsBottomSheetContract$InputData f196094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f196095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196096c = e4m.b.b(new n(this, 2));

    public s0(q0 q0Var, u0 u0Var, SignInSessionsBottomSheetContract$InputData signInSessionsBottomSheetContract$InputData) {
        this.f196095b = u0Var;
        this.f196094a = signInSessionsBottomSheetContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196095b.f196114m.get());
    }
}
