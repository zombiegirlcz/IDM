package g1k;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b f139696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139696w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f139696w, continuation, 0);
            case 1:
                return new h(this.f139696w, continuation, 1);
            case 2:
                return new h(this.f139696w, continuation, 2);
            case 3:
                return new h(this.f139696w, continuation, 3);
            default:
                return new h(this.f139696w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar = this.f139696w;
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.a aVar2 = new com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.a(bVar, null);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "open_watchlist", aVar2, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar2 = this.f139696w;
                    l lVar = bVar2.o;
                    Set set = ((d) ((j2) bVar2.f101863r.f22677a).getValue()).f139687a;
                    this.v = 1;
                    if (lVar.l(set, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l lVar2 = this.f139696w.o;
                    this.v = 1;
                    if (lVar2.h(null, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar3 = this.f139696w;
                    l lVar3 = bVar3.o;
                    Set set2 = ((d) ((j2) bVar3.f101863r.f22677a).getValue()).f139687a;
                    this.v = 1;
                    if (lVar3.l(set2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar4 = this.f139696w;
                    l lVar4 = bVar4.o;
                    Set set3 = ((d) ((j2) bVar4.f101863r.f22677a).getValue()).f139687a;
                    this.v = 1;
                    if (lVar4.m(set3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
