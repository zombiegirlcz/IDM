package sxd;

import aw0.j0;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.standingordertopup.impl.R$string;
import com.revolut.feature.standingordertopup.impl.ui.model.SuggestionItem;
import ip0.jh0;
import ip0.lh0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xte.a f266418a;

    public b0(xte.a topUpMethodsItemsMapper) {
        Intrinsics.checkNotNullParameter(topUpMethodsItemsMapper, "topUpMethodsItemsMapper");
        this.f266418a = topUpMethodsItemsMapper;
    }

    public static nh a(List list, SuggestionItem suggestionItem, String str, String str2) {
        SuggestionsBarDelegate.Suggestion suggestion;
        jh0 jh0Var = jh0.HORIZONTAL_SCROLLER;
        j0 j0Var = j0.DEFAULT;
        List<SuggestionItem> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (SuggestionItem suggestionItem2 : list2) {
            boolean z = suggestionItem2.f88197b;
            dj0.d dVar = suggestionItem2.f88196a;
            if (z) {
                suggestion = new SuggestionsBarDelegate.Suggestion(str2, dVar.f115082a != 0 ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : new TextLocalisedClause(R$string.top_up_recurring_top_up_details_selection_other_amount, null, null, 14), dVar.f115082a != 0 ? new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, suggestionItem.f88197b ? lh0.ACCENT : lh0.SEMIACCENT, null, false, suggestionItem2, null, 368);
            } else {
                suggestion = new SuggestionsBarDelegate.Suggestion(str + "_" + dVar.f115082a, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, (suggestionItem.f88197b || dVar.f115082a != suggestionItem.f88196a.f115082a) ? lh0.SEMIACCENT : lh0.ACCENT, null, false, suggestionItem2, null, 372);
            }
            arrayList.add(suggestion);
        }
        return new nh(str, arrayList, j0Var, jh0Var, 0, 0, 0, 0, 0, 32752);
    }

    public static boolean b(g gVar) {
        return gVar.f266426b == null || gVar.e.isEmpty() || gVar.f266427c.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02be  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r40) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sxd.b0.c(cli.j):cli.o");
    }
}
