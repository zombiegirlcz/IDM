package kbi;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerController;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EmployerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmployerController employerController, Continuation continuation) {
        super(2, continuation);
        this.v = employerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "COMPANY_INPUT_ID");
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        EmployerController employerController = this.v;
        if (zF) {
            oki.h.v2(((com.revolut.feature_retail_user_declarations.employer.screen.b) employerController.d()).f97648r, EmployerControllerContract$ModalStep.SelectEmployer.f97643a, popup);
        } else if (Intrinsics.f(str, "EMPLOYER_ADDRESS_INPUT_ID")) {
            oki.h.v2(((com.revolut.feature_retail_user_declarations.employer.screen.b) employerController.d()).f97648r, EmployerControllerContract$ModalStep.SelectEmployerAddress.f97644a, popup);
        }
        return Unit.f186387a;
    }
}
