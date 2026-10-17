package xn1;

import com.revolut.feature.apm.bills.bpay.impl.data.network.bills.BPayBillService;
import gim.i;
import java.time.LocalDate;
import jb3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f307303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ro1.b f307304x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, ro1.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307303w = eVar;
        this.f307304x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f307303w, this.f307304x, continuation, 0);
            case 1:
                return new d(this.f307303w, this.f307304x, continuation, 1);
            default:
                return new d(this.f307303w, this.f307304x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        ro1.b bVar = this.f307304x;
        e eVar = this.f307303w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BPayBillService bPayBillService = eVar.f307305a;
                    tn1.a aVarF = l.F(bVar);
                    wj0.b bVar2 = new wj0.b("IDEMPOTENCY_TAG_BPAY_PAY_BILL");
                    this.v = 1;
                    obj2 = bPayBillService.payBill(aVarF, bVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return i26.l.y((wn1.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    BPayBillService bPayBillService2 = eVar.f307305a;
                    tn1.a aVarF2 = l.F(bVar);
                    wj0.b bVar3 = new wj0.b("IDEMPOTENCY_TAG_BPAY_PAY_BILL");
                    this.v = 1;
                    obj2 = bPayBillService2.payBill(aVarF2, bVar3, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return i26.l.y((wn1.a) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    BPayBillService bPayBillService3 = eVar.f307305a;
                    tn1.a aVarF3 = l.F(bVar);
                    this.v = 1;
                    obj2 = bPayBillService3.verifyBill(aVarF3, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                vn1.a aVar4 = (vn1.a) obj2;
                Intrinsics.checkNotNullParameter(aVar4, "<this>");
                String paymentMethod = aVar4.getPaymentMethod();
                dj0.d dVarO = mo3.a.o(aVar4.getTotalAmount());
                dj0.d dVarO2 = mo3.a.o(aVar4.getAmount());
                try {
                    m.Companion companion = m.INSTANCE;
                    objA = LocalDate.parse(aVar4.getEstimatedArrival());
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                if (m.a(objA) != null) {
                    objA = null;
                }
                return new ho1.a(paymentMethod, dVarO, dVarO2, (LocalDate) objA, qn1.a.a(aVar4.getServiceProvider()));
        }
    }
}
