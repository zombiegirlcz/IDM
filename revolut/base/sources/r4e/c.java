package r4e;

import a0.d;
import aim.e;
import android.os.Parcelable;
import aw0.o9;
import aw0.p9;
import aw0.wa;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.jg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.common.PayoutScenarioMapper$CalculatorParcel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jel.a2;
import jel.h2;
import jel.i2;
import jel.j2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tfl.a f251444a;

    public c(tfl.a wealthCoreClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthCoreClauseFactory, "wealthCoreClauseFactory");
        this.f251444a = wealthCoreClauseFactory;
    }

    public static int c(j2 j2Var) {
        int i = b.f251443a[j2Var.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorBlack;
        }
        if (i == 2) {
            return R$attr.uikit_colorPerformanceNegative;
        }
        if (i == 3) {
            return R$attr.uikit_colorStatusInactive;
        }
        if (i == 4) {
            return R$attr.uikit_colorPerformancePositive;
        }
        if (i == 5) {
            return R$attr.uikit_colorBlue;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v4 */
    public final ArrayList a(int i, a2 tab2) {
        List list;
        char c2;
        ?? M;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(tab2, "tab");
        e eVarB = u.b();
        eVarB.add(new PlainTextDelegate.Model(d.n("tab_body_", i), (UrlImage) null, (Clause) null, new TextClause(tab2.f173407c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
        String str = "tab_bar_" + i;
        ArrayList arrayList = tab2.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            h2 h2Var = (h2) obj2;
            String strValueOf = String.valueOf(i2);
            BigDecimal bigDecimal3 = h2Var.f173467b;
            BigDecimal bigDecimal4 = h2Var.f173466a;
            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            arrayList2.add(new jg(strValueOf, bigDecimalSubtract.doubleValue(), c(h2Var.f173468c), i2 != 0 ? b(bigDecimal4, false) : null));
            i2 = i3;
        }
        List list2 = null;
        h2 h2Var2 = (h2) d0.d0(arrayList);
        PercentageClause percentageClauseB = (h2Var2 == null || (bigDecimal2 = h2Var2.f173466a) == null) ? null : b(bigDecimal2, false);
        h2 h2Var3 = (h2) d0.o0(arrayList);
        char c3 = 1;
        eVarB.add(new SegmentedBarDelegate.Model(str, arrayList2, percentageClauseB, (h2Var3 == null || (bigDecimal = h2Var3.f173467b) == null) ? null : b(bigDecimal, true), 48));
        int i5 = 0;
        for (Object obj3 : arrayList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                ?? r132 = list2;
                v.s();
                throw r132;
            }
            h2 h2Var4 = (h2) obj3;
            i2 i2Var = h2Var4.e;
            Object payoutScenarioMapper$CalculatorParcel = i2Var != null ? new PayoutScenarioMapper$CalculatorParcel(h2Var4.f173466a, h2Var4.f173467b, i2Var.f173477a, i2Var.f173478b) : list2;
            String strG = d.g(i, i5, "tab_range_", "_");
            TextClause textClause = new TextClause(h2Var4.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_stop, (Integer) null, (Integer) null, Integer.valueOf(c(h2Var4.f173468c)), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
            if (payoutScenarioMapper$CalculatorParcel != null) {
                list = list2;
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_calculator, Integer.valueOf(R$attr.uikit_colorBlue), fValueOf, fValueOf, 16);
                c2 = c3;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_structured_notes_payout_scenarios_calculate_payout_link, list, new Custom(new Custom.Color.Solid(R$attr.uikit_colorBlue), false, false, 254), 10);
                Clause[] clauseArr = new Clause[2];
                clauseArr[0] = imageClause;
                clauseArr[c2] = textLocalisedClause;
                M = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(clauseArr));
            } else {
                list = list2;
                c2 = c3;
                M = list;
            }
            eVarB.add(new RowDelegate.Model(strG, image24, textClause, null, 0, null, M, null, 0, null, payoutScenarioMapper$CalculatorParcel != null ? c2 : 0, null, false, null, null, null, null, null, null, payoutScenarioMapper$CalculatorParcel, null, 0, 0, 0, 0, 532674488));
            i5 = i6;
            c3 = c2;
            list2 = list;
        }
        return yp0.b.g(u.a(eVarB), new ListSubheaderDelegate.Model(d.n("tab_header_", i), (Image) null, (Clause) new TextClause(tab2.f173406b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public final PercentageClause b(BigDecimal bigDecimal, boolean z) {
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return sfl.a.a(this.f251444a, bigDecimalMultiply, false, wa.STRIP_ALL_TRAILING_ZEROES, z ? p9.ALWAYS : p9.ONLY_NEGATIVE, 2);
    }
}
