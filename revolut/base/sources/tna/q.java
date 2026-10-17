package tna;

import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f272353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f272353w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f272353w, continuation, 0);
            default:
                return new q(this.f272353w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                r rVar = this.f272353w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    u7l.c cVar = rVar.f272356r;
                    EventAppearance eventAppearance = new EventAppearance("ID_EVENT_PRIDE");
                    this.v = 1;
                    obj2 = cVar.a(eventAppearance, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar.x2(new rk.b(((Boolean) obj2).booleanValue(), 15));
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    r rVar2 = this.f272353w;
                    Boolean bool = ((k) rVar2.t2()).f272345c;
                    if (bool == null) {
                        throw new IllegalStateException("pride appearance state is unavailable");
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    rVar2.x2(new rk.b(!zBooleanValue, 16));
                    this.v = 1;
                    EventAppearance eventAppearance2 = !zBooleanValue ? new EventAppearance("ID_EVENT_PRIDE") : new EventAppearance("ID_EVENT_REGULAR");
                    u7l.c cVar2 = rVar2.f272356r;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(eventAppearance2, "eventAppearance");
                    v7l.e eVar = cVar2.f277981b;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(eventAppearance2, "eventAppearance");
                    pfm.n nVar = new pfm.n(new to7.f(eVar, eventAppearance2, 12), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    Object objA = nim.a.a(w.g0(nVar), this);
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
