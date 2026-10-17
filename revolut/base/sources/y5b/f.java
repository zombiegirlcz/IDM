package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsAccountsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f311038w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f311038w = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new f(this.f311038w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new f(this.f311038w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsAccountsService cobrandedCardsAccountsService = this.f311038w.f311048a;
                    this.v = 1;
                    obj2 = cobrandedCardsAccountsService.getCreateAccountInfo(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5d.b.w((w5b.d0) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CobrandedCardsAccountsService cobrandedCardsAccountsService2 = this.f311038w.f311048a;
                    this.v = 1;
                    obj2 = cobrandedCardsAccountsService2.getLinkAccountInfo(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return x5d.b.w((w5b.d0) obj2);
        }
    }
}
