package ubj;

import com.revolut.retail.feature.crypto_deposits.impl.network.CryptoDepositsService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f278919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f278919w = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new f(this.f278919w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new f(this.f278919w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f278919w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                CryptoDepositsService cryptoDepositsService = hVar.f278921a;
                this.v = 1;
                Object currenciesRelevance = cryptoDepositsService.getCurrenciesRelevance(this);
                return currenciesRelevance == aVar ? aVar : currenciesRelevance;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    CryptoDepositsService cryptoDepositsService2 = hVar.f278921a;
                    this.v = 1;
                    obj2 = cryptoDepositsService2.ensureForAvailableBlockchains(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Response response = (Response) obj2;
                if (response.code() == 204) {
                    throw new RuntimeException() { // from class: com.revolut.retail.feature.crypto_deposits.api.repository.CryptoDepositsRepository$BeneficiariesNotYetCreated
                    };
                }
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                int i5 = jli.h.f175850a;
                return Unit.f186387a;
        }
    }
}
