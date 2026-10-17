package qkl;

import bjl.a0;
import bjl.f0;
import bjl.o;
import bjl.r;
import bjl.v;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okl.n1;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends n implements h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n1 f247029l;

    public j(n1 authenticationInteractor) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        this.f247029l = authenticationInteractor;
    }

    public final g Z2(AuthenticationFlowContract$InputData authenticationFlowContract$InputData, AuthenticationFlowContract$State authenticationFlowContract$State) {
        this.f247029l.f226222c.a();
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
            return new e(o.f16181a);
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) {
            return new e(f0.f16165a);
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
            return new e(r.f16184a);
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
            return new e(v.f16190a);
        }
        if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
            return ((authenticationFlowContract$InputData instanceof AuthenticationFlowContract$InputData.SignIn) && (((AuthenticationFlowContract$InputData.SignIn) authenticationFlowContract$InputData).f106234c instanceof AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount)) ? new e(new a0(true)) : authenticationFlowContract$InputData.b4() ? new e(new a0(false)) : new f(0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
