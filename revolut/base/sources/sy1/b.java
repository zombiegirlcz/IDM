package sy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ my1.a f266568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ ApmContact f266569x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        my1.a aVar = (my1.a) obj2;
        ApmContact apmContact = (ApmContact) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(3, 0, continuation);
                bVar.f266568w = aVar;
                bVar.f266569x = apmContact;
                return bVar.invokeSuspend(Unit.f186387a);
            default:
                b bVar2 = new b(3, 1, continuation);
                bVar2.f266568w = aVar;
                bVar2.f266569x = apmContact;
                return bVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                my1.a aVar = this.f266568w;
                ApmContact apmContact = this.f266569x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.f266568w = null;
                this.f266569x = null;
                this.v = 1;
                Object objE = aVar.e(apmContact, this);
                return objE == aVar2 ? aVar2 : objE;
            default:
                my1.a aVar3 = this.f266568w;
                ApmContact apmContact2 = this.f266569x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.f266568w = null;
                this.f266569x = null;
                this.v = 1;
                Object objH = aVar3.h(apmContact2, this);
                return objH == aVar4 ? aVar4 : objH;
        }
    }
}
