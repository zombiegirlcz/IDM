package au6;

import com.revolut.feature.freelancer.common.models.FreelancerCashbackInfo;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ l0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(l0 l0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = l0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.v, continuation, 0);
            case 1:
                return new j0(this.v, continuation, 1);
            case 2:
                return new j0(this.v, continuation, 2);
            case 3:
                return new j0(this.v, continuation, 3);
            case 4:
                return new j0(this.v, continuation, 4);
            default:
                return new j0(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        l0 l0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ot6.a aVar2 = (ot6.a) j6.a.k(ot6.a.class, l0Var.f9564c, "STORAGE_CACHE_KEY_CASHBACK_BOOSTER_CONFIG");
                if (aVar2 != null) {
                    return ft6.k.c(aVar2);
                }
                return null;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ot6.c cVar = (ot6.c) j6.a.k(ot6.c.class, l0Var.f9564c, "STORAGE_CACHE_KEY_CASHBACK_BOOSTER_TIER");
                if (cVar != null) {
                    return ft6.k.d(cVar);
                }
                return null;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(rr6.o.class, l0Var.f9564c, "STORAGE_CACHE_KEY_CASHBACK_RATES_CURRENT");
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                du6.a aVar6 = (du6.a) j6.a.k(du6.a.class, l0Var.f9564c, "STORAGE_CACHE_KEY_CASHBACK_INFO");
                if (aVar6 == null) {
                    return null;
                }
                Map map = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(aVar6, "<this>");
                long collectedPlanAmount = aVar6.getCollected().getCollectedPlanAmount();
                xi0.a aVar7 = xi0.b.Companion;
                String collectedPlanCurrency = aVar6.getCollected().getCollectedPlanCurrency();
                aVar7.getClass();
                rr6.k kVar = new rr6.k(new dj0.d(collectedPlanAmount, xi0.a.a(collectedPlanCurrency)), new dj0.d(aVar6.getCollected().getCollectedBoosterAmount(), xi0.a.a(aVar6.getCollected().getCollectedBoosterCurrency())));
                dj0.d dVar = new dj0.d(aVar6.getNextPayout().getNextPayoutPlanAmount(), xi0.a.a(aVar6.getNextPayout().getNextPayoutPlanCurrency()));
                dj0.d dVar2 = new dj0.d(aVar6.getNextPayout().getNextPayoutBoosterAmount(), xi0.a.a(aVar6.getNextPayout().getNextPayoutBoosterCurrency()));
                LocalDateTime localDateTime = LocalDateTime.parse(aVar6.getNextPayout().getDueDate());
                Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
                return new rr6.j(kVar, new rr6.q(dVar, dVar2, localDateTime));
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                du6.b bVar = (du6.b) j6.a.k(du6.b.class, l0Var.f9564c, "STORAGE_CACHE_KEY_CASHBACK_INFO_LEGACY");
                if (bVar == null) {
                    return null;
                }
                Map map2 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                long earnedInTotalAmount = bVar.getEarnedInTotalAmount();
                xi0.a aVar9 = xi0.b.Companion;
                String earnedInTotalCurrency = bVar.getEarnedInTotalCurrency();
                aVar9.getClass();
                return new FreelancerCashbackInfo(new dj0.d(earnedInTotalAmount, xi0.a.a(earnedInTotalCurrency)), new dj0.d(bVar.getEarnedThisPeriodAmount(), xi0.a.a(bVar.getEarnedThisPeriodCurrency())), new LocalDate(bVar.getPeriodDueDate()));
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(du6.c.class, KTypeProjection.INSTANCE, List.class, l0Var.f9564c, "STORAGE_CACHE_KEY_CASHBACK_RATES");
                if (list == null) {
                    return null;
                }
                Map map3 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!Intrinsics.f(((du6.c) obj3).getPricingPlanCode(), "CUSTOM_RATE_KEY")) {
                        arrayList.add(obj3);
                    }
                }
                int iB = zhm.q0.b(zhm.w.t(arrayList, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : arrayList) {
                    linkedHashMap.put(((du6.c) obj4).getPricingPlanCode(), obj4);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zhm.q0.b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), new BigDecimal(((du6.c) entry.getValue()).getRate()));
                }
                Iterator it8 = list2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((du6.c) next).getPricingPlanCode(), "CUSTOM_RATE_KEY")) {
                        }
                    } else {
                        next = null;
                    }
                }
                du6.c cVar2 = (du6.c) next;
                return new FreelancerCashbackRates(linkedHashMap2, cVar2 != null ? new BigDecimal(cVar2.getRate()) : null);
        }
    }
}
