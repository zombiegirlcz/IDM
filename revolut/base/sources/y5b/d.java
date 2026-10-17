package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsAccountsService;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f311032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f311033x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, Map map, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f311032w = jVar;
        this.f311033x = map;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f311032w, this.f311033x, continuation, 0);
            default:
                return new d(this.f311032w, this.f311033x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
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
                CobrandedCardsAccountsService cobrandedCardsAccountsService = this.f311032w.f311048a;
                this.v = 1;
                Object objCreateAccount = cobrandedCardsAccountsService.createAccount(this.f311033x, this);
                return objCreateAccount == aVar ? aVar : objCreateAccount;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CobrandedCardsAccountsService cobrandedCardsAccountsService2 = this.f311032w.f311048a;
                this.v = 1;
                Object objLinkAccount = cobrandedCardsAccountsService2.linkAccount(this.f311033x, this);
                return objLinkAccount == aVar2 ? aVar2 : objLinkAccount;
        }
    }
}
