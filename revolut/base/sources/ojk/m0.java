package ojk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f225829a;

    public m0(g0 itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f225829a = itemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j0 domainState = (j0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f225823a, new a(this), new ob2.a(25), new c1(this, domainState, 20));
        PricingPlanScreenConfig pricingPlanScreenConfig = (PricingPlanScreenConfig) domainState.f225823a.getContent();
        String str = pricingPlanScreenConfig != null ? pricingPlanScreenConfig.f102853b : null;
        if (str == null) {
            str = "";
        }
        return new k0(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list);
    }
}
