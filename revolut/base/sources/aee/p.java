package aee;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.api.navigation.PocketsListDestination;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q qVar = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                d0 d0VarR = osg.b.r(qVar.f3569p, qVar.o.f89404a.f89381a.f115083b, null, null, null, 62);
                this.u = 1;
                objB = nim.a.b(d0VarR, this);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objB = obj2;
            }
            io3.d dVar = (io3.d) objB;
            Intrinsics.h(dVar);
            return qVar.C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, (AccountId) AccountId.Personal.f51414a, true, false, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080)));
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            return qVar.C1(new PocketsListDestination(PocketListType.Main.f80780a));
        }
    }
}
