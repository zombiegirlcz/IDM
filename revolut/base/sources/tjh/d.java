package tjh;

import com.revolut.core.ui_kit.delegates.vh;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ aah.g f271723w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(aah.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271723w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f271723w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f271723w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f271723w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((bih.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        aah.g gVar = this.f271723w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bih.a) gVar.e).k3(aVar);
                return Unit.f186387a;
            case 1:
                bih.a aVar3 = (bih.a) gVar.e;
                bih.k kVar = (bih.k) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (kVar instanceof bih.i) {
                    bih.i iVar = (bih.i) kVar;
                    koi.h hVar = iVar.f15501c;
                    ArrayList arrayListF1 = zhm.d0.f1(hVar.b());
                    arrayListF1.add(iVar.f15500b, (koi.j) arrayListF1.remove(iVar.f15499a));
                    hVar.c(arrayListF1);
                    aVar3.i3(arrayListF1);
                } else {
                    if (!(kVar instanceof bih.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.h3(((bih.j) kVar).f15502a);
                }
                return Unit.f186387a;
            default:
                vh vhVar = (vh) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bih.a) gVar.e).n3(vhVar);
                return Unit.f186387a;
        }
    }
}
