package bx8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ KYCDocumentIdInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(KYCDocumentIdInputScreen kYCDocumentIdInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = kYCDocumentIdInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.kyc.impl.screens.documentid_input.b bVar = (com.revolut.feature.kyc.impl.screens.documentid_input.b) qVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        oki.h.v2(bVar.f77872t, new KYCDocumentIdInputScreenContract$ModalStep.ShowRegionPicker(listId), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
