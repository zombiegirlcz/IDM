package uv6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import unc.y;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f283334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283334w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f283334w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f283334w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            default:
                j jVar3 = new j(this.f283334w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f283334w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lVar.H2(lVar.f283339s, new y(data, 21));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lVar.H2(lVar.f283339s, new y(data2, 22));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lVar.H2(lVar.f283339s, new y(data3, 23));
                break;
        }
        return Unit.f186387a;
    }
}
