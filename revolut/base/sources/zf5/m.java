package zf5;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zh9.u0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.crypto.exchange.fees.impl.ui.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hha.d f321880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar, hha.d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f321880w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f321880w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xfa.b bVar;
        hha.d dVar = this.f321880w;
        String str = dVar.f152287a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vkm.d dVarB = rd0.e.b(m70.a.g(cVar.f70844s.o(), null, null, 3));
            this.u = 1;
            obj2 = q.x(dVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "first(...)");
        Iterable iterable = (Iterable) obj2;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(((hha.d) it8.next()).f152287a);
        }
        if (arrayList.contains(str)) {
            int i2 = k.f321878a[cVar.o.ordinal()];
            if (i2 == 1) {
                bVar = xfa.b.ORDER_REVIEW_CRYPTO;
            } else if (i2 == 2) {
                bVar = xfa.b.TRANSACTION_DETAILS_CRYPTO;
            } else if (i2 == 3) {
                bVar = xfa.b.FEATURE_DEEPLINK;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = xfa.b.FEE_CRYPTO;
            }
            cVar.C1(u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, u.c(str), dVar.f152287a, null, false, bVar, 185)));
        }
        return Unit.f186387a;
    }
}
