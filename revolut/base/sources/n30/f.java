package n30;

import com.revolut.chat.domain.model.NewTicketContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f211624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ NewTicketContext.Transaction f211625x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, NewTicketContext.Transaction transaction, Continuation continuation) {
        super(2, continuation);
        this.f211624w = nVar;
        this.f211625x = transaction;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f211624w, this.f211625x, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                n nVar = this.f211624w;
                NewTicketContext.Transaction transaction = this.f211625x;
                m.Companion companion = yhm.m.INSTANCE;
                ksb.c cVar = (ksb.c) nVar.d.get();
                String str = transaction.f51065a;
                this.v = null;
                this.u = 1;
                obj2 = cVar.a(str, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            objA = (bef.a) obj2;
            m.Companion companion2 = yhm.m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        return new yhm.m(objA);
    }
}
