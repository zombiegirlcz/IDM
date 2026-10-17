package n65;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.r6;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l80.e;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import vim.f;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f212711b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f212712a;

    static {
        IntRange intRange = new IntRange(1, 28, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(String.valueOf(it8.nextInt()));
        }
        f212711b = arrayList;
    }

    public d(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f212712a = dateProvider;
    }

    public final c a(int i, int i2, wi0.b countryCode, boolean z) {
        int i3;
        Set setI1;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        int dayOfMonth = ((l80.f) this.f212712a).e().getDayOfMonth();
        ArrayList arrayList = f212711b;
        if (z) {
            i3 = i;
            setI1 = d0.i1(arrayList);
        } else {
            i3 = i;
            if (dayOfMonth < i3) {
                IntRange intRange = new IntRange(1, dayOfMonth, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList2.add(String.valueOf(it8.nextInt()));
                }
                setI1 = d0.i1(arrayList2);
            } else {
                setI1 = h0.f322473a;
            }
        }
        s6 s6Var = new s6("repayment-date-calendar", arrayList.indexOf(String.valueOf(i2)), arrayList, Integer.valueOf(arrayList.indexOf(String.valueOf(i3))), u.c(new r6(setI1)), 1984);
        yp0.b.l(s6Var, 0, 0, 0, 0, null, false, 63);
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.p0;
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("repayment-day-limit-explainer", (Clause) null, (Clause) new TextLocalisedClause(Intrinsics.f(countryCode, bVar) ? R$string.credit_loan_change_repayment_day_select_day_explainer_unavailable_dates_uk : R$string.credit_loan_change_repayment_day_select_day_explainer_unavailable_dates, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        if (setI1.isEmpty()) {
            model = null;
        }
        return new c(Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_loan_change_repayment_day_select_day_header_title_uk, null, null, 14) : new TextLocalisedClause(R$string.credit_loan_change_repayment_day_select_day_header_title, null, null, 14), Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_loan_change_repayment_day_select_day_header_subtitle_uk, null, null, 14) : new TextLocalisedClause(R$string.credit_loan_change_repayment_day_select_day_header_subtitle, null, null, 14), s6Var, model);
    }
}
