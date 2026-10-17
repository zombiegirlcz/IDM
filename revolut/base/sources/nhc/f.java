package nhc;

import chc.b0;
import chc.m;
import chc.n;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.impl.data.network.services.RentAndBillsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f215408w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f215408w = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new f(this.f215408w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            default:
                return new f(this.f215408w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object rentAndBillsConfigurations = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    RentAndBillsService rentAndBillsService = this.f215408w.f215412a;
                    this.v = 1;
                    obj2 = rentAndBillsService.getConfiguration(this);
                    if (obj2 != rentAndBillsConfigurations) {
                    }
                    return rentAndBillsConfigurations;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                n nVar = (n) obj2;
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                m mVar = nVar.f24172a;
                RentAndBillsConfigurations.Configuration configurationA = mVar != null ? dhc.a.a(mVar) : null;
                m mVar2 = nVar.f24173b;
                rentAndBillsConfigurations = new RentAndBillsConfigurations(configurationA, mVar2 != null ? dhc.a.a(mVar2) : null);
                return rentAndBillsConfigurations;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    RentAndBillsService rentAndBillsService2 = this.f215408w.f215412a;
                    this.v = 1;
                    obj2 = rentAndBillsService2.getLinkedPayments(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return dhc.c.d((b0) obj2);
        }
    }
}
