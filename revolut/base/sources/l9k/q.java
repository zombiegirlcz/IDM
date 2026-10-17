package l9k;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bsf.f f193289b;

    public /* synthetic */ q(bsf.f fVar, int i) {
        this.f193288a = i;
        this.f193289b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193288a) {
            case 0:
                return PeerToPeerTransferData.a((PeerToPeerTransferData) obj2, 0L, null, null, null, null, null, null, this.f193289b.f18200a, null, null, null, 260095);
            case 1:
                return PushToCardTransferData.a((PushToCardTransferData) obj2, 0L, null, null, null, null, null, this.f193289b.f18200a, 383);
            case 2:
                return BankTransferData.a((BankTransferData) obj2, 0L, null, null, null, null, this.f193289b.f18200a, null, null, null, null, null, null, null, 1048511);
            default:
                TransferData updateTransferData = (TransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return TransferData.e(updateTransferData, null, 0L, null, null, null, null, this.f193289b.f18200a, CertificateBody.profileType);
        }
    }
}
