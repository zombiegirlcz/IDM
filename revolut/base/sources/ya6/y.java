package ya6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends gim.i implements Function3 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i) {
        super(3, null);
        this.u = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new y(3, 0, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 1:
                return new y(3, 1, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 2:
                return new y(3, 2, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 3:
                return new y(3, 3, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 4:
                return new y(3, 4, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 5:
                return new y(3, 5, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 6:
                return new y(3, 6, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 7:
                return new y(3, 7, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            default:
                return new y(3, 8, (Continuation) obj4).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i = jli.h.f175850a;
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i2 = jli.h.f175850a;
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
