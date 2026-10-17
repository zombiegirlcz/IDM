package x84;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.a1;
import rp0.f1;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DebtsHubScreen debtsHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = debtsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh action = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        Intrinsics.h(action);
        q qVar = (q) mVarH3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        SwipeToActionDelegate.SwipeAction swipeAction = action.f54883a;
        Object obj3 = swipeAction.f;
        if (Intrinsics.f(swipeAction.f53505a, "ACTION_ID_SWIPE_DELETE") && (obj3 instanceof pu3.b)) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_success_toast, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
            yji.l.a1(qVar, qVar.X1(w.a("ID_DELETE_DEBT_DIALOG", textLocalisedClause, new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_success_toast, null, null, 14), resourceImage, f1.ABOVE_ANCHOR_VIEW, a1.LONG, 8)), null, null, new wo2.l(qVar, (pu3.b) obj3, (Continuation) null, 4), 3);
        }
        return Unit.f186387a;
    }
}
