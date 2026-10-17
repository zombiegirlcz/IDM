package okl;

import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f226201c;

    public /* synthetic */ j1(com.revolut.sso.impl.ui.auth.n nVar, boolean z, int i) {
        this.f226199a = i;
        this.f226200b = nVar;
        this.f226201c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226199a) {
            case 0:
                AuthenticationFlowContract$State update = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object value = ((j2) this.f226200b.m0.f22677a).getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.ExternalClientAuthentication");
                }
                AuthenticationFlowContract$State.ExternalClientAuthentication externalClientAuthentication = (AuthenticationFlowContract$State.ExternalClientAuthentication) value;
                return (AuthenticationFlowContract$State.ExternalClientAuthentication) externalClientAuthentication.O9((2037 & 1) != 0 ? externalClientAuthentication.getF106298g() : this.f226201c, (2037 & 2) != 0 ? externalClientAuthentication.getF106299h() : null, (2037 & 4) != 0 ? externalClientAuthentication.getI() : null, (2037 & 8) != 0 ? externalClientAuthentication.getF106300j() : null, (2037 & 16) != 0 ? externalClientAuthentication.getK() : null, (2037 & 32) != 0 ? externalClientAuthentication.getF106301l() : null, (2037 & 64) != 0 ? externalClientAuthentication.getF106302m() : -1, (2037 & 128) != 0 ? externalClientAuthentication.getF106303n() : null, (2037 & 256) != 0 ? externalClientAuthentication.getO() : true, (2037 & 512) != 0 ? externalClientAuthentication.getF106304p() : true, (2037 & 1024) != 0 ? externalClientAuthentication.getF106305q() : false);
            default:
                AuthenticationFlowContract$State update2 = (AuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Object value2 = ((j2) this.f226200b.m0.f22677a).getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.State.OperationBoundAuthentication");
                }
                AuthenticationFlowContract$State.OperationBoundAuthentication operationBoundAuthentication = (AuthenticationFlowContract$State.OperationBoundAuthentication) value2;
                return (AuthenticationFlowContract$State.OperationBoundAuthentication) operationBoundAuthentication.O9((2037 & 1) != 0 ? operationBoundAuthentication.getF106298g() : this.f226201c, (2037 & 2) != 0 ? operationBoundAuthentication.getF106299h() : null, (2037 & 4) != 0 ? operationBoundAuthentication.getI() : null, (2037 & 8) != 0 ? operationBoundAuthentication.getF106300j() : null, (2037 & 16) != 0 ? operationBoundAuthentication.getK() : null, (2037 & 32) != 0 ? operationBoundAuthentication.getF106301l() : null, (2037 & 64) != 0 ? operationBoundAuthentication.getF106302m() : -1, (2037 & 128) != 0 ? operationBoundAuthentication.getF106303n() : null, (2037 & 256) != 0 ? operationBoundAuthentication.getO() : true, (2037 & 512) != 0 ? operationBoundAuthentication.getF106304p() : true, (2037 & 1024) != 0 ? operationBoundAuthentication.getF106305q() : false);
        }
    }
}
