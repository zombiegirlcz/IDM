package sod;

import aw0.r2;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.k0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rod.g f264823a;

    public i(rod.g tripsCommonMapper) {
        Intrinsics.checkNotNullParameter(tripsCommonMapper, "tripsCommonMapper");
        this.f264823a = tripsCommonMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        HeaderDelegate.Model model = new HeaderDelegate.Model("header", null, new r2(new TextLocalisedClause(R$string.trips_remove_trip_sheet_title, u.c(this.f264823a.b(domainState.f264818a)), null, 12), null), new TextLocalisedClause(R$string.trips_remove_trip_sheet_subtitle, null, null, 14), null, k0.TINY, false, 14578);
        int i = R$attr.uikit_dp0;
        yp0.b.p(model, i, R$attr.uikit_dp16, i, i);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("remove", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.trips_remove_trip_sheet_button_remove, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("cancel", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        return new c(v.k(model, model2, model3));
    }
}
