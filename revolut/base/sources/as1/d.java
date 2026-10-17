package as1;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.tapi.impl.R$string;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.TapiTransferReviewScreen;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TapiTransferReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TapiTransferReviewScreen tapiTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = tapiTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0Var = (a0) this.u.R2();
        zof.f fVar = a0Var.f8754p;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tapi_transfer_review_field_label_edit, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.tapi_transfer_review_field_label_title, null, null, 14);
        String str = ((g) ((j2) a0Var.f8759w.f22677a).getValue()).f8762c;
        if (str == null) {
            str = "";
        }
        yji.l.g2(a0Var, ((qpf.h) fVar).b(new ReferenceInputData(140, textLocalisedClause, textLocalisedClause2, str)), null, new p(a0Var, 0), 1);
        return Unit.f186387a;
    }
}
