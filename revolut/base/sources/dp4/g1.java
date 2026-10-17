package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class g1 extends gim.i implements Function2 {
    public final /* synthetic */ dj0.d A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f116649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f116650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f116651y;
    public final /* synthetic */ dj0.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(a5h.g gVar, String str, String str2, dj0.d dVar, dj0.d dVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116649w = gVar;
        this.f116650x = str;
        this.f116651y = str2;
        this.z = dVar;
        this.A = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g1(this.f116649w, this.f116650x, this.f116651y, this.z, this.A, continuation, 0);
            default:
                return new g1(this.f116649w, this.f116650x, this.f116651y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a5h.g gVar = this.f116649w;
                    CreditCardService creditCardService = (CreditCardService) gVar.f1406b;
                    String strB = ((wj0.a) gVar.e).b("security_credit_card_top_up_idempotency_key_tag");
                    qo4.b bVar = new qo4.b(mo3.a.p(this.z), mo3.a.p(this.A), this.f116651y);
                    this.v = 1;
                    if (creditCardService.securityDepositTopUp(strB, this.f116650x, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    a5h.g gVar2 = this.f116649w;
                    CreditCardService creditCardService2 = (CreditCardService) gVar2.f1406b;
                    String strB2 = ((wj0.a) gVar2.e).b("security_credit_card_withdraw_idempotency_key_tag");
                    qo4.c cVar = new qo4.c(mo3.a.p(this.z), mo3.a.p(this.A), this.f116651y);
                    this.v = 1;
                    if (creditCardService2.securityDepositWithdraw(strB2, this.f116650x, cVar, this) == aVar2) {
                        return aVar2;
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
