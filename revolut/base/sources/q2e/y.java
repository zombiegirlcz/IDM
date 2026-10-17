package q2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StoreCampaignOffer f241634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, StoreCampaignOffer storeCampaignOffer, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f241633w = cVar;
        this.f241634x = storeCampaignOffer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f241633w, this.f241634x, continuation, 0);
            case 1:
                return new y(this.f241633w, this.f241634x, continuation, 1);
            case 2:
                return new y(this.f241633w, this.f241634x, continuation, 2);
            case 3:
                return new y(this.f241633w, this.f241634x, continuation, 3);
            default:
                return new y(this.f241633w, this.f241634x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.store.impl.ui.brand_detail.flow.c.I2(this.f241633w, this.f241634x, this) == aVar) {
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
                    this.v = 1;
                    if (com.revolut.feature.store.impl.ui.brand_detail.flow.c.I2(this.f241633w, this.f241634x, this) == aVar2) {
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
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.store.impl.ui.brand_detail.flow.c.I2(this.f241633w, this.f241634x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.store.impl.ui.brand_detail.flow.c.I2(this.f241633w, this.f241634x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.store.impl.ui.brand_detail.flow.c.I2(this.f241633w, this.f241634x, this) == aVar5) {
                        return aVar5;
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
