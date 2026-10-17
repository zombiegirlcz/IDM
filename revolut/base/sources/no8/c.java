package no8;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationController;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationControllerContract$PhoneNumberRemovalAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LogoutConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LogoutConfirmationController logoutConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.v = logoutConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        String itemId = model.f51913a;
        com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b) eVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "ID_PHONE_NUMBER_REMOVAL_SWITCHER")) {
            y yVar = bVar.f77306q;
            LogoutConfirmationControllerContract$PhoneNumberRemovalAction logoutConfirmationControllerContract$PhoneNumberRemovalAction = ((f) ((j2) yVar.f22677a).getValue()).d;
            Object obj3 = LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Keep.f77301a;
            boolean zF = Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, obj3);
            LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Remove remove = LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Remove.f77303a;
            if (zF) {
                obj3 = remove;
            } else if (!Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, remove)) {
                if (Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.NotApplicable.f77302a)) {
                    throw new IllegalStateException("Cannot handle click on switch item. Unexpected state: NotApplicable");
                }
                throw new NoWhenBranchMatchedException();
            }
            bVar.H2(yVar, new z(obj3, 19));
        }
        return Unit.f186387a;
    }
}
