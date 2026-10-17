package b4c;

import b4b.d0;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f12275w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12275w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f12275w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f12275w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f12275w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f12275w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f12284s, new d0(data, 1));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f12284s, new d0(data2, 2));
                break;
            default:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f12284s, new t((Data) hVar.f288433a, (Data) hVar.f288434b, (Data) hVar.f288435c, (Data) hVar.d, 0));
                break;
        }
        return Unit.f186387a;
    }
}
