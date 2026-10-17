package ymk;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.scroll.PlanPageScrollLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Context context = (Context) obj2;
        Intrinsics.checkNotNullParameter(context, "p0");
        if (((PlanPageScreen) this.receiver).K.f103606g) {
            return new LinearLayoutManager(context);
        }
        Intrinsics.checkNotNullParameter(context, "context");
        PlanPageScrollLayoutManager planPageScrollLayoutManager = new PlanPageScrollLayoutManager(context);
        planPageScrollLayoutManager.f103622a = enk.i.f127839b;
        return planPageScrollLayoutManager;
    }
}
