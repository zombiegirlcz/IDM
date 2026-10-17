package zga;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i) {
        super(2, null);
        this.u = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(2, 0, continuation);
            case 1:
                return new l(2, 1, continuation);
            default:
                return new l(2, 2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 1:
                ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            default:
                ((l) create((zuh.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
        }
        return null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
