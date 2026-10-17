package ffk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f134837b;

    public /* synthetic */ k(t tVar, int i) {
        this.f134836a = i;
        this.f134837b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DateTime dateTime;
        switch (this.f134836a) {
            case 0:
                PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                t tVar = this.f134837b;
                tVar.getClass();
                hha.z zVar = subscription.f81136m;
                return Boolean.valueOf((zVar == null || (dateTime = zVar.f152376b) == null) ? false : dateTime.isAfter(((l80.f) tVar.f134851b).g()));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                hha.d dVar = (hha.d) pair.f186385a;
                List list = (List) pair.f186386b;
                this.f134837b.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((hha.d) obj3).f152294m > dVar.f152294m) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                this.f134837b.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : plans) {
                    if (hha.s.k((hha.d) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
        }
    }
}
