package akf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.a implements oim.n {
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ((u0) this.receiver).getClass();
        aim.e eVarB = zhm.u.b();
        if (Intrinsics.f((String) obj2, ((hha.d) obj3).f152287a) && !zBooleanValue) {
            u1 u1Var = v1.Companion;
            t1 t1Var = t1.MANAGE_PLAN;
            u1Var.getClass();
            eVarB.add(new ActionsView.Item(u1.a(t1Var), mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_manage_plan, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_settings, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
        }
        return zhm.u.a(eVarB);
    }
}
