package k50;

import k50.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class e4 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0.a f181059w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(j4 j4Var, n0.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
        this.f181059w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e4(this.v, this.f181059w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j4 j4Var = this.v;
        cli.y yVar = j4Var.f181140w0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            p2 p2Var = j4.Companion;
            obj2 = j4Var.g3(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            j4Var.H2(yVar, new l2(5));
        }
        j4Var.f181134s.getClass();
        n0.a aVar2 = this.f181059w;
        if (!((m0) aVar2).f181177a.isEmpty()) {
            j4Var.H2(yVar, new k0d.c(aVar2, 28));
        }
        return Unit.f186387a;
    }
}
