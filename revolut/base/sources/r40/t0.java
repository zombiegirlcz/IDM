package r40;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import r40.b;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ x0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UUID f251368w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, UUID uuid, Continuation continuation) {
        super(2, continuation);
        this.v = x0Var;
        this.f251368w = uuid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t0(this.v, this.f251368w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        x0 x0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r25.a aVar2 = new r25.a(x0Var, this.f251368w, continuation, 1);
            this.u = 1;
            obj2 = x0Var.p2(this, aVar2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        UUID uuid = ((v30.j) obj2).f285785a;
        x0Var.v2(new b.C1386b(uuid, uuid, null, 4));
        return Unit.f186387a;
    }
}
