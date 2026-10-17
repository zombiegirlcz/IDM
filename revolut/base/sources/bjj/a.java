package bjj;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.esim.impl.R$string;
import grl.k9;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ActionsBottomSheetController a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_confirmation_subtitle, null, null, 14), null, null, false, 28);
        m6 m6Var = n6.Companion;
        aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_confirmation_cta_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.esim_mobile_plans_activate_plan_confirmation_cta_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.ESim;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
