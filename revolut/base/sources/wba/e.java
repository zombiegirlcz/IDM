package wba;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrCodeTransactionReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrCodeTransactionReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f51871a, "ID_REFERENCE")) {
            e0 e0Var = (e0) this.v.R2();
            zof.f fVar = e0Var.f296069q;
            cli.y yVar = e0Var.f296072t;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            PixQrCodeBill pixQrCodeBill = ((h) j2Var.getValue()).f296075c.f80449h;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause((pixQrCodeBill == null || pixQrCodeBill.f == null) ? R$string.payments_bank_transfer_reference_title : R.string.common_action_edit, null, null, 14);
            PixQrCodeBill pixQrCodeBill2 = ((h) j2Var2.getValue()).f296075c.f80449h;
            yji.l.g2(e0Var, ((qpf.h) fVar).b(new ReferenceInputData(140, textLocalisedClause, (pixQrCodeBill2 == null || (str = pixQrCodeBill2.f) == null) ? new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_refund_reference_hint, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((h) j2Var2.getValue()).f296074b)), null, new z(e0Var, 1), 1);
        }
        return Unit.f186387a;
    }
}
