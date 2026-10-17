package ma;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.ca;
import tof.i7;

/* JADX INFO: loaded from: classes16.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f203857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f203857w = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f203857w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.domain.interactors.transactions.a aVar2 = uVar.f203861q;
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {new ca(this.f203857w)};
            cVar.getClass();
            ufm.i iVarB = com.revolut.domain.interactors.transactions.a.b(aVar2, i7.c.a(i7VarArr), null, null, null, null, 30);
            this.u = 1;
            obj2 = nim.a.b(iVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        uVar.H2(uVar.f203862r, new lsl.d((List) obj2, 5));
        return Unit.f186387a;
    }
}
