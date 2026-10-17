package wf0;

import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i) {
        super(2, null);
        this.u = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(2, 0, continuation);
            case 1:
                return new r0(2, 1, continuation);
            case 2:
                return new r0(2, 2, continuation);
            case 3:
                return new r0(2, 3, continuation);
            case 4:
                return new r0(2, 4, continuation);
            case 5:
                return new r0(2, 5, continuation);
            case 6:
                return new r0(2, 6, continuation);
            case 7:
                return new r0(2, 7, continuation);
            case 8:
                return new r0(2, 8, continuation);
            case 9:
                return new r0(2, 9, continuation);
            case 10:
                return new r0(2, 10, continuation);
            case 11:
                return new r0(2, 11, continuation);
            case 12:
                return new r0(2, 12, continuation);
            case 13:
                return new r0(2, 13, continuation);
            case 14:
                return new r0(2, 14, continuation);
            case 15:
                return new r0(2, 15, continuation);
            case 16:
                return new r0(2, 16, continuation);
            case 17:
                return new r0(2, 17, continuation);
            case 18:
                return new r0(2, 18, continuation);
            case 19:
                return new r0(2, 19, continuation);
            case 20:
                return new r0(2, 20, continuation);
            case 21:
                return new r0(2, 21, continuation);
            case 22:
                return new r0(2, 22, continuation);
            case 23:
                return new r0(2, 23, continuation);
            case 24:
                return new r0(2, 24, continuation);
            case 25:
                return new r0(2, 25, continuation);
            case 26:
                return new r0(2, 26, continuation);
            case 27:
                return new r0(2, 27, continuation);
            case 28:
                return new r0(2, 28, continuation);
            default:
                return new r0(2, 29, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((r0) create((cg0.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 1:
                break;
            case 2:
                ((r0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 3:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 4:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 5:
                ((r0) create((xr3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 6:
                break;
            case 7:
                ((r0) create((v1e.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 8:
                ((r0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 9:
                ((r0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 10:
                ((r0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 11:
                ((r0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 12:
                ((r0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 13:
                ((r0) create((DonationQuoteRequest) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 14:
                ((r0) create((ya6.w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 18:
                break;
            case 19:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 20:
                break;
            case 21:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 22:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 23:
                break;
            case 24:
                ((r0) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 25:
                break;
            case 26:
                ((r0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 27:
                ((r0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            case 28:
                ((r0) create((z34.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
            default:
                ((r0) create((zga.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                break;
        }
        return null;
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
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
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
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
