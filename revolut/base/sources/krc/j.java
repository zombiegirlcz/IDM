package krc;

import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar = this.v;
        aqc.k kVar = bVar.f85327p;
        SalarySwitchPreview.Account account = bVar.o.f85324a.f85230b;
        this.u = 1;
        Object objD = ((aqc.h) kVar).d(account, this);
        return objD == aVar ? aVar : objD;
    }
}
