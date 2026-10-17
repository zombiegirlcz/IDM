package z8k;

import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b f320191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f320192c;

    public /* synthetic */ j0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, String str, int i) {
        this.f320190a = i;
        this.f320191b = bVar;
        this.f320192c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f320190a) {
            case 0:
                PeerToPeerTransferData updateTransferData = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData, this.f320191b.H.b(this.f320192c, updateTransferData.f102245b.f306286a), null, null, null, null, null, null, null, null, null, null, 262142);
            default:
                t updateState = (t) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.f320191b;
                PeerToPeerTransferData peerToPeerTransferDataG2 = bVar.G2();
                String str = this.f320192c;
                PeerToPeerTransferData peerToPeerTransferDataA = PeerToPeerTransferData.a(peerToPeerTransferDataG2, 0L, null, null, null, null, str, null, null, null, null, null, 261887);
                ReferenceData referenceData = bVar.F2().f320165a;
                Intrinsics.checkNotNullParameter(referenceData, "referenceData");
                return t.a(updateState, peerToPeerTransferDataA, null, 0, new d0(referenceData, str), false, false, 16311);
        }
    }
}
