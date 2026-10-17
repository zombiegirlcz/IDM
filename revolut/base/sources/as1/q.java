package as1;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import java.time.Instant;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gpf.a f8774b;

    public /* synthetic */ q(gpf.a aVar, int i) {
        this.f8773a = i;
        this.f8774b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8773a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, this.f8774b.f145449a, null, null, null, 59);
            case 1:
                ica.g update2 = (ica.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String reference = this.f8774b.f145449a;
                dj0.d amount = update2.f160224a;
                String groupId = update2.f160226c;
                String payerName = update2.d;
                dj0.d originalAmount = update2.e;
                Instant instant = update2.f;
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(reference, "reference");
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(payerName, "payerName");
                Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
                return new ica.g(amount, originalAmount, reference, groupId, payerName, instant);
            case 2:
                PeerToPeerTransferData updateTransferData = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData, 0L, null, null, null, null, this.f8774b.f145449a, null, null, null, null, null, 261887);
            case 3:
                o9a.j update3 = (o9a.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return o9a.j.a(update3, null, null, null, null, false, this.f8774b.f145449a, 63);
            case 4:
                PushToCardTransferData updateTransferData2 = (PushToCardTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData2, "$this$updateTransferData");
                return PushToCardTransferData.a(updateTransferData2, 0L, null, null, null, null, this.f8774b.f145449a, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 5:
                BankTransferData updateTransferData3 = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData3, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData3, 0L, null, null, null, new TransferNote.SimpleNote(this.f8774b.f145449a), null, null, null, null, null, null, null, null, 1048543);
            default:
                wba.h update4 = (wba.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return wba.h.a(update4, this.f8774b.f145449a, null, null, 29);
        }
    }
}
