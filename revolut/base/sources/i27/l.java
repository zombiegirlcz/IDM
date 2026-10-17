package i27;

import et6.l0;
import g7b.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b f157885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157885w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f157885w, continuation, 0);
            case 1:
                return new l(this.f157885w, continuation, 1);
            case 2:
                return new l(this.f157885w, continuation, 2);
            default:
                return new l(this.f157885w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar = this.f157885w;
                    tzl.l lVar = bVar.o;
                    vad.g gVar = bVar.f74194q;
                    this.v = 1;
                    if (lVar.l(gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar2 = this.f157885w;
                    tzl.l lVar2 = bVar2.o;
                    vad.g gVar2 = bVar2.f74194q;
                    this.v = 1;
                    if (lVar2.h(gVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar3 = this.f157885w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    gr6.e eVar = bVar3.f74193p;
                    this.v = 1;
                    obj2 = ((l0) eVar).g(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar3.H2(bVar3.f74195r, new q(((Boolean) obj2).booleanValue(), 20));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar4 = this.f157885w;
                    bVar4.H2(bVar4.f74195r, new k(bVar4, 1));
                    tzl.l lVar3 = bVar4.o;
                    vad.g gVar3 = bVar4.f74194q;
                    this.v = 1;
                    if (lVar3.m(gVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
