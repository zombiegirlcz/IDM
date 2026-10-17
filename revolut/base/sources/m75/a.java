package m75;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import q35.x;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1150a Companion = new C1150a();

    /* JADX INFO: renamed from: m75.a$a, reason: collision with other inner class name */
    public static final class C1150a {
        private C1150a() {
        }
    }

    public static LargeActionButtonDelegate.Model a() {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        yp0.b.r(model, 0, i, i2, i2, 1);
        return model;
    }

    public static Clause b(x xVar) {
        String str = xVar.f;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.loan_refinancing_credit_details_external_bank_name_fallback, null, null, 14);
    }
}
