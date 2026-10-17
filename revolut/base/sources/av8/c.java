package av8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ DocumentSelectionController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DocumentSelectionController documentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.u = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.feature.kyc.impl.document_collection.document_selection.a) this.u.R2()).f77628s, DocumentSelectionControllerContract$ModalStep.Citizenship.f77624a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
