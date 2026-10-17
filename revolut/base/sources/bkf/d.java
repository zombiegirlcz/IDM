package bkf;

import akf.t1;
import akf.u1;
import akf.v1;
import akf.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import k71.k;
import kotlin.jvm.functions.Function3;
import tof.a3;
import tof.o3;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean z;
        dj0.d dVar;
        a3 a3Var = (a3) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        h hVar = (h) this.receiver;
        if (zBooleanValue) {
            hVar.getClass();
            return f0.f322471a;
        }
        if (hVar.f16409n.g() != null) {
            throw new ClassCastException();
        }
        int i = b.f16401a[a3Var.z.ordinal()];
        if (i == 1) {
            z = cp5.d.z(a3Var.k.f115083b);
        } else if (i != 2) {
            z = false;
        } else {
            o3 o3Var = a3Var.J;
            z = cp5.d.z((o3Var == null || (dVar = o3Var.f272965a) == null) ? null : dVar.f115083b);
        }
        if (k.Z(a3Var) || !z || k.u(a3Var)) {
            return f0.f322471a;
        }
        u1 u1Var = v1.Companion;
        t1 t1Var = t1.BUY_AGAIN;
        u1Var.getClass();
        return v.k(y.a(u1.a(t1Var)), new ActionsView.Item(u1.a(t1.SET_RECURRING_BUY), null, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_set_recurring_buy, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
    }
}
