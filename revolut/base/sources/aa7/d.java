package aa7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import vkm.t0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f2766w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2766w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f2766w, continuation, 0);
            default:
                return new d(this.f2766w, continuation, 1);
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
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    g gVar = this.f2766w;
                    Continuation continuation = null;
                    Object objO = q.o(q.Q(q.q(new c(new t0(gVar.f2376a, 1), 0)), new f(continuation, gVar.d.f2775b, 1)), new e(gVar, continuation, 2), this);
                    if (objO != obj3) {
                        objO = Unit.f186387a;
                    }
                    if (objO == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    g gVar2 = this.f2766w;
                    Continuation continuation2 = null;
                    Object objO2 = q.o(q.Q(q.q(new c(new t0(gVar2.f2376a, 1), 0)), new f(continuation2, gVar2.d.f2775b, 0)), new e(gVar2, continuation2, 1), this);
                    if (objO2 != obj4) {
                        objO2 = Unit.f186387a;
                    }
                    if (objO2 == obj4) {
                        return obj4;
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
