package ikf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import k71.k;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import tof.a3;
import tof.x5;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements n {
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        a3 a3Var = (a3) obj2;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        h hVar = (h) this.receiver;
        hVar.getClass();
        boolean zC1 = k.c1(a3Var);
        boolean z = ((x5) obj3).f273160a;
        String str = a3Var.f272611s;
        boolean zF = Intrinsics.f(str, "awaiting_cardholder_verification");
        boolean zC = ((jte.d) hVar.f161953q).c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c);
        ActionsView.Item item = null;
        if (zC1 && z && !zBooleanValue && (!zF || zC)) {
            u1 u1Var = v1.Companion;
            t1 t1Var = t1.CANCEL;
            u1Var.getClass();
            item = new ActionsView.Item(u1.a(t1Var), zF ? mx0.d.SEMIACCENT : mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_cancel_deposit, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, str, null, 24476);
        }
        return v.l(item);
    }
}
