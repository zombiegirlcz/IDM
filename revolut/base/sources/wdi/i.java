package wdi;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreenContract$Mode;
import ip0.tm0;
import ip0.um0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketDowngradeScreenContract$InputData f296563a;

    public i(RevPointsPocketDowngradeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296563a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        BigDecimal bigDecimalB;
        qv0.n model;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RevPointsPocketDowngradeScreenContract$Mode revPointsPocketDowngradeScreenContract$Mode = this.f296563a.f97821a;
        RevPoints f97825b = revPointsPocketDowngradeScreenContract$Mode.getF97825b();
        if (revPointsPocketDowngradeScreenContract$Mode instanceof RevPointsPocketDowngradeScreenContract$Mode.Info) {
            textLocalisedClause = new TextLocalisedClause(R$string.rev_points_pocket_transfer_downgrade_title, null, null, 14);
        } else {
            if (!(revPointsPocketDowngradeScreenContract$Mode instanceof RevPointsPocketDowngradeScreenContract$Mode.Confirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.rev_points_pocket_transfer_confirm_title, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(f97825b == null ? R$string.rev_points_pocket_transfer_confirm_zero_threshold_subtitle : R$string.rev_points_pocket_transfer_confirm_non_zero_threshold_subtitle, null, null, 14), null, null, false, 28);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_points_pocket_transfer_confirm_before_withdrawal, null, null, 14);
        int i = R$string.rev_points_pocket_transfer_description_reward_value;
        BigDecimal bigDecimalB2 = revPointsPocketDowngradeScreenContract$Mode.getF97824a().b();
        NumberClause.Format.Default r182 = NumberClause.Format.Default.f57900a;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("BEFORE_ITEM_ID", textLocalisedClause2, new TextLocalisedClause(i, u.c(new NumberClause(bigDecimalB2, r182, null, null, 12)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        RevPoints f97825b2 = revPointsPocketDowngradeScreenContract$Mode.getF97825b();
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.rev_points_pocket_transfer_confirm_after_withdrawal, null, null, 14);
        int i2 = R$string.rev_points_pocket_transfer_description_reward_value;
        if (f97825b2 == null || (bigDecimalB = f97825b2.b()) == null) {
            bigDecimalB = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalB;
        Intrinsics.h(bigDecimal);
        List listK = v.k(model2, new CellDetailsDelegate.Model("AFTER_ITEM_ID", textLocalisedClause3, new TextLocalisedClause(i2, u.c(new NumberClause(bigDecimal, r182, null, null, 12)), null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        List list = listK;
        if (revPointsPocketDowngradeScreenContract$Mode instanceof RevPointsPocketDowngradeScreenContract$Mode.Confirmation) {
            model = new um0("TWIN_BUTTON_ITEM_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.rev_points_pocket_transfer_confirm_cancel_button, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.rev_points_pocket_transfer_confirm_confirm_button, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016);
        } else {
            if (!(revPointsPocketDowngradeScreenContract$Mode instanceof RevPointsPocketDowngradeScreenContract$Mode.Info)) {
                throw new NoWhenBranchMatchedException();
            }
            model = new LargeActionButtonDelegate.Model("TWIN_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.rev_points_pocket_transfer_confirm_details_button, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model, 0, 0, 0, 0, 15);
        }
        return new g(d0.F0(model, list), aVar);
    }
}
