package h87;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n87.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f149962w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149962w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f149962w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f149962w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(this.f149962w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f149962w;
        switch (i) {
            case 0:
                h hVar = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.d.d3(hVar.f149954a);
                break;
            case 1:
                g gVar = (g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.d.c3(gVar.f149953a);
                break;
            default:
                u uVar = (u) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.d.b3(uVar.f213271a);
                break;
        }
        return Unit.f186387a;
    }
}
