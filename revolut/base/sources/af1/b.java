package af1;

import android.content.Intent;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.lite_pos.api.model.LitePosReceiptState;
import com.revolut.feature.acquiring.lite_pos.api.model.ReceiptInfo;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreen;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ld1.t;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReceiptScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ReceiptScreen receiptScreen, Continuation continuation) {
        super(2, continuation);
        this.v = receiptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ListCellDelegate.Model model = (ListCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) ((t) this.v.f60831a0.getValue()).f193999g.get();
        String listId = model.f52693a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHARE_LINK_LIST_ID")) {
            hf1.a aVar2 = gVar.f3826s;
            ReceiptInfo receiptInfo = gVar.f3823p.f60832a;
            hf1.c cVar = (hf1.c) aVar2;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(receiptInfo, "receiptInfo");
            LitePosReceiptState litePosReceiptState = receiptInfo.d;
            dj0.d dVar = receiptInfo.f60690c;
            String str = receiptInfo.f60689b;
            int[] iArr = hf1.b.f151738a;
            int i = iArr[litePosReceiptState.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.product_catalogue_receipt_share_receipt_message_result_approved, v.e(str, cVar.a(dVar)), null, 12);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.product_catalogue_receipt_share_receipt_message_result_failed, v.e(str, cVar.a(dVar)), null, 12);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.product_catalogue_receipt_share_receipt_message_result_declined, v.e(str, cVar.a(dVar)), null, 12);
            }
            LitePosReceiptState litePosReceiptState2 = receiptInfo.d;
            String str2 = receiptInfo.f60688a;
            int i2 = iArr[litePosReceiptState2.ordinal()];
            if (i2 == 1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.product_catalogue_receipt_share_receipt_success_message, v.e(cVar.a(dVar), str, str2), null, 12);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.product_catalogue_receipt_share_receipt_failed_message, v.e(cVar.a(dVar), str, str2), null, 12);
            }
            Intent intent = new Intent();
            f01.a aVar3 = cVar.f151739a;
            intent.putExtra("android.intent.extra.TEXT", aVar3.b(textLocalisedClause2).toString());
            intent.putExtra("android.intent.extra.SUBJECT", aVar3.b(textLocalisedClause).toString());
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            m70.a.c(t0.f186434a);
            Intent intentCreateChooser = Intent.createChooser(intent, "");
            Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
            gVar.C1(new ExternalDestination.ByIntent(intentCreateChooser, null));
        }
        return Unit.f186387a;
    }
}
