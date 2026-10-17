package nhc;

import chc.v;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.data.network.services.RentAndBillsService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egc.a f215410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RentAndBillsLinkedPayments.Category.LinkedPayment.Payment f215411x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, egc.a aVar, RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f215410w = aVar;
        this.f215411x = payment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f215410w, this.f215411x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            RentAndBillsService rentAndBillsService = this.v.f215412a;
            egc.a aVar2 = this.f215410w;
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            int i2 = dhc.b.f114777a[aVar2.ordinal()];
            if (i2 == 1) {
                str = "RENT";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "BILLS";
            }
            RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment = this.f215411x;
            Intrinsics.checkNotNullParameter(payment, "<this>");
            v vVar = new v(payment.f84794a, payment.f84795b.name());
            this.u = 1;
            obj2 = rentAndBillsService.linkPayment(str, vVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return ((chc.c) obj2).f24153a;
    }
}
