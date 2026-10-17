package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.o5;
import dx4.p5;
import ip0.jh0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k1 {
    public static List a(p5 item, ax4.b constructorDomainState) {
        o5 o5Var;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        Map map = constructorDomainState.f10862l;
        String str = item.f120721a;
        ArrayList<o5> arrayList = item.d;
        ax4.n nVar = (ax4.n) map.get(str);
        if (nVar == null || (o5Var = nVar.f10893b) == null) {
            for (o5 o5Var2 : arrayList) {
                if (o5Var2.f) {
                    o5Var = o5Var2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        String str2 = o5Var.d;
        if (str2 == null) {
            throw new IllegalArgumentException("valueDescription is required for selected state");
        }
        RowDelegate.Model model = new RowDelegate.Model(j6.a.q("variant-selection-header-", str), null, new TextLocalisedClause(R$string.credit_application_constructor_variant_selection_title, zhm.u.c(item.f120722b), null, 12), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.credit_application_constructor_variant_selection_value, zhm.u.c(str2), null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, new AnalyticsContext(zw4.a.a(str)), 0, R$attr.uikit_dp0, 0, 0, 494924794);
        String strConcat = "variant-selection-bar-".concat(str);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (o5 o5Var3 : arrayList) {
            String str3 = o5Var3.f120702a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_variant_selection_variant_text, zhm.u.c(o5Var3.f120703b), null, 12);
            dx4.a1 a1Var = o5Var3.f120704c;
            arrayList2.add(new SuggestionsBarDelegate.Suggestion(str3, textLocalisedClause, (ResourceImage) (a1Var != null ? a1Var.T1() : null), null, o5Var3.equals(o5Var) ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, new Pair(item, o5Var3), new AnalyticsContext(zw4.a.a(o5Var3.f120702a)), 104));
        }
        return zhm.v.k(model, new nh(strConcat, arrayList2, null, jh0.HORIZONTAL_SCROLLER, 0, 0, 0, 0, 0, 32756));
    }
}
