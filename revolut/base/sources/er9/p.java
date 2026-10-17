package er9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f128586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f128587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128586w = xVar;
        this.f128587x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f128586w, this.f128587x, continuation, 0);
            default:
                return new p(this.f128586w, this.f128587x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PaymentsGroupsService paymentsGroupsService = this.f128586w.f128599g;
                    String str = this.f128587x;
                    this.v = 1;
                    obj2 = paymentsGroupsService.getGroupByCodeDetails(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cr9.q qVar = (cr9.q) obj2;
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                return new st9.c(qVar.getId(), qVar.getName(), qVar.getImageUrl(), qVar.getCreatedDate(), qVar.getInviterCode(), qVar.getInviterName(), qVar.getTrusted());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PaymentsGroupsService paymentsGroupsService2 = this.f128586w.f128599g;
                    String str2 = this.f128587x;
                    this.v = 1;
                    obj2 = paymentsGroupsService2.joinGroupByCode(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        PaymentGroup paymentGroup = (PaymentGroup) obj2;
                        x xVar = this.f128586w;
                        w4l.f fVar = xVar.f128606q;
                        Intrinsics.h(paymentGroup);
                        xVar.i(fVar, paymentGroup);
                        this.f128586w.f128605p.d = true;
                        return paymentGroup;
                    }
                    yhm.o.b(obj2);
                }
                ufm.i iVarE = this.f128586w.e((cr9.v) obj2);
                this.v = 2;
                obj2 = nim.a.b(iVarE, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                PaymentGroup paymentGroup2 = (PaymentGroup) obj2;
                x xVar2 = this.f128586w;
                w4l.f fVar2 = xVar2.f128606q;
                Intrinsics.h(paymentGroup2);
                xVar2.i(fVar2, paymentGroup2);
                this.f128586w.f128605p.d = true;
                return paymentGroup2;
        }
    }
}
