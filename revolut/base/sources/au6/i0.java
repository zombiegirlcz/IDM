package au6;

import com.revolut.feature.freelancer.common.models.FreelancerCashbackInfo;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCashbackService;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f9538w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(l0 l0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f9538w = l0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new i0(this.f9538w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new i0(this.f9538w, continuation, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new i0(this.f9538w, continuation, 2).invokeSuspend(Unit.f186387a);
            case 3:
                return new i0(this.f9538w, continuation, 3).invokeSuspend(Unit.f186387a);
            default:
                return new i0(this.f9538w, continuation, 4).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l0 l0Var = this.f9538w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FreelancerCashbackService freelancerCashbackService = l0Var.f9562a;
                    this.v = 1;
                    obj2 = freelancerCashbackService.getCashbackBoosterConfig(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ft6.k.c((ot6.a) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FreelancerCashbackService freelancerCashbackService2 = l0Var.f9562a;
                    this.v = 1;
                    obj2 = freelancerCashbackService2.getCashbackBoosterTier(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ft6.k.d((ot6.c) obj2);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FreelancerCashbackService freelancerCashbackService3 = l0Var.f9562a;
                    this.v = 1;
                    obj2 = freelancerCashbackService3.getCurrentCashbackRate(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                BigDecimal value = new BigDecimal(((com.revolut.feature.freelancer.impl.network.models.j) obj2).getRate());
                Intrinsics.checkNotNullParameter(value, "value");
                return new rr6.o(value);
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FreelancerCashbackService freelancerCashbackService4 = l0Var.f9562a;
                    this.v = 1;
                    obj2 = freelancerCashbackService4.getCashbackInfo(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.freelancer.impl.network.models.e eVar = (com.revolut.feature.freelancer.impl.network.models.e) obj2;
                Map map = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                long amount = eVar.getEarnedInTotal().getAmount();
                xi0.a aVar5 = xi0.b.Companion;
                String currency = eVar.getEarnedInTotal().getCurrency();
                aVar5.getClass();
                return new FreelancerCashbackInfo(new dj0.d(amount, xi0.a.a(currency)), new dj0.d(eVar.getEarnedThisPeriod().getAmount(), xi0.a.a(eVar.getEarnedThisPeriod().getCurrency())), new LocalDate(eVar.getEarnedThisPeriod().getDueDate()));
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FreelancerCashbackService freelancerCashbackService5 = l0Var.f9562a;
                    this.v = 1;
                    obj2 = freelancerCashbackService5.getCashbackRates(this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                com.revolut.feature.freelancer.impl.network.models.f fVar = (com.revolut.feature.freelancer.impl.network.models.f) obj2;
                Map map2 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Map rates = fVar.getRates();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(rates.size()));
                for (Map.Entry entry : rates.entrySet()) {
                    linkedHashMap.put(entry.getKey(), BigDecimal.valueOf(((Number) entry.getValue()).doubleValue()));
                }
                Double customRate = fVar.getCustomRate();
                return new FreelancerCashbackRates(linkedHashMap, customRate != null ? BigDecimal.valueOf(customRate.doubleValue()) : null);
        }
    }
}
