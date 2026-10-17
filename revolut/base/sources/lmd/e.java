package lmd;

import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$ShowAddNewWidget;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tf1.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements xld.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of1.a f196956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f196957b;

    public e(of1.a addNewProductFeatureAvailabilityProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(addNewProductFeatureAvailabilityProvider, "addNewProductFeatureAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f196956a = addNewProductFeatureAvailabilityProvider;
        this.f196957b = featureToggleInteractor;
    }

    public final List a(List list) {
        if (((jte.d) ((p) this.f196956a).f270193a).c(AddNewProductFeatureAvailabilityApi$Toggles$ShowAddNewWidget.f60850c)) {
            if (((jte.d) this.f196957b).c(AnalyticsFeatureApi$Toggles.HideTotalWealthEmptyStates.f87395c)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    List list2 = ((amd.j) obj2).f6333b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            if (!((amd.d) it8.next()).f6313b.isEmpty()) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
                return arrayList;
            }
        }
        return list;
    }
}
