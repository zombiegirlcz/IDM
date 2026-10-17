package fr8;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerCustomization;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9i.c f137431b;

    public /* synthetic */ p(h9i.c cVar, int i) {
        this.f137430a = i;
        this.f137431b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137430a) {
            case 0:
                l updateState = (l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return l.a(updateState, 0L, null, this.f137431b.getUrl(), null, null, null, null, null, null, 507);
            case 1:
                PaymentLinksTransferData updateTransferData = (PaymentLinksTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PaymentLinksTransferData.a(updateTransferData, 0L, null, null, null, null, this.f137431b.getUrl(), null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            default:
                PeerToPeerTransferData updateTransferData2 = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData2, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData2, 0L, null, null, null, null, null, new PeerToPeerCustomization.Gif(this.f137431b.getUrl()), null, null, null, null, 261631);
        }
    }
}
