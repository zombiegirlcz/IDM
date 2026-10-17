package vi9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import d9.e1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import si9.b;
import zh9.o0;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements yh9.i {
    public e0(n payLaterModeItemMapper, si9.c payLaterExplainerItemsFactoryProvider) {
        Intrinsics.checkNotNullParameter(payLaterModeItemMapper, "payLaterModeItemMapper");
        Intrinsics.checkNotNullParameter(payLaterExplainerItemsFactoryProvider, "payLaterExplainerItemsFactoryProvider");
    }

    public static LargeActionButtonDelegate.Model a(String str) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
        yp0.b.r(model, 0, R$attr.uikit_dp8, 0, 0, 13);
        return model;
    }

    public final rp0.y b(String str, r0 plan) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(plan, "plan");
        o0 o0Var = plan.f322337r;
        dj0.d dVar = plan.f322340w;
        int i = d0.f289536a[o0Var.ordinal()];
        if (i == 1) {
            ArrayList arrayList = plan.B;
            wi0.b bVar = plan.f322339t;
            BigDecimal bigDecimal = plan.v;
            textLocalisedClause = dVar.k() ? new TextLocalisedClause(R$string.pay_later_fee_per_purchase_without_min_fee_description, zhm.v.k(ky4.d.a(bigDecimal, bVar, null), Integer.valueOf(arrayList.size())), null, 12) : new TextLocalisedClause(R$string.pay_later_fee_per_purchase_with_min_fee_description, zhm.v.k(ky4.d.a(bigDecimal, bVar, null), Integer.valueOf(arrayList.size()), pi9.b.a(dVar, null, 3)), null, 12);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.pay_later_purchase_fee_reduced_description, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = d0.f289537b[plan.f322338s.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_purchase_fee_free_description, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.pay_later_purchase_fee_free_through_shops_description, null, null, 14);
            }
        }
        return new rp0.y(zhm.u.c(a("FEE_DIALOG_GOT_IT_BUTTON")), new rp0.t(new TextLocalisedClause(R$string.pay_later_account_details_fee, null, null, 14), textLocalisedClause, null, 28), rp0.l.WINDOW, null, null, null, str, null, null, null, 3832);
    }

    public final rp0.y c(String str, zh9.a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LargeActionButtonDelegate.Model modelA = a("HOW_IT_WORKS_GOT_IT_BUTTON");
        List listA = si9.c.a(b.c.f263532a).a(configuration);
        return new rp0.y(i2b.a.p(listA, modelA), new rp0.t(new TextLocalisedClause(R$string.pay_later_how_it_works_spending_power_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_how_it_works_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, str, null, null, null, 3832);
    }

    public final rp0.y d(String str, Pair lateInterestRate) {
        Intrinsics.checkNotNullParameter(lateInterestRate, "lateInterestRate");
        PercentageClause percentageClauseA0 = e1.a0(lateInterestRate);
        LargeActionButtonDelegate.Model modelA = a("LATE_INTEREST_DIALOG_GOT_IT_BUTTON");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.pay_later_plan_late_interest, null, null, 14), null, null, 30);
        RowDelegate.Model model = new RowDelegate.Model("pay_later_late_interest_info", new ResourceImage(R$drawable.uikit_icn_24_percent, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.pay_later_late_interest_info_title, zhm.u.c(percentageClauseA0), null, 12), new TextLocalisedClause(R$string.pay_later_late_interest_info_description, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model, 0, i, i, i, null, false, 49);
        return new rp0.y(zhm.v.k(model, modelA), tVar, rp0.l.WINDOW, null, null, null, str, null, null, null, 3832);
    }
}
