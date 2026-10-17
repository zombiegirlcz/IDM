package y20;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r10.q f310570x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(r10.q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310570x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f310570x, continuation, 0);
                yVar.f310569w = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(this.f310570x, continuation, 1);
                yVar2.f310569w = obj2;
                return yVar2;
            default:
                y yVar3 = new y(this.f310570x, continuation, 2);
                yVar3.f310569w = obj2;
                return yVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        p pVar = (p) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(pVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                p pVar = (p) this.f310569w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Intrinsics.i(pVar, "null cannot be cast to non-null type com.revolut.chat.data.repository.messages.MessagesLoadingContext.Default");
                UUID uuid = ((m) pVar).f310523a;
                this.f310569w = null;
                this.v = 1;
                r10.q qVar = this.f310570x;
                Object objPerformSuspending = DBUtil.performSuspending((RoomDatabase) qVar.f250849b, true, false, new r10.h(qVar, uuid, 0), this);
                return objPerformSuspending == aVar ? aVar : objPerformSuspending;
            case 1:
                p pVar2 = (p) this.f310569w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Intrinsics.i(pVar2, "null cannot be cast to non-null type com.revolut.chat.data.repository.messages.MessagesLoadingContext.Feed");
                UUID uuid2 = ((n) pVar2).f310525a;
                this.f310569w = null;
                this.v = 1;
                r10.q qVar2 = this.f310570x;
                Object objPerformSuspending2 = DBUtil.performSuspending((RoomDatabase) qVar2.f250849b, true, false, new r10.h(qVar2, uuid2, 1), this);
                return objPerformSuspending2 == aVar2 ? aVar2 : objPerformSuspending2;
            default:
                p pVar3 = (p) this.f310569w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Intrinsics.i(pVar3, "null cannot be cast to non-null type com.revolut.chat.data.repository.messages.MessagesLoadingContext.SingleFeed");
                v30.c0 c0Var = ((o) pVar3).f310529a;
                this.f310569w = null;
                this.v = 1;
                r10.q qVar3 = this.f310570x;
                Object objPerformSuspending3 = DBUtil.performSuspending((RoomDatabase) qVar3.f250849b, true, false, new r10.j(qVar3, c0Var, 1), this);
                return objPerformSuspending3 == aVar3 ? aVar3 : objPerformSuspending3;
        }
    }
}
