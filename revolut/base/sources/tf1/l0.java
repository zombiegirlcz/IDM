package tf1;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f270178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f270179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f270180c;

    public l0(ImmutableMap widgetDataSources, ImmutableMap productEnableStateProviders, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(widgetDataSources, "widgetDataSources");
        Intrinsics.checkNotNullParameter(productEnableStateProviders, "productEnableStateProviders");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f270178a = widgetDataSources;
        this.f270179b = productEnableStateProviders;
        this.f270180c = featureToggleInteractor;
    }

    public final ArrayList a(List availabilityProductIdsPairs) {
        i0 i0Var;
        Intrinsics.checkNotNullParameter(availabilityProductIdsPairs, "availabilityProductIdsPairs");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : availabilityProductIdsPairs) {
            if (((m0) obj2).f270183b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((m0) it8.next()).f270182a);
        }
        AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp addNewProductFeatureAvailabilityApi$Toggles$P4URevamp = AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c;
        gte.a aVar = this.f270180c;
        List<qf1.l> listV0 = arrayList2;
        if (!((jte.d) aVar).c(addNewProductFeatureAvailabilityApi$Toggles$P4URevamp)) {
            WealthUiApi$Toggles.AddNewWidgetExpandedForInvest addNewWidgetExpandedForInvest = WealthUiApi$Toggles.AddNewWidgetExpandedForInvest.f95852c;
            if (((jte.d) aVar).c(addNewWidgetExpandedForInvest) && arrayList2.contains(qf1.l.INVEST)) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((qf1.l) obj3) != qf1.l.INVEST) {
                        arrayList3.add(obj3);
                    }
                }
                listV0 = zhm.d0.F0(qf1.l.INVEST, zhm.d0.V0(arrayList3, 2));
            } else {
                listV0 = zhm.d0.V0(arrayList2, ((jte.d) aVar).c(addNewWidgetExpandedForInvest) ? 3 : 2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (qf1.l lVar : listV0) {
            mf1.c cVar = (mf1.c) this.f270178a.get(lVar);
            if (cVar != null) {
                i0Var = new i0(cVar.a(), lVar, 2);
            } else {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "WidgetFlowHelper", "No widget data source for " + lVar, null, h0Var);
                i0Var = null;
            }
            if (i0Var != null) {
                arrayList4.add(i0Var);
            }
        }
        return arrayList4;
    }
}
