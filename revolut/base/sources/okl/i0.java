package okl;

import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226193c;
    public final /* synthetic */ String d;

    public /* synthetic */ i0(com.revolut.sso.impl.ui.auth.n nVar, com.revolut.sso.impl.ui.auth.n nVar2, String str, int i) {
        this.f226191a = i;
        this.f226192b = nVar;
        this.f226193c = nVar2;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226191a) {
            case 0:
                AuthenticationFlowContract$State update = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object value = ((j2) this.f226192b.m0.f22677a).getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.SignIn");
                }
                Set k = ((AuthenticationFlowContract$State) ((j2) this.f226193c.m0.f22677a).getValue()).getK();
                Claim.Companion companion = Claim.INSTANCE;
                String str = this.d;
                Claim.Email email = new Claim.Email(str);
                companion.getClass();
                return AuthenticationFlowContract$State.SignIn.a((AuthenticationFlowContract$State.SignIn) value, new Claim.Email(str), zhm.a1.m(k, Claim.Companion.a(email)), null, 130043);
            default:
                AuthenticationFlowContract$State update2 = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Object value2 = ((j2) this.f226192b.m0.f22677a).getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.SignIn");
                }
                Set k3 = ((AuthenticationFlowContract$State) ((j2) this.f226193c.m0.f22677a).getValue()).getK();
                Claim.Companion companion2 = Claim.INSTANCE;
                String str2 = this.d;
                Claim.Phone phone = new Claim.Phone(str2);
                companion2.getClass();
                return AuthenticationFlowContract$State.SignIn.a((AuthenticationFlowContract$State.SignIn) value2, new Claim.Phone(str2), zhm.a1.m(k3, Claim.Companion.a(phone)), null, 130043);
        }
    }
}
