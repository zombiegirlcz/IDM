package wwj;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.feature.impl.userauth.screen.notifications.NotificationsPermissionScreen;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wvg.d0;
import yhm.o;
import yji.l;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ NotificationsPermissionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NotificationsPermissionScreen notificationsPermissionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = notificationsPermissionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) ((d) this.u.M.getValue());
        if (fVar.f300698p.a(33)) {
            l.i2(fVar, new PermissionsFlow(q0.c(new Pair("android.permission.POST_NOTIFICATIONS", PermissionsFlowContract$Explanation.None.f98339a))), null, new d0(fVar, 10), 1);
        } else {
            knm.b.j(fVar.l1(), new BridgeDestination(new IntentCommand(((s70.b) fVar.o).b(), null)));
            fVar.C2(p0j.c.f231546a);
        }
        return Unit.f186387a;
    }
}
