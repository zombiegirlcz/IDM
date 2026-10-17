package g84;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i f141281w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141281w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f141281w, continuation, 0);
            case 1:
                return new v(this.f141281w, continuation, 1);
            case 2:
                return new v(this.f141281w, continuation, 2);
            default:
                return new v(this.f141281w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar = this.f141281w;
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.f fVar = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.f(iVar, null);
                    this.v = 1;
                    if (iVar.p2(this, fVar) == aVar) {
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
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar2 = this.f141281w;
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.g gVar = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.g(iVar2, null);
                    this.v = 1;
                    if (iVar2.p2(this, gVar) == aVar2) {
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
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar3 = this.f141281w;
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.h hVar = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.h(iVar3, null);
                    this.v = 1;
                    if (iVar3.p2(this, hVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar4 = this.f141281w;
                w wVar = new w(iVar4, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(iVar4.k, "upgradePlan", wVar, this);
                return objB == aVar4 ? aVar4 : objB;
        }
    }
}
