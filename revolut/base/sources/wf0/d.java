package wf0;

import com.revolut.core.faq.data.network.AiSearchService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ c f296872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f296873x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f296873x = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar = (c) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(this.f296873x, continuation, 0);
                dVar.f296872w = cVar;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                d dVar2 = new d(this.f296873x, continuation, 1);
                dVar2.f296872w = cVar;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                c cVar = this.f296872w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str = cVar.f296870a;
                    String str2 = cVar.f296871b;
                    AiSearchService aiSearchService = this.f296873x.f296880a;
                    dg0.b bVar = new dg0.b(str, str2);
                    this.f296872w = null;
                    this.v = 1;
                    obj2 = aiSearchService.getCompletions(bVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((dg0.a) obj2).getCompletions();
            default:
                c cVar2 = this.f296872w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String str3 = cVar2.f296870a;
                    String str4 = cVar2.f296871b;
                    AiSearchService aiSearchService2 = this.f296873x.f296880a;
                    dg0.b bVar2 = new dg0.b(str3, str4);
                    this.f296872w = null;
                    this.v = 1;
                    obj2 = aiSearchService2.requestSearch(bVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dg0.c cVar3 = (dg0.c) obj2;
                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                return new jg0.a(cVar3.getSearchRequestId(), cVar3.getPollingTime());
        }
    }
}
