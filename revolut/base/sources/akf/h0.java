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
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h0 extends kotlin.jvm.internal.a implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        e0 e0Var = (e0) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ((i0) this.receiver).getClass();
        if (zBooleanValue) {
            return zhm.f0.f322471a;
        }
        aim.e eVarB = zhm.u.b();
        if (e0Var instanceof c0) {
            u1 u1Var = v1.Companion;
            t1 t1Var = t1.DEBIT_TO_INSTALMENT_CREATE;
            u1Var.getClass();
            eVarB.add(new ActionsView.Item(u1.a(t1Var), mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_action_instalment, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_quarter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, (c0) e0Var, null, 24476));
        }
        return zhm.u.a(eVarB);
    }
}
