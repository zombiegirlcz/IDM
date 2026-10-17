package h8e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreen;
import com.revolut.feature.vaults.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ UserPermissionEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(UserPermissionEditScreen userPermissionEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = userPermissionEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UserPermissionEditScreen userPermissionEditScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                userPermissionEditScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((f) userPermissionEditScreen.Z.getValue());
                if (((e) iVar.t2()).f150021b.isEmpty()) {
                    iVar.l2(new h(iVar, null), new gwc.h(1, iVar, q7e.b.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 17));
                } else {
                    iVar.f150025q.x(q7e.a.a(new TextLocalisedClause(R$string.vaults_withdrawal_permissions_grant_alert_title, null, null, 14), new TextLocalisedClause(R$string.vaults_withdrawal_permissions_grant_alert_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.vaults_common_action_sure, null, null, 14), null, null, 52));
                }
                break;
        }
        return Unit.f186387a;
    }
}
