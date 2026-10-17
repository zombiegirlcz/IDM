package krc;

import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
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
        mqc.f fVar = ((aqc.h) kVar).d;
        if (account instanceof SalarySwitchPreview.Account.Card) {
            mqc.k kVar2 = (mqc.k) fVar;
            kVar2.getClass();
            mqc.i iVar = new mqc.i(kVar2, (SalarySwitchPreview.Account.Card) account, null);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, iVar, this);
        } else {
            if (!(account instanceof SalarySwitchPreview.Account.Clabe)) {
                throw new NoWhenBranchMatchedException();
            }
            mqc.k kVar3 = (mqc.k) fVar;
            kVar3.getClass();
            mqc.j jVar = new mqc.j(kVar3, (SalarySwitchPreview.Account.Clabe) account, null);
            p0 p0Var2 = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, jVar, this);
        }
        return objJ == aVar ? aVar : objJ;
    }
}
