package m25;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import rp0.v;
import rp0.y;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    public static LargeActionButtonDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, dl4.a aVar) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, false, null, null, aVar, null, 744);
        yp0.b.r(model, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 12);
        return model;
    }

    public static y c(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List list) {
        return new y(list, new rp0.t(textLocalisedClause, textLocalisedClause2, new v("id_credit_card_account_warning", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), 24), rp0.l.WINDOW, null, null, null, 1016);
    }

    public final y b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return dy4.b.b(rp0.m.Companion, zhm.u.c(a("id_credit_card_account_dialog_info_button_got_it", new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null)), new rp0.t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, 1020);
    }
}
