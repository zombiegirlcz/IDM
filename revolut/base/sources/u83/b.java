package u83;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ AskLocationSecurityPromptController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AskLocationSecurityPromptController askLocationSecurityPromptController, Continuation continuation) {
        super(2, continuation);
        this.u = askLocationSecurityPromptController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) ((h) this.u.M.getValue());
        if (gVar.f278101p.c("android.permission.ACCESS_FINE_LOCATION")) {
            gVar.n2(new f(gVar, null, 0), new whi.b(6));
        } else {
            knm.b.j(gVar.l1(), new com.revolut.kompot.common.c(new PermissionsFlow(q0.c(new Pair("android.permission.ACCESS_FINE_LOCATION", PermissionsFlowContract$Explanation.None.f98339a))), new u6b.k(gVar, 8), 2));
        }
        return Unit.f186387a;
    }
}
