package ej9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ai9.h f126790w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, ai9.h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
        this.f126790w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, this.f126790w, continuation, 0);
            default:
                return new b(this.v, this.f126790w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Integer dismissalCount;
        int i = this.u;
        ai9.h hVar = this.f126790w;
        c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = cVar.f126792a;
                gj9.a aVar2 = (gj9.a) j6.a.k(gj9.a.class, cVar2, c.a(hVar));
                if (aVar2 != null) {
                    cVar2.G(gj9.a.a(aVar2), c.a(hVar), wim.z.d(o0.b(gj9.a.class)));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = cVar.f126792a;
                gj9.a aVar4 = (gj9.a) j6.a.k(gj9.a.class, cVar3, c.a(hVar));
                cVar3.G(new gj9.a(null, new Long(System.currentTimeMillis()), new Integer(((aVar4 == null || (dismissalCount = aVar4.getDismissalCount()) == null) ? 0 : dismissalCount.intValue()) + 1)), c.a(hVar), wim.z.d(o0.b(gj9.a.class)));
                break;
        }
        return Unit.f186387a;
    }
}
