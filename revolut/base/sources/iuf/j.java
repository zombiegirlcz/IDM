package iuf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ManualTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ManualTransferReviewScreen manualTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = manualTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n61.d dVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarD = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar2 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a) sVarD;
        cli.y yVar = aVar2.f92495y;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "ID_TRANSFER_REVIEW_RECIPIENT_NAME")) {
            ManualTransferRecipient manualTransferRecipient = ((l) ((j2) yVar.f22677a).getValue()).f168567a;
            String str = null;
            if (manualTransferRecipient == null || (manualTransferRecipient instanceof ManualTransferRecipient.Apm) || (manualTransferRecipient instanceof ManualTransferRecipient.Internal)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Money Request with Beneficiary failed to open recipient detail cause recipient is not BankBeneficiary");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            } else {
                if (!(manualTransferRecipient instanceof ManualTransferRecipient.BankBeneficiary)) {
                    throw new NoWhenBranchMatchedException();
                }
                r rVar = ((l) ((j2) yVar.f22677a).getValue()).f;
                if (rVar == null) {
                    rVar = null;
                }
                com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.z;
                f5j.a aVar4 = ((ManualTransferRecipient.BankBeneficiary) manualTransferRecipient).f92459a;
                if (rVar != null && (dVar = rVar.f168576a) != null) {
                    str = dVar.f212679a;
                }
                oki.h.v2(aVar3, new ManualTransferReviewScreenContract$ModalStep.BeneficiaryDetails(aVar4, str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
