package ljc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egc.a f195635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LocalDate f195636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RentAndBillsLinkedPayments.Category.LinkedPayment.Payment f195637y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, egc.a aVar, LocalDate localDate, RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f195635w = aVar;
        this.f195636x = localDate;
        this.f195637y = payment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f195635w, this.f195636x, this.f195637y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment = this.f195637y;
        r rVar = this.v;
        n nVar = new n(rVar, this.f195635w, this.f195636x, payment, null);
        this.u = 1;
        Object objB = pu7.a.B(rVar.k, "linkPayment", nVar, this);
        return objB == aVar ? aVar : objB;
    }
}
