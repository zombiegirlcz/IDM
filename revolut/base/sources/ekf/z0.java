package ekf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import tof.a3;
import tof.z6;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.i implements Function3 {
    public /* synthetic */ a3 u;
    public /* synthetic */ boolean v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        z0 z0Var = new z0(3, (Continuation) obj4);
        z0Var.u = (a3) obj2;
        z0Var.v = zBooleanValue;
        return z0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 a3Var = this.u;
        boolean z = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z6 z6VarL0 = k71.k.l0(a3Var);
        return ((z6VarL0 != null ? z6VarL0.i : null) != null || k71.k.G(a3Var) || !k71.k.k(a3Var) || z) ? zhm.f0.f322471a : zhm.u.c(new ActionsView.Item("SHARE_PAYMENT_LINK_LIST_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.payment_links_action_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
    }
}
