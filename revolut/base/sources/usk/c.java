package usk;

import com.revolut.core.ui_kit.delegates.g6;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f282980w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f282980w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f282980w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f282980w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d dVar = this.f282980w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dVar.d.Z2(pair);
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dVar.d.b3(g6Var.f54199a);
                break;
        }
        return Unit.f186387a;
    }
}
