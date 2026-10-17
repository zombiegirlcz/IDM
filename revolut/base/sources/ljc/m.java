package ljc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egc.a f195630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RentAndBillsLinkedPayments.Category.LinkedPayment.Payment f195631x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, egc.a aVar, RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
        this.f195630w = aVar;
        this.f195631x = payment;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f195630w, this.f195631x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
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
        bgc.d dVar = this.v.f195643q;
        this.u = 1;
        Object objA = ((vgc.e) dVar).a(this.f195630w, this.f195631x, this);
        return objA == aVar ? aVar : objA;
    }
}
