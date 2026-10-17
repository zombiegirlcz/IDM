package hk9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.revolut.feature_fourthline_impl.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static LargeActionButtonDelegate.Model a(TextLocalisedClause textLocalisedClause, String str) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
        yp0.b.r(model, 0, R$attr.uikit_dp8, 0, 0, 13);
        return model;
    }

    public static /* synthetic */ LargeActionButtonDelegate.Model b(r rVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
        rVar.getClass();
        return a(textLocalisedClause, "GOT_IT_BUTTON_ID");
    }
}
