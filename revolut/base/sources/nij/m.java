package nij;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f216269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f216270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gej.a f216271c;
    public final cej.b d;

    public m(kdh.b countryPickerMapper, o highlightsMapper, gej.a bytesFormatter, cej.b mobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(countryPickerMapper, "countryPickerMapper");
        Intrinsics.checkNotNullParameter(highlightsMapper, "highlightsMapper");
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f216269a = countryPickerMapper;
        this.f216270b = highlightsMapper;
        this.f216271c = bytesFormatter;
        this.d = mobilePlansFeatureAvailabilityInteractor;
    }

    public static TextLocalisedClause b(EsimDataPlan esimDataPlan, boolean z) {
        return new TextLocalisedClause(z ? R$string.esim_mobile_plans_plan_item_price_short : R$string.esim_mobile_plans_plan_item_price, u.c(new MoneyClause(esimDataPlan.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
    }

    public final Clause a(EsimDataPlan esimDataPlan) {
        if (esimDataPlan.f100217j) {
            return new TextLocalisedClause(R$string.esim_mobile_plans_plan_item_unlimited_gb_title, null, null, 14);
        }
        Long l2 = esimDataPlan.f100215g;
        if (l2 != null) {
            return gej.a.a(this.f216271c, l2.longValue(), null, 6);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
