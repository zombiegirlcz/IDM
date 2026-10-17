package a6e;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import skm.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Flow f1625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z5e.c f1626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f1627y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Flow flow, z5e.c cVar, ProductAccountId productAccountId, Continuation continuation) {
        super(2, continuation);
        this.f1625w = flow;
        this.f1626x = cVar;
        this.f1627y = productAccountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f1625w, this.f1626x, this.f1627y, continuation);
        hVar.v = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            e0.C(producerScope, null, null, new a1a.a(this.f1626x, this.f1627y, null, 13), 3);
            g gVar = new g(producerScope);
            this.v = null;
            this.u = 1;
            if (this.f1625w.collect(gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
