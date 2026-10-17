package y8k;

import aii.g;
import aii.p;
import aii.u;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferWithPreloadDestination;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlow;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.PeerToPeerInfoPreloadFlow;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.PeerToPeerInfoPreloadFlowContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s8k.k;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f311672a = y0.b(new a());

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof s8k.e) {
            s8k.e eVar = (s8k.e) descriptor;
            return eVar.a(new PeerToPeerTransferFlow(eVar.b()));
        }
        if (descriptor instanceof k) {
            k kVar = (k) descriptor;
            return kVar.a(new PeerToPeerReviewScreen(kVar.b()));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PeerToPeerTransferBridgeFeatureConfig.BridgeDestination) {
            return new PeerToPeerTransferFlow(((PeerToPeerTransferBridgeFeatureConfig.BridgeDestination) destination).f102278a);
        }
        if (destination instanceof PeerToPeerTransferWithPreloadDestination) {
            return new PeerToPeerInfoPreloadFlow(new PeerToPeerInfoPreloadFlowContract$InputData(((PeerToPeerTransferWithPreloadDestination) destination).getF102296a()));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f311672a;
    }
}
