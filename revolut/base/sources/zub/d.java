package zub;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.rev_points.buying.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.points_buying_recurring_info_sheet_title, null, null, 14), new TextLocalisedClause(R$string.points_buying_recurring_info_sheet_description, null, null, 14), null, null, false, 28));
    }
}
