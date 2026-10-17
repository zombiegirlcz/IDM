package n6h;

import aw0.c7;
import aw0.ka;
import aw0.m6;
import aw0.n6;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Custom f212787a = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f212788b = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i, Clause clause, String str) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, f212788b, true, false, null, null, 29688);
    }

    @Override // cli.n
    public final o c(j jVar) {
        CellDetailsDelegate.Model modelA;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_cash_balance_margin_interest_fees_title, null, null, 14), new TextLocalisedClause(R$string.trading_cash_balance_margin_interest_fees_dialog_description, null, null, 14), null, null, false, 28);
        WealthMarginBorrowingInterest wealthMarginBorrowingInterest = domainState.f212786a;
        int i = R$string.trading_margin_overnight_fees_interest_section_interest_title;
        BigDecimal bigDecimal = wealthMarginBorrowingInterest.f95667a;
        Custom custom = f212787a;
        CellDetailsDelegate.Model modelA2 = a(i, new PercentageClause(bigDecimal, (PercentageClause.Format) null, custom, 2), "WEALTH_MARGIN_BORROWING_INTEREST_ANNUAL_RATE");
        LocalDate localDate = wealthMarginBorrowingInterest.d;
        if (localDate != null) {
            int i2 = R$string.trading_margin_overnight_fees_interest_section_payment_date_title;
            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
            jVar2.getClass();
            modelA = a(i2, com.revolut.core.ui_kit.models.j.a(localDate, dayAndMonth, custom), "WEALTH_MARGIN_BORROWING_INTEREST_NEXT_PAYMENT_DATE");
        } else {
            modelA = null;
        }
        CellDetailsDelegate.Model[] elements = {modelA2, modelA, a(R$string.trading_margin_overnight_fees_interest_section_accrued_title, new MoneyClause(wealthMarginBorrowingInterest.f95669c, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8), "WEALTH_MARGIN_BORROWING_INTEREST_MONTHLY_ACCRUED_FEES")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, null, 1020), null, null, 55), listL, aVar);
    }
}
