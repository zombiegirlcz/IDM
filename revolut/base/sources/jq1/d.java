package jq1;

import com.revolut.feature.pay_bills_taxes.api.navigation.FormFlowInputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import gim.i;
import gq1.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xo1.g;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        eVar.f177408m.getClass();
        ViewController viewControllerO2 = eVar.o2(new ef9.e(new FormFlowInputData(g.F24, null)));
        jp3.b block = new jp3.b(eVar, this.v, 6);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        return eVar.A2(new com.revolut.kompot.common.b(viewControllerO2, (ModalDestination.Style) null, 6));
    }
}
