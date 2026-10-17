package i52;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$ModalStep;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(TransferReviewScreen transferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        cli.y yVar = aVar2.A;
        if (((b) ((j2) yVar.f22677a).getValue()).f158550h && Intrinsics.f(listId, "APM_TRANSFER_REVIEW_CONTACT_ROW_ID")) {
            oki.h.v2(aVar2.z, new TransferReviewContract$ModalStep.AccountDetails(((b) ((j2) yVar.f22677a).getValue()).f158547b.t0()), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
