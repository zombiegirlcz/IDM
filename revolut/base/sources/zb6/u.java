package zb6;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f320825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f320826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a f320827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f320827y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f320827y, continuation);
                uVar.f320825w = flowCollector;
                uVar.f320826x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                u uVar2 = new u(1, this.f320827y, continuation);
                uVar2.f320825w = flowCollector;
                uVar2.f320826x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
            default:
                u uVar3 = new u(2, this.f320827y, continuation);
                uVar3.f320825w = flowCollector;
                uVar3.f320826x = obj3;
                return uVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objV;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f320825w;
                    com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar2 = this.f320827y;
                    OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData = aVar2.o;
                    dj0.d dVar = oneTimeDonationScreenContract$InputData.f72083c;
                    if (dVar != null) {
                        objV = zi0.c.i(dVar);
                    } else {
                        objV = nim.a.v(rd0.e.b(mo3.a.n(aVar2.f72090r.J(AccountId.Personal.f51414a, w4l.h.f294642c))), new z8h.b(26));
                    }
                    Continuation continuation = null;
                    Flow flowH = xam.a.h(new r(aVar2, null), vkm.q.H(new xsd.a(2, 14, continuation), new q0(new t38.e(objV, 24, rd0.e.b(((sa6.t) aVar2.f72091s).b(oneTimeDonationScreenContract$InputData.f72081a, false)), new y69.e(aVar2, continuation, 7)), new ys.i(2, aVar2, com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a.class, "updateInitialDonationData", "updateInitialDonationData(Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenModel$CompositeInitialDonationData;)V", 4, 13), 1)));
                    this.f320825w = null;
                    this.f320826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowH, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f320825w;
                    com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar4 = this.f320827y;
                    zfd.e eVarW = zi0.c.w(xam.a.h(new q(1, aVar4, null), aVar4.z.B(new z8h.b(25))));
                    this.f320825w = null;
                    this.f320826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, eVarW, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f320825w;
                    com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar6 = this.f320827y;
                    Flow flowH2 = xam.a.h(new ys.i(2, aVar6, com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a.class, "observeSuggestionsForCurrency", "observeSuggestionsForCurrency(Lcom/revolut/core/model/currency/Currency;)Lkotlinx/coroutines/flow/Flow;", 4, 14), aVar6.z.B(new z8h.b(24)));
                    this.f320825w = null;
                    this.f320826x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowH2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
