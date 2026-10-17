package od3;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class y0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.h f224325a;

    public y0(yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f224325a = pricingPlanStringMapper;
    }

    public final rp0.y a(x0 parcel) {
        List listC;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_plan_total_cashback_sheet_title, null, null, 14);
        int i = 0;
        boolean z = parcel.a().f65684a.size() > 1;
        rp0.t tVar = new rp0.t(textLocalisedClause, new TextLocalisedClause((parcel.b() && z) ? R$string.cashback_product_plan_total_cashback_sheet_with_ultra_multiple_currencies_subtitle : parcel.b() ? R$string.cashback_product_plan_total_cashback_sheet_with_ultra_base_currency_subtitle : z ? R$string.cashback_product_plan_total_cashback_sheet_multiple_currencies_subtitle : R$string.cashback_product_plan_total_cashback_sheet_base_currency_subtitle, null, null, 14), null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        if (parcel instanceof v0) {
            v0 v0Var = (v0) parcel;
            boolean z3 = v0Var.e;
            CashbackByCurrencies cashbackByCurrencies = v0Var.f224310c;
            RowDelegate.Model model = new RowDelegate.Model("ID_TOTAL_CASHBACK", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c(z3 ? "3D214" : "3D114", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28), null, null, false, null, false, 62), z3 ? new TextLocalisedClause(R$string.cashback_product_plan_plan_cashback, null, null, 14) : new TextLocalisedClause(R$string.cashback_product_plan_title, zhm.u.c(fgk.b.a(this.f224325a, v0Var.f224309b)), null, 12), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(v0Var.f224308a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832);
            yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
            ArrayList arrayListN = zhm.v.n(model);
            if (cashbackByCurrencies.f65684a.size() > 1) {
                ArrayList arrayList = cashbackByCurrencies.f65684a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dj0.d dVar = (dj0.d) obj2;
                    arrayList2.add(new RowDelegate.Model(a0.d.n("ITEM_", i), new RowDelegate.Model.MainImage.Image40(new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(dVar.f115083b, CurrencyClause.Format.DisplayName.f57755a, null, 4), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
                    i = i2;
                }
                arrayListN.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("ID_CASHBACK_BY_SOURCE_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.cashback_product_plan_split_by_currency_title, null, null, 14), (ResourceImage) null, false, false, (Clause) null, true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946), null, 0, 0, 126));
            }
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_SEE_ALL_CASHBACK", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.cashback_product_action_show_all_sources, null, null, 14), false, null, null, 0, R$attr.uikit_dp16, 0, 0, 7152);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            arrayListN.add(model2);
            listC = arrayListN;
        } else {
            if (!(parcel instanceof w0)) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, 0, R$attr.uikit_dp16, 0, 0, 7152);
            yp0.b.r(model3, 0, 0, 0, 0, 15);
            listC = zhm.u.c(model3);
        }
        return new rp0.y(listC, tVar, lVar, null, null, null, 1016);
    }
}
