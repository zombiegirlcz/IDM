package ica;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreen;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.retail.feature.payments.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PixRefundReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixRefundReviewScreen pixRefundReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pixRefundReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = (n) this.u.d();
        yji.l.g2(nVar, ((qpf.h) nVar.f160232r).b(new ReferenceInputData(140, new TextLocalisedClause(R$string.payments_bank_transfer_description_title, null, null, 14), new TextLocalisedClause(R$string.payments_bank_transfer_description, null, null, 14), ((g) ((j2) nVar.f160233s.f22677a).getValue()).f160225b)), null, new i9e.a(nVar, 13), 1);
        return Unit.f186387a;
    }
}
