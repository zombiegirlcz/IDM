package q2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StoreCampaignOffer f241636x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, StoreCampaignOffer storeCampaignOffer, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241635w = cVar;
        this.f241636x = storeCampaignOffer;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f241635w, this.f241636x, continuation, 0);
            case 1:
                return new z(this.f241635w, this.f241636x, continuation, 1);
            case 2:
                return new z(this.f241635w, this.f241636x, continuation, 2);
            case 3:
                return new z(this.f241635w, this.f241636x, continuation, 3);
            default:
                return new z(this.f241635w, this.f241636x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = this.f241635w;
                    y yVar = new y(cVar, this.f241636x, null, 0);
                    this.v = 1;
                    if (u0.b0(cVar.X(), "TAG_EARN_CTA", yVar, this) == aVar) {
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
                    com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar2 = this.f241635w;
                    y yVar2 = new y(cVar2, this.f241636x, null, 1);
                    this.v = 1;
                    if (u0.b0(cVar2.X(), "TAG_EARN_CTA", yVar2, this) == aVar2) {
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
                    com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar3 = this.f241635w;
                    y yVar3 = new y(cVar3, this.f241636x, null, 2);
                    this.v = 1;
                    if (u0.b0(cVar3.X(), "TAG_EARN_SECONDARY_CTA", yVar3, this) == aVar3) {
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
                    com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar4 = this.f241635w;
                    y yVar4 = new y(cVar4, this.f241636x, null, 3);
                    this.v = 1;
                    if (u0.b0(cVar4.X(), "TAG_EARN_CTA", yVar4, this) == aVar4) {
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
                    com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar5 = this.f241635w;
                    y yVar5 = new y(cVar5, this.f241636x, null, 4);
                    this.v = 1;
                    if (u0.b0(cVar5.X(), "TAG_REDEEM_CTA", yVar5, this) == aVar5) {
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
