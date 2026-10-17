package lua;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.recurring_buys.schedule.api.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeClause.Format.DateLong f200208a = TimeClause.Format.DateLong.f57962b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeClause.Format.DayAndMonth f200209b = new TimeClause.Format.DayAndMonth(0);

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause timeClause;
        TextLocalisedClause textLocalisedClause;
        lua.a domainState = (lua.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f200202a;
        hua.c cVar = domainState.f200203b;
        boolean zX = ebm.a.x(localDate);
        TimeClause.Format.DateLong dateLong = f200208a;
        TimeClause.Format.DayAndMonth dayAndMonth = f200209b;
        if (zX) {
            timeClause = new TextLocalisedClause(R$string.wealthcore_recurringbuys_period_start_date_today_text, null, null, 14);
        } else {
            timeClause = new TimeClause(ebm.a.P(localDate), localDate.getYear() == LocalDate.now().getYear() ? dayAndMonth : dateLong, null, null, 12);
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("START_DATE_ITEM_ID", timeClause, new TextLocalisedClause(R$string.wealthcore_recurringbuys_period_start_date_title, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("FREQUENCY_ITEM_ID", new TextLocalisedClause(cVar.c(), null, null, 14), new TextLocalisedClause(R$string.cryptobuysell_recurring_buy_order_frequency, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("END_OF_MONTH_DISCLAIMER_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_monthly_recurring_order_info, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        if (cVar != hua.c.MONTHLY || localDate.getDayOfMonth() <= 28) {
            model3 = null;
        }
        qv0.i[] elements = {model, model2, model3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        TimeClause timeClause2 = new TimeClause(ebm.a.P(localDate), localDate.getYear() == LocalDate.now().getYear() ? dayAndMonth : dateLong, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        int i = i.f200210a[cVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_footer_daily_title, u.c(timeClause2), null, 12);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_footer_monthly_title, u.c(timeClause2), null, 12);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_footer_weekly_title, v.k(new TimeClause(ebm.a.P(localDate), TimeClause.Format.DayOfWeek.f57966b, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), timeClause2), null, 12);
        }
        return new c(listL, new aw0.e(false, textLocalisedClause, null, new n6(new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53));
    }
}
