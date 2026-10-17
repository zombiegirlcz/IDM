package njk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import ggk.w1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.h;
import qf1.j;
import qf1.k;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements pf1.a {
    @Override // pf1.a
    public final k a(qf1.d dVar) {
        w1 item = (w1) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_student, new TextLocalisedClause(R$string.add_new_product_student_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_student_subtitle_dynamic, v.k(Integer.valueOf(item.f143792b.f143783a), Integer.valueOf(item.f143792b.f143784b)), null, 12), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(qf1.d dVar) {
        return super.b((w1) dVar);
    }

    @Override // pf1.a
    public final j c(qf1.d dVar) {
        w1 item = (w1) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(u0.b(new FeatureCommand(new KompotPricingPlanFeatureConfig.Student(0))));
    }
}
