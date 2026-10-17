package sh2;

import c12.y;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f263414w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, y yVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f263414w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f263414w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            qh2.a aVar2 = sVar.f263415l;
            this.u = 1;
            obj2 = ((qh2.h) aVar2).c(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        d dVar = sVar.f263417n;
        y yVar = this.f263414w;
        return sVar.A2(new com.revolut.kompot.common.b(sVar.o2(dVar.a((wi0.b) obj2, yVar.f20359b, yVar.f20358a)), (ModalDestination.Style) null, 6));
    }
}
