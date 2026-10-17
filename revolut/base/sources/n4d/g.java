package n4d;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f212358w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212358w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f212358w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f212358w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f212358w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f212358w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        m mVar = this.f212358w;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return skm.e0.C(coroutineScope, rd0.e.i(), null, new f(mVar, continuation, 0), 2);
            case 1:
                c cVar = (c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = cVar.f212351b;
                d dVar = m.Companion;
                return mVar.b(list);
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return skm.e0.C(coroutineScope2, rd0.e.i(), null, new f(mVar, continuation, 1), 2);
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o4d.a aVar5 = (o4d.a) j6.a.k(o4d.a.class, mVar.f, pair.toString());
                if (aVar5 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar5, "<this>");
                return new ogd.a(aVar5.getOrderingKey(), aVar5.getAssetPairIds());
        }
    }
}
