package ekf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import java.util.List;
import klf.j1;
import kotlin.jvm.functions.Function3;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        j1 j1Var = (j1) obj3;
        ((j) this.receiver).getClass();
        return (!k71.k.k((a3) obj2) || j1Var.b()) ? zhm.f0.f322471a : zhm.u.c(new ActionsView.Item("CANCEL_PAYMENT_LINK_LIST_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.send_request_details_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
    }
}
