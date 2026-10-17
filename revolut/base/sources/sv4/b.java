package sv4;

import aw0.ka;
import aw0.la;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements cm4.j {
    public final RowDelegate.Model a(String facilityId, vl4.g model) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(model, "model");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_statement;
        int i2 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 60);
        TimeClause timeClause = new TimeClause(pyd.c.f0(model.f290248a), new TimeClause.Format.MonthAndYear(ka.SHORT, la.FULL), null, null, 12);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_due_on, u.c(sx4.g.b(model.d, null)), null, 12);
        vl4.c cVar = model.f290252h;
        vl4.d dVar = model.f290261t;
        MoneyClause moneyClauseB = sx4.f.b(3, null, null, ev4.b.b(cVar, dVar, model.f290255m, model.f290251g));
        TextLocalisedClause textLocalisedClauseA = ev4.b.a(cVar, dVar);
        return new RowDelegate.Model("id_credit_card_statement", image40, timeClause, null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, textLocalisedClauseA != null ? sx4.g.f(textLocalisedClauseA, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254)) : null, null, false, 92), false, null, false, null, null, null, null, null, null, new cm4.i(facilityId, model.f290249b), null, 0, 0, 0, 0, 532675544);
    }
}
