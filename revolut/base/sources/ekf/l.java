package ekf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import d9.e1;
import java.util.List;
import klf.j1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.a implements oim.n {
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        a3 transaction = (a3) obj2;
        t3 t3Var = (t3) obj3;
        j1 youthWalletOwner = (j1) obj4;
        ((m) this.receiver).f127103p.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        if (k71.k.h(transaction) || e1.B(transaction) || t3Var == null || !t3Var.u0 || youthWalletOwner.c()) {
            return zhm.f0.f322471a;
        }
        u1 u1Var = v1.Companion;
        t1 t1Var = t1.DIRECT_DEBIT_REFUND;
        u1Var.getClass();
        return zhm.u.c(new ActionsView.Item(u1.a(t1Var), mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_request_refund, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668));
    }
}
