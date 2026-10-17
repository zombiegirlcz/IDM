package zd3;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yvk.n;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f321305w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f321305w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f321305w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f321305w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f321305w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f321305w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g(this.f321305w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            default:
                g gVar6 = new g(this.f321305w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f321305w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new n(data, 26));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new n(data2, 27));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new n(data3, 28));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new n(data4, 29));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new h(data5, 0));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.x2(new h(data6, 1));
                break;
        }
        return Unit.f186387a;
    }
}
