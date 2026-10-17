package no8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationController;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationControllerContract$PhoneNumberRemovalAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LogoutConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LogoutConfirmationController logoutConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.v = logoutConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        String itemId = model.f52613a;
        com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b) eVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "ID_LOG_OUT_ACTION")) {
            LogoutConfirmationControllerContract$PhoneNumberRemovalAction logoutConfirmationControllerContract$PhoneNumberRemovalAction = ((f) ((j2) bVar.f77306q.f22677a).getValue()).d;
            if (Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Remove.f77303a)) {
                bVar.l2(new n(bVar, null, 0), new yi5.b(26));
            } else {
                if (!Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Keep.f77301a) && !Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.NotApplicable.f77302a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.l2(new n(bVar, null, 1), new yi5.b(26));
            }
        } else if (Intrinsics.f(itemId, "ID_CANCEL_ACTION")) {
            bVar.C2(h.f217952a);
        }
        return Unit.f186387a;
    }
}
