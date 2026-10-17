package m8c;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function1 {
    public dj0.d u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f203480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f203481x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Continuation continuation) {
        super(1, continuation);
        this.f203481x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f203481x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        xi0.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f203480w;
        q qVar = this.f203481x;
        if (i == 0) {
            yhm.o.b(obj2);
            dVar = ((j) zi0.c.I(((k) qVar.t2()).f203473a)).f203471a.e;
            xi0.b bVar2 = dVar.f115083b;
            this.u = dVar;
            this.v = bVar2;
            this.f203480w = 1;
            Serializable serializableY2 = q.y2(qVar, bVar2, this);
            if (serializableY2 == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = serializableY2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.v;
            dVar = this.u;
            yhm.o.b(obj2);
        }
        dj0.d dVar2 = (dj0.d) obj2;
        if (dVar2 != null) {
            dVar = (dj0.d) kotlin.ranges.f.c(pyd.c.H(dVar, dVar2), new dj0.d(0L, bVar));
        }
        return qVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, pte.a.NESTED_TOP_UP, 22)));
    }
}
