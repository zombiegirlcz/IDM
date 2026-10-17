package hp5;

import com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f154480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f154481x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f154481x = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                k kVar = new k(this.f154481x, continuation, 0);
                kVar.f154480w = str;
                return kVar.invokeSuspend(Unit.f186387a);
            default:
                k kVar2 = new k(this.f154481x, continuation, 1);
                kVar2.f154480w = str;
                return kVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f154480w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                o oVar = this.f154481x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CryptoWithdrawService cryptoWithdrawService = oVar.f154482a;
                    this.f154480w = null;
                    this.v = 1;
                    obj2 = cryptoWithdrawService.getAddress(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cp5.a.b((dp5.f) obj2, new hie.b(1, oVar, o.class, "getAddressTypeLocalised", "getAddressTypeLocalised(Lcom/revolut/feature/crypto/remittance/models/CryptoAddressType;)Ljava/lang/String;", 0, 7));
            default:
                String str2 = this.f154480w;
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
                CryptoWithdrawService cryptoWithdrawService2 = this.f154481x.f154482a;
                this.f154480w = null;
                this.v = 1;
                Object feesForTransaction = cryptoWithdrawService2.getFeesForTransaction(str2, this);
                return feesForTransaction == aVar2 ? aVar2 : feesForTransaction;
        }
    }
}
