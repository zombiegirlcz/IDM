package u20;

import com.revolut.chat.data.network.InAppCallSupportApi;
import gim.i;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f276516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ UUID f276517x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, UUID uuid, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276516w = fVar;
        this.f276517x = uuid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f276516w, this.f276517x, continuation, 0);
            default:
                return new d(this.f276516w, this.f276517x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    efm.b bVarCancelTicket = this.f276516w.f276519a.cancelTicket(this.f276517x);
                    this.v = 1;
                    if (nim.a.a(bVarCancelTicket, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                InAppCallSupportApi inAppCallSupportApi = this.f276516w.f276520b;
                this.v = 1;
                Object objCheckInAppCallAvailability = inAppCallSupportApi.checkInAppCallAvailability(this.f276517x, this);
                return objCheckInAppCallAvailability == aVar2 ? aVar2 : objCheckInAppCallAvailability;
        }
    }
}
