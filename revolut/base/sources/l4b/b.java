package l4b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.retail.cfd.api.domain.models.FeeBreakdownItem;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    public final rp0.y a(FeeBreakdownItem breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        rp0.t tVar = new rp0.t(new TextClause(breakdown.f82107a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(breakdown.f82109c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CFD_FEE_BREAKDOWN_DESCRIPTION_DIALOG_GOT_IT_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new rp0.y(zhm.u.c(model), tVar, null, null, null, null, 1020);
    }
}
