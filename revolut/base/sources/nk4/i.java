package nk4;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ModalStep;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ ConfirmAutopayScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ConfirmAutopayScreen confirmAutopayScreen, Continuation continuation) {
        super(2, continuation);
        this.u = confirmAutopayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) this.u.d()).f68644t, ConfirmAutopayContract$ModalStep.BackupInfoDialog.f68628a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
