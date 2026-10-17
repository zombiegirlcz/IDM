package a27;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i) {
        super(1, null);
        this.u = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(1, 0, continuation);
            case 1:
                return new d(1, 1, continuation);
            case 2:
                return new d(1, 2, continuation);
            case 3:
                return new d(1, 3, continuation);
            case 4:
                return new d(1, 4, continuation);
            case 5:
                return new d(1, 5, continuation);
            case 6:
                return new d(1, 6, continuation);
            case 7:
                return new d(1, 7, continuation);
            case 8:
                return new d(1, 8, continuation);
            case 9:
                return new d(1, 9, continuation);
            case 10:
                return new d(1, 10, continuation);
            case 11:
                return new d(1, 11, continuation);
            case 12:
                return new d(1, 12, continuation);
            case 13:
                return new d(1, 13, continuation);
            case 14:
                return new d(1, 14, continuation);
            case 15:
                return new d(1, 15, continuation);
            case 16:
                return new d(1, 16, continuation);
            case 17:
                return new d(1, 17, continuation);
            case 18:
                return new d(1, 18, continuation);
            case 19:
                return new d(1, 19, continuation);
            case 20:
                return new d(1, 20, continuation);
            default:
                return new d(1, 21, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
            case 11:
                ((d) create(continuation)).invokeSuspend(Unit.f186387a);
                break;
            case 12:
                ((d) create(continuation)).invokeSuspend(Unit.f186387a);
                break;
            case 13:
                ((d) create(continuation)).invokeSuspend(Unit.f186387a);
                break;
            case 14:
                ((d) create(continuation)).invokeSuspend(Unit.f186387a);
                break;
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
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
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            default:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
