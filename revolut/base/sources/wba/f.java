package wba;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrCodeTransactionReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrCodeTransactionReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51832a;
        int iHashCode = str.hashCode();
        PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen = this.v;
        switch (iHashCode) {
            case -1660118043:
                if (str.equals("ID_DISCOUNT")) {
                    ((e0) pixQrCodeTransactionReviewScreen.R2()).C2(m.f296084a);
                }
                break;
            case -485543197:
                if (str.equals("ID_PIX_CHANGE_AMOUNT")) {
                    ((e0) pixQrCodeTransactionReviewScreen.R2()).C2(n.f296085a);
                }
                break;
            case -259654795:
                if (str.equals("ID_SCHEDULED_ON")) {
                    ((e0) pixQrCodeTransactionReviewScreen.R2()).I2();
                }
                break;
            case 346052442:
                if (str.equals("ID_TO_TAG")) {
                    ((e0) pixQrCodeTransactionReviewScreen.R2()).C2(l.f296083a);
                }
                break;
            case 1303974040:
                if (str.equals("ID_ADDITIONAL_INFORMATION")) {
                    ((e0) pixQrCodeTransactionReviewScreen.R2()).C2(k.f296082a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
