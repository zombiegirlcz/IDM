package vt4;

import aw0.o9;
import cm4.l;
import cm4.m;
import cm4.n;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ip0.jh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements l {
    public final List b(TextLocalisedClause startText, TextLocalisedQuantityClause endText, int i, ArrayList terms, List suggestionTerms, int i2) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(endText, "endText");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(suggestionTerms, "suggestionTerms");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_credit_card_suggestions_title", startText, endText, 0, null, null, null, null, null, false, 0, R$attr.uikit_dp8, 28664);
        int iIntValue = ((Number) d0.m0(terms)).intValue();
        if (iIntValue < 1) {
            throw new IllegalArgumentException("lastTerm must be at least 1");
        }
        if (i > iIntValue) {
            throw new IllegalArgumentException("selectedTerm must not exceed lastTerm");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : terms) {
            int iIntValue2 = ((Number) obj2).intValue();
            int size = terms.size();
            if ((1 <= size && size <= i2) || suggestionTerms.contains(Integer.valueOf(iIntValue2)) || (iIntValue2 == ((Number) d0.m0(terms)).intValue() && ((Number) d0.m0(suggestionTerms)).intValue() > iIntValue2)) {
                arrayList.add(obj2);
            }
        }
        aim.e eVarB = u.b();
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            int iIntValue3 = ((Number) it8.next()).intValue();
            arrayList2.add(new SuggestionsBarDelegate.Suggestion(a0.d.n("id_credit_card_suggestions_term_", iIntValue3), new NumberClause(iIntValue3, (NumberClause.Format.Compact) null, (Custom) null, 6), null, null, iIntValue3 == i ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, new n(iIntValue3), null, 364));
        }
        eVarB.addAll(arrayList2);
        if (arrayList.size() < terms.size()) {
            boolean zContains = suggestionTerms.contains(Integer.valueOf(i));
            eVarB.add(new SuggestionsBarDelegate.Suggestion("id_credit_card_suggestions_term_other", !zContains ? new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.credit_common_other, null, null, 14), !zContains ? new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, !zContains ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, m.f25130a, null, 360));
        }
        List listK = v.k(model, new nh("id_credit_card_suggestions_bar", u.a(eVarB), null, jh0.FLEXBOX, 0, 0, 0, 0, 0, 32756));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }
}
