package wrj;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.nb;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f299603b;

    public /* synthetic */ i(l lVar, int i) {
        this.f299602a = i;
        this.f299603b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f299602a) {
            case 0:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new pfm.h(new v3e.t(this.f299603b, it8, 22), 2);
            case 1:
                List paymentSchedule = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentSchedule, "paymentSchedule");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : paymentSchedule) {
                    if (ksj.b.p(((yld.h) obj3).f314696a, ((l80.f) this.f299603b.v).g())) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                Set pocketsIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketsIds, "pocketsIds");
                return new CategorisationFilter(he3.d.SPENDINGS, new CategorisationFilter.Scope.PocketsIdSet(pocketsIds), this.f299603b.f299606p.f101526a, null, new nb(), null, null, null, null, null, 1000);
        }
    }
}
