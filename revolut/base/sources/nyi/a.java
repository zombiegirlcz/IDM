package nyi;

import com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1227a Companion = new C1227a();

    /* JADX INFO: renamed from: nyi.a$a, reason: collision with other inner class name */
    public static final class C1227a {
        private C1227a() {
        }
    }

    public static List a(ArrayList arrayList) {
        SuggestionsBarCellDelegate.Model model = new SuggestionsBarCellDelegate.Model("LIST_ID_SUGGESTIONS", new TextLocalisedClause(R$string.airport_lounges_assign_pass_quick_add, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), arrayList);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
