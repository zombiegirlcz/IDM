package zg4;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowController;
import com.revolut.kompot.common.ModalDestination;
import dh4.j;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ j u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = jVar;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        dh4.i iVar = (dh4.i) this.u;
        List list = iVar.f114749b;
        String str = iVar.f114748a;
        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a aVar2 = this.v;
        l.j2(aVar2, new RefinancingAccountDetailsInputFlowController(new RefinancingAccountDetailsInputFlowContract$InputData(str, list, aVar2.f68247p.f68245a)), ModalDestination.Style.POPUP.f98311a, null, 2);
        return Unit.f186387a;
    }
}
