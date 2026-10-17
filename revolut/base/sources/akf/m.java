package akf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.retail.feature.limits.api.LimitsApi$Toggles$MexicoHideAtmLimits;
import java.util.List;
import kotlin.jvm.functions.Function3;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.a implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        y6 y6Var = (y6) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (!((q) this.receiver).f5884n.a(LimitsApi$Toggles$MexicoHideAtmLimits.f101774c) || zBooleanValue) {
            return zhm.f0.f322471a;
        }
        if (y6Var != y6.ATM && y6Var != y6.OTP_ATM) {
            return zhm.f0.f322471a;
        }
        u1 u1Var = v1.Companion;
        t1 t1Var = t1.ATM_LIMITS;
        u1Var.getClass();
        String strA = u1.a(t1Var);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_atm_limits, null, null, 14);
        mx0.e eVar = null;
        ms0.m mVar = null;
        String str = null;
        Float f = null;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        return zhm.u.c(new ActionsView.Item(strA, mx0.d.SEMIACCENT, false, null, null, textLocalisedClause, resourceImage, null, eVar, mVar, false, str, f, null, null, 32668));
    }
}
