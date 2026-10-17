package e4j;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        RowDelegate.Model model;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model2 = new RowDelegate.Model("ID_REACH_OUT", null, new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_reach_out_cell_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_reach_out_cell_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
        if (domainState.f122566a) {
            i = 14;
            model = new RowDelegate.Model("ID_SEND_CARD", null, new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_card_cell_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_card_cell_subtitle, null, null, 14), new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_card_cell_action, null, new Click(30, (Integer) null, (Object) null, "ID_SEND_CARD", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868762);
        } else {
            i = 14;
            model = null;
        }
        RowDelegate.Model[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(null, listL, new lw0.a(new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_title, null, null, i), null, null, null, false, 30));
    }
}
