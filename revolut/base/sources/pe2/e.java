package pe2;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.swish.api.R$string;
import com.revolut.feature.apm.swish.impl.domain.SwishPaymentLimits;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreen;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreenContract$ModalStep;
import com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.v;
import nii.y0;
import ox5.r;
import vkm.j2;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SwishHomeAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SwishHomeAreaScreen swishHomeAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = swishHomeAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        String listId = model.f53228a;
        com.revolut.feature.apm.swish.impl.ui.home.area.a aVar2 = (com.revolut.feature.apm.swish.impl.ui.home.area.a) hVar;
        y yVar = aVar2.f62926q;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f62927r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        switch (listId.hashCode()) {
            case -1800168733:
                if (listId.equals("ID_P2M_LIMIT")) {
                    SwishPaymentLimits swishPaymentLimits = ((AreaContent) zi0.c.I(((g) ((j2) yVar.f22677a).getValue()).f235320a)).f62929b;
                    a aVar4 = aVar2.f62925p;
                    dj0.d limit = swishPaymentLimits.f62899b;
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(limit, "limit");
                    yji.l.a1(aVar2, aVar2.X1(new y0("ID_P2M_LIMIT_DIALOG", new v(new TextLocalisedClause(R$string.swish_update_limits_merchants_title, null, null, 14), new TextLocalisedClause(R$string.swish_update_limits_merchants_description, u.c(new MoneyClause(limit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, new TextLocalisedClause(R$string.swish_update_limits_merchants_action_use_card, null, null, 14), new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, false, null, 4032), false, 4)), null, null, new r(aVar2, continuation, 25), 3);
                }
                break;
            case -1416846325:
                if (listId.equals("ID_LINKED_NUMBER")) {
                    oki.h.v2(aVar3, SwishHomeAreaScreenContract$ModalStep.LinkedPhoneNumber.f62922a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 72561998:
                if (listId.equals("ID_GET_HELP")) {
                    aVar2.C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
                }
                break;
            case 862342310:
                if (listId.equals("ID_P2P_LIMIT")) {
                    SwishPaymentLimits swishPaymentLimits2 = ((AreaContent) zi0.c.I(((g) ((j2) yVar.f22677a).getValue()).f235320a)).f62929b;
                    oki.h.v2(aVar3, new SwishHomeAreaScreenContract$ModalStep.TransactionLimit(swishPaymentLimits2.f62898a, swishPaymentLimits2.f62900c), ModalDestination.Style.POPUP.f98311a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
