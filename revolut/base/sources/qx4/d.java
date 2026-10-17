package qx4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n14.k;
import w4l.j;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f250021w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, f fVar) {
        super(2, continuation);
        this.f250021w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(continuation, this.f250021w);
                dVar.v = ((Boolean) obj2).booleanValue();
                return dVar;
            default:
                d dVar2 = new d(this.f250021w, continuation);
                dVar2.v = ((Boolean) obj2).booleanValue();
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        switch (this.u) {
            case 0:
                bool.booleanValue();
                break;
            default:
                bool.getClass();
                break;
        }
        return ((d) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.f250021w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return z ? new go.g(new Data(Boolean.TRUE, null, false, 6, null), 2) : k.p(fVar.c(w4l.h.f294642c), e.f250022a);
            default:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return z3 ? new go.g(new Data(Boolean.TRUE, null, false, 6, null), 2) : fVar.c(j.f294644c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f250021w = fVar;
    }
}
