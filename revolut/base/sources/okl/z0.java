package okl;

import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Claim f226258c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ z0(com.revolut.sso.impl.ui.auth.n nVar, Claim claim, HashSet hashSet, int i) {
        this.f226256a = i;
        this.f226257b = nVar;
        this.f226258c = claim;
        this.d = hashSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226256a) {
            case 0:
                AuthenticationFlowContract$State update = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object value = ((j2) this.f226257b.m0.f22677a).getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.AccessRecovery");
                }
                return AuthenticationFlowContract$State.AccessRecovery.a((AuthenticationFlowContract$State.AccessRecovery) value, this.f226258c, this.d, 16251);
            default:
                AuthenticationFlowContract$State update2 = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Object value2 = ((j2) this.f226257b.m0.f22677a).getValue();
                if (value2 != null) {
                    return AuthenticationFlowContract$State.SignIn.a((AuthenticationFlowContract$State.SignIn) value2, this.f226258c, this.d, null, 130043);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.SignIn");
        }
    }
}
