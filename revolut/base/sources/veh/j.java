package veh;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vch.s0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f288334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Continuation continuation, k kVar) {
        super(2, continuation);
        this.u = i;
        this.f288334w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(0, continuation, this.f288334w);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(1, continuation, this.f288334w);
                jVar2.v = obj2;
                return jVar2;
            default:
                j jVar3 = new j(2, continuation, this.f288334w);
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
        k kVar = this.f288334w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.H2(kVar.u, new s0(data, 4));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.H2(kVar.u, new s0(data2, 5));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.I2(new s0(kVar, data3));
                break;
        }
        return Unit.f186387a;
    }
}
