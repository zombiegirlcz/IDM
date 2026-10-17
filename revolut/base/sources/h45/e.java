package h45;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ AddExternalAccountController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddExternalAccountController addExternalAccountController, Continuation continuation) {
        super(2, continuation);
        this.u = addExternalAccountController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        oki.h.v2(((com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a) this.u.d()).f70297q, AddExternalAccountControllerContract$ModalStep.ShowNameExplainer.f70295a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
