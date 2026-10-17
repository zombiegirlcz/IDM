package g84;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i f141282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f141282w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f141282w, continuation, 0);
            default:
                return new w(this.f141282w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar = this.f141282w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    e eVar = iVar.f67384q;
                    this.v = 1;
                    obj2 = ((m) eVar).h(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String str = ((nu3.c) obj2).f219195b.f219202a;
                cj4.a aVar2 = iVar.u;
                jt3.a aVar3 = jt3.a.CREDIT_CARD;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = iVar.f67383p.f67362b;
                fp3.a aVar4 = new fp3.a(iVar, 28);
                this.v = 2;
                if (aVar2.Z2(str, aVar3, creditApplicationPluginFlowContract$Configuration, aVar4, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar2 = this.f141282w;
                    w wVar = new w(iVar2, null, 0);
                    this.v = 1;
                    if (iVar2.p2(this, wVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
