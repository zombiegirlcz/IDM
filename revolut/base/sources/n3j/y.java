package n3j;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d f212167w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f212167w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f212167w, continuation);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(1, this.f212167w, continuation);
                yVar2.v = obj2;
                return yVar2;
            default:
                y yVar3 = new y(2, this.f212167w, continuation);
                yVar3.v = obj2;
                return yVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y) create((n61.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar = this.f212167w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.K, new mtl.k(data, 21));
                break;
            case 1:
                n61.c cVar = (n61.c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.K, new n1.y(cVar, 14));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.K, new mtl.k(data2, 22));
                break;
        }
        return Unit.f186387a;
    }
}
