package ulh;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f281004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281004w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f281004w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f281004w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        od0.i iVar = (od0.i) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(iVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f281004w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                LocalDate localDate = (LocalDate) iVar.f224257a;
                if (localDate != null) {
                    ne0.j jVar = (ne0.j) nVar.f281021b.get();
                    n.Companion.getClass();
                    jVar.f(n.f, localDate);
                }
                break;
            default:
                od0.i iVar2 = (od0.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ne0.j jVar2 = (ne0.j) nVar.f281021b.get();
                n.Companion.getClass();
                jVar2.f(n.f281017g, iVar2);
                break;
        }
        return Unit.f186387a;
    }
}
