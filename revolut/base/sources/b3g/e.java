package b3g;

import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreenContract$InputData;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesPointsDiscountInfoScreenContract$InputData f12029a;

    public e(TravelExperiencesPointsDiscountInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f12029a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_points_discount_info_items_redeem, null, null, 14);
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.f12029a.f93112a;
        RevPoints revPoints = travelExperiencesPointsOption.f93195a;
        o9 o9Var = o9.NON_SENSITIVE;
        List listK = v.k(new CellDetailsDelegate.Model("REV_POINTS_ITEM_ID", textLocalisedClause, nub.a.q(revPoints, null, null, o9Var, 3), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("MONEY_DISCOUNT_ITEM_ID", new TextLocalisedClause(R$string.experiences_points_discount_info_items_discount, null, null, 14), new MoneyClause(travelExperiencesPointsOption.f93196b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new c(listK);
    }
}
