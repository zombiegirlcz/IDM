package uz9;

import aii.g;
import aii.u;
import com.revolut.feature.payments.api.PaymentsToggles$AndroidTransferOnlyChatAnimation;
import com.revolut.feature.payments.social.api.SocialPaymentsApi$Toggles;
import com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination;
import com.revolut.feature.payments.social.api.navigation.PeerToPeerTransferDestination;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlow;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlowContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlow;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlowContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlow;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlowContract$InputData;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import n0a.c;
import y8k.e;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f284655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f284656b;

    public b(e transferFlowProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transferFlowProvider, "transferFlowProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f284655a = transferFlowProvider;
        this.f284656b = featureToggleInteractor;
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof kz9.b)) {
            return null;
        }
        kz9.b bVar = (kz9.b) descriptor;
        return bVar.a(new TransferOnlyChatFlow(new TransferOnlyChatFlowContract$InputData(bVar.b(), c.DESCRIPTOR), yz9.g.f318059a));
    }

    @Override // nte.a
    public final List e() {
        return SocialPaymentsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TransferOnlyChatDestination) {
            return ((d) this.f284656b).c(PaymentsToggles$AndroidTransferOnlyChatAnimation.f79141c) ? new TransferOnlyChatToTransferFlow(new TransferOnlyChatToTransferFlowContract$InputData(((TransferOnlyChatDestination) destination).getF79737a())) : new TransferOnlyChatFlow(new TransferOnlyChatFlowContract$InputData(((TransferOnlyChatDestination) destination).getF79737a()), yz9.g.f318059a);
        }
        if (destination instanceof PeerToPeerChatDestination) {
            PeerToPeerChatDestination peerToPeerChatDestination = (PeerToPeerChatDestination) destination;
            return new PeerToPeerChatFlow(new PeerToPeerChatFlowContract$InputData(peerToPeerChatDestination.getF79728a(), peerToPeerChatDestination.getF79729b(), peerToPeerChatDestination.getF79730c()));
        }
        if (!(destination instanceof PeerToPeerTransferDestination)) {
            return null;
        }
        PeerToPeerTransferDestination peerToPeerTransferDestination = (PeerToPeerTransferDestination) destination;
        return gc0.c.b(this.f284655a.a(peerToPeerTransferDestination.getF79731a(), m1l.a.SCHEDULE_ENABLED, peerToPeerTransferDestination.getF79732b()), new ogk.b(28));
    }
}
