package akf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.a implements oim.n {
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        y6 y6Var = (y6) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        ((b0) this.receiver).getClass();
        if (!zBooleanValue || zBooleanValue2) {
            return zhm.f0.f322471a;
        }
        if (y6Var != y6.CARD_PAYMENT) {
            return zhm.f0.f322471a;
        }
        u1 u1Var = v1.Companion;
        t1 t1Var = t1.CARD_LIMITS;
        u1Var.getClass();
        return zhm.u.c(new ActionsView.Item(u1.a(t1Var), mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_card_limits, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668));
    }
}
