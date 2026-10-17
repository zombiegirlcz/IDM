package n5k;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212638w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212638w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f212638w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f212638w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        y yVar = (y) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(yVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f212638w;
        switch (i) {
            case 0:
                y yVar = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.f212652r.x(yVar);
                break;
            default:
                y yVar2 = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a aVar3 = pVar.f212652r;
                Intrinsics.h(yVar2);
                aVar3.x(yVar2);
                break;
        }
        return Unit.f186387a;
    }
}
