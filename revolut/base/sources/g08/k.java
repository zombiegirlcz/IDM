package g08;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zw7.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    public static List a() {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
        int i = R$attr.uikit_dp16;
        return u.c(new LargeActionButtonDelegate.Model("INFO_DIALOG_LARGE_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496));
    }

    public static Clause b(c1 c1Var) {
        String str = c1Var.f325763c;
        if (str == null || d0.W(str)) {
            return new TextClause(c1Var.f325762b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        TextClause textClause = new TextClause(c1Var.f325762b, (Style) new Custom(null, true, false, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124);
        Intrinsics.h(str);
        List listK = v.k(textClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
