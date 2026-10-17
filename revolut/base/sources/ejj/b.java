package ejj;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.esim.impl.R$string;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static CellDetailsDelegate.Model a() {
        return new CellDetailsDelegate.Model("ID_PLAN_FEATURE_INCOMING_CALLS", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_add_number_incoming_calls_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsDelegate.Model b() {
        return new CellDetailsDelegate.Model("ID_PLAN_FEATURE_INCOMING_TEXTS", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_add_number_incoming_texts_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_unlimited, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
