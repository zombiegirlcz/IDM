package j40;

import android.os.MessageQueue;
import com.revolut.chat.domain.model.LastMessage;
import gim.i;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nyb.q;
import skm.h2;
import skm.l;
import te0.w;
import v20.f0;
import v30.c0;
import v30.j;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f171273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171273w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f171273w, continuation, 0);
            case 1:
                return new e(this.f171273w, continuation, 1);
            default:
                return new e(this.f171273w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        LastMessage lastMessage;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    l30.b bVar = this.f171273w.f171274l;
                    this.v = 1;
                    v20.o oVar = ((l30.e) bVar).f191831a;
                    c0 feedType = c0.ASSISTANT;
                    f0 f0Var = (f0) oVar;
                    j jVarH = f0Var.h(feedType);
                    UUID lastMessageId = (jVarH == null || (lastMessage = jVarH.f285790j) == null) ? null : lastMessage.getServerId();
                    if (lastMessageId != null) {
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        Intrinsics.checkNotNullParameter(lastMessageId, "lastMessageId");
                        pfm.h hVar = new pfm.h(new r2d.e(f0Var, 18, j6.a.q("read_", feedType.d()), lastMessageId), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        objA = nim.a.a(w.g0(hVar), this);
                        if (objA != obj3) {
                            objA = Unit.f186387a;
                        }
                    } else {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    os2.g gVar = this.f171273w.f171275m;
                    this.v = 1;
                    l lVar = new l(1, fim.h.b(this));
                    lVar.u();
                    q80.a handler = new q80.a(lVar);
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    ((MessageQueue) gVar.f229224b).addIdleHandler(handler);
                    lVar.r(new q(gVar, handler, 13));
                    Object objT = lVar.t();
                    if (objT == aVar) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (objT != aVar) {
                        objT = Unit.f186387a;
                    }
                    if (objT == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                f fVar = this.f171273w;
                if (i3 == 0) {
                    o.b(obj2);
                    e eVar = new e(fVar, null, 1);
                    this.v = 1;
                    if (h2.d(2000L, eVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                l30.b bVar2 = fVar.f171274l;
                this.v = 2;
                if (((l30.e) bVar2).b(this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
