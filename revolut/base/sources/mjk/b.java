package mjk;

import bjk.g2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBillingPicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final PricingPlanBillingPicker a(bjk.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        List options = mVar.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(k.a((g2.d.g) it8.next()));
        }
        return new PricingPlanBillingPicker(arrayList);
    }
}
