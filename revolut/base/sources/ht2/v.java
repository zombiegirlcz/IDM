package ht2;

import com.revolut.data.model.Data;
import hea.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f155244w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155244w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f155244w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f155244w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            default:
                v vVar3 = new v(this.f155244w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        w wVar = this.f155244w;
        switch (i) {
            case 0:
                ru.w wVar2 = (ru.w) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wVar.H2(wVar.f155249t, new hs4.l(wVar2, 12));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wVar.H2(wVar.f155249t, new e0(data, 22));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wVar.H2(wVar.f155249t, new e0(data2, 23));
                break;
        }
        return Unit.f186387a;
    }
}
