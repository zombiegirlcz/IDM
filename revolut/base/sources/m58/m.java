package m58;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.withdraw.b f202867w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.joint.impl.ui.withdraw.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f202867w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f202867w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f202867w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            case 2:
                m mVar3 = new m(this.f202867w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
            default:
                m mVar4 = new m(this.f202867w, continuation, 3);
                mVar4.v = obj2;
                return mVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.joint.impl.ui.withdraw.b bVar = this.f202867w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new l(data, 0));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new l(data2, 1));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new l(data3, 2));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new l(data4, 3));
                break;
        }
        return Unit.f186387a;
    }
}
