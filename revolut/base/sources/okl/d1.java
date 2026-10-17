package okl;

import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class d1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Challenge f226166c;

    public /* synthetic */ d1(com.revolut.sso.impl.ui.auth.n nVar, Challenge challenge, int i) {
        this.f226164a = i;
        this.f226165b = nVar;
        this.f226166c = challenge;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226164a) {
            case 0:
                AuthenticationFlowContract$State update = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object value = ((j2) this.f226165b.m0.f22677a).getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State");
                }
                AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) value;
                return authenticationFlowContract$State.O9((2037 & 1) != 0 ? authenticationFlowContract$State.getF106298g() : false, (2037 & 2) != 0 ? authenticationFlowContract$State.getF106299h() : this.f226166c, (2037 & 4) != 0 ? authenticationFlowContract$State.getI() : null, (2037 & 8) != 0 ? authenticationFlowContract$State.getF106300j() : null, (2037 & 16) != 0 ? authenticationFlowContract$State.getK() : null, (2037 & 32) != 0 ? authenticationFlowContract$State.getF106301l() : null, (2037 & 64) != 0 ? authenticationFlowContract$State.getF106302m() : -1, (2037 & 128) != 0 ? authenticationFlowContract$State.getF106303n() : null, (2037 & 256) != 0 ? authenticationFlowContract$State.getO() : true, (2037 & 512) != 0 ? authenticationFlowContract$State.getF106304p() : true, (2037 & 1024) != 0 ? authenticationFlowContract$State.getF106305q() : false);
            default:
                AuthenticationFlowContract$State update2 = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Object value2 = ((j2) this.f226165b.m0.f22677a).getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State");
                }
                AuthenticationFlowContract$State authenticationFlowContract$State2 = (AuthenticationFlowContract$State) value2;
                return authenticationFlowContract$State2.O9((2037 & 1) != 0 ? authenticationFlowContract$State2.getF106298g() : false, (2037 & 2) != 0 ? authenticationFlowContract$State2.getF106299h() : this.f226166c, (2037 & 4) != 0 ? authenticationFlowContract$State2.getI() : null, (2037 & 8) != 0 ? authenticationFlowContract$State2.getF106300j() : null, (2037 & 16) != 0 ? authenticationFlowContract$State2.getK() : null, (2037 & 32) != 0 ? authenticationFlowContract$State2.getF106301l() : null, (2037 & 64) != 0 ? authenticationFlowContract$State2.getF106302m() : -1, (2037 & 128) != 0 ? authenticationFlowContract$State2.getF106303n() : null, (2037 & 256) != 0 ? authenticationFlowContract$State2.getO() : true, (2037 & 512) != 0 ? authenticationFlowContract$State2.getF106304p() : true, (2037 & 1024) != 0 ? authenticationFlowContract$State2.getF106305q() : false);
        }
    }
}
