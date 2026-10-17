package x8k;

import com.revolut.domain.models.payment.links.PaymentLink;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v61.k;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f303485b;

    public /* synthetic */ a(c cVar, int i) {
        this.f303484a = i;
        this.f303485b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303484a) {
            case 0:
                PeerToPeerTransferDescriptor peerToPeerTransferDescriptor = (PeerToPeerTransferDescriptor) obj2;
                Intrinsics.h(peerToPeerTransferDescriptor);
                this.f303485b.b(peerToPeerTransferDescriptor);
                break;
            case 1:
                k transferLink = (k) obj2;
                Intrinsics.checkNotNullParameter(transferLink, "transferLink");
                c cVar = this.f303485b;
                break;
            case 2:
                PaymentLink paymentLink = (PaymentLink) obj2;
                Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
                break;
            case 3:
                PeerToPeerTransferDescriptor peerToPeerTransferDescriptor2 = (PeerToPeerTransferDescriptor) obj2;
                Intrinsics.h(peerToPeerTransferDescriptor2);
                this.f303485b.b(peerToPeerTransferDescriptor2);
                break;
            case 4:
                PeerToPeerTransferDescriptor peerToPeerTransferDescriptor3 = (PeerToPeerTransferDescriptor) obj2;
                Intrinsics.h(peerToPeerTransferDescriptor3);
                this.f303485b.b(peerToPeerTransferDescriptor3);
                break;
            default:
                PeerToPeerTransferDescriptor peerToPeerTransferDescriptor4 = (PeerToPeerTransferDescriptor) obj2;
                Intrinsics.h(peerToPeerTransferDescriptor4);
                this.f303485b.b(peerToPeerTransferDescriptor4);
                break;
        }
        return Unit.f186387a;
    }
}
