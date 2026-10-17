package c55;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements m35.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.q f21428a;

    public c0(m35.q loanTransactionCategoryIconMapper) {
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        this.f21428a = loanTransactionCategoryIconMapper;
    }

    public static RowDelegate.Model b(q35.e0 e0Var, RowDelegate.Model.MainImage.Image40 image40, TextLocalisedClause textLocalisedClause) {
        String str = e0Var.f241804a;
        long epochMilli = e0Var.f241806c.toInstant().toEpochMilli();
        boolean z = e0Var.e == q35.d0.Auto;
        Clause clauseA = sx4.g.a(epochMilli);
        if (z) {
            clauseA = yoj.b.w(yoj.b.w(clauseA, sx4.g.e(1)), new ImageClause(R$drawable.uikit_icn_20_reccuring, Integer.valueOf(R$attr.uikit_colorGreyTone20), (Float) null, (Float) null, 28));
        }
        Clause clause = clauseA;
        dj0.d dVarL = e0Var.d;
        if (dVarL.f(dj0.d.e)) {
            dVarL = dVarL.l();
        }
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, clause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVarL, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, e0Var, null, 0, 0, 0, 0, 532675544);
    }

    public final RowDelegate.Model a(q35.e0 repayment, b95.a product) {
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        Intrinsics.checkNotNullParameter(product, "product");
        q35.b0 b0Var = repayment.f241812n;
        int i = b0Var == null ? -1 : b0.f21426a[b0Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return b(repayment, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_umbrella, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorTeal)), new AccentCircleBadge(dw0.a.Checked), null, false, null, false, 60), new TextLocalisedClause(R$string.loan_management_details_loan_insurance, null, null, 14));
            }
            throw new NoWhenBranchMatchedException();
        }
        l0 l0Var = (l0) this.f21428a;
        Intrinsics.checkNotNullParameter(product, "product");
        return b(repayment, new RowDelegate.Model.MainImage.Image40(l0Var.a(product), new AccentCircleBadge(dw0.a.Checked), null, false, null, false, 60), new TextLocalisedClause(R$string.credit_common_past_repayment, null, null, 14));
    }
}
