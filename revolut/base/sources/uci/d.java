package uci;

import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pci.b;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.transaction_countries.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f279039w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature_retail_user_declarations.transaction_countries.flow.a aVar, Set set, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f279039w = set;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f279039w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_retail_user_declarations.transaction_countries.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f97771p;
            String str = aVar2.o.f97751a;
            Set<TransactionDestination> set = this.f279039w;
            ArrayList arrayList = new ArrayList(w.t(set, 10));
            for (TransactionDestination transactionDestination : set) {
                wi0.b bVar = transactionDestination.f97773a;
                dj0.d dVar = transactionDestination.f97774b;
                yci.a aVar4 = transactionDestination.f97775c;
                arrayList.add(new MobileScreenParams.TransactionActivity.CountryTransaction(dVar, aVar4 != null ? aVar4.name() : null, bVar));
            }
            MobileScreenParams.TransactionActivity transactionActivity = new MobileScreenParams.TransactionActivity(arrayList);
            this.u = 1;
            if (aVar3.j(str, transactionActivity, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(b.a.f234919a);
        return Unit.f186387a;
    }
}
