package c23;

import b93.f;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import hha.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d93.b f20627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f20628x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.card_order_new.impl.kompot.c cVar, d93.b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f20627w = bVar;
        this.f20628x = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f20627w, this.f20628x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.card_order_new.impl.kompot.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = com.revolut.feature.card_order_new.impl.kompot.c.O2(cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        b93.f fVarA = ((CheckoutParams.CardOrder) obj2).f65850a;
        if (!(fVarA instanceof f.a) && !(fVarA instanceof f.b) && !(fVarA instanceof b93.h)) {
            if (!(fVarA instanceof b93.g)) {
                throw new NoWhenBranchMatchedException();
            }
            c93.j.Companion.getClass();
            fVarA = b93.g.a((b93.g) fVarA, this.f20627w, c93.j.f22287c, null, null, null, 4194031);
        }
        b93.f fVar = fVarA;
        u.Companion.getClass();
        u uVar = u.f152351j;
        List list = this.f20628x;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((hha.d) it8.next()).f152287a);
        }
        xfa.b bVar = ((CardOrderFlowContract$State) cVar.A2().f98429a).f65053g;
        if (bVar == null) {
            bVar = xfa.b.CARD_DELIVERY_OPTIONS_PITCH;
        }
        return cVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardForCheckout(fVar, uVar, arrayList, (FeatureCommand) null, bVar, (AccountId) null, (e93.d) null, ((CardOrderFlowContract$State) cVar.A2().f98429a).f65062s, 232))));
    }
}
