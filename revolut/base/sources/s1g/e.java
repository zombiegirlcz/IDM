package s1g;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesCancellationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelExperiencesCancellationScreen travelExperiencesCancellationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarI3 = this.v.T2();
        Intrinsics.h(model);
        com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) hVarI3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "POINTS_REVERSAL_ITEM_ID")) {
            j60.a aVar2 = eVar.f93039p;
            ((u1g.e) eVar.f93041r).getClass();
            List listC = u.c(new LargeActionButtonDelegate.Model("BUTTON_OK_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.experiences_common_action_got_it, null, null, 14), false, null, null, null, null, 1000));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            aVar2.x(new y(listC, new t(new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_points_reversal, null, null, 14), new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_points_reversal_description, null, null, 14), null, 28), null, null, null, null, 1020));
        }
        return Unit.f186387a;
    }
}
