package zkf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import java.time.Instant;
import java.util.List;
import klf.j1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.h4;
import tof.k4;
import tof.l4;
import tof.t3;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements oim.n {
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        i iVar;
        k4 k4Var;
        a3 a3Var = (a3) obj2;
        t3 t3Var = (t3) obj3;
        ((k) this.receiver).getClass();
        if (((j1) obj4).c()) {
            return f0.f322471a;
        }
        h4 h4Var = t3Var != null ? t3Var.K : null;
        l4 l4Var = (t3Var == null || (k4Var = t3Var.M) == null) ? null : k4Var.f272881b;
        if (h4Var == null || l4Var == null) {
            iVar = null;
        } else {
            String str = a3Var.F0;
            if (str == null) {
                str = "";
            }
            String str2 = a3Var.f272581b;
            dj0.d dVar = l4Var.f272909b;
            Instant instant = l4Var.f272908a;
            dj0.d dVar2 = a3Var.k;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(a3Var.f272593h.getMillis());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            iVar = new i(str, str2, dVar, instant, dVar2, instantOfEpochMilli, l4Var.f272910c);
        }
        return iVar == null ? f0.f322471a : u.c(new ActionsView.Item("PIX_REFUND_ACTION_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_refund, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, iVar, null, 24476));
    }
}
