package cjd;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.impl.model.ShopsInstruction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.shops.impl.ui.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.shops.impl.ui.details.a aVar2 = this.v;
        y yVar = aVar2.D;
        aVar2.H2(yVar, new cbf.i(data, 27));
        od0.i iVar = (od0.i) data.getContent();
        aVar2.H2(yVar, new c7e.i(iVar != null ? (ShopsInstruction) iVar.f224257a : null, aVar2, 26));
        return Unit.f186387a;
    }
}
