package xce;

import bde.p;
import bde.q;
import com.revolut.data.model.Data;
import com.revolut.domain.models.support.StateAfterReplacement;
import com.revolut.domain.models.support.TrackingChannel;
import com.revolut.domain.models.support.TroubleshootingCardDeliveryState;
import com.revolut.domain.models.support.TroubleshootingCardOwnerType;
import com.revolut.domain.models.support.TroubleshootingSource;
import com.revolut.feature.address.models.Address;
import cpi.g;
import d71.l;
import efm.r;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f304113b;

    public /* synthetic */ a(f fVar, int i) {
        this.f304112a = i;
        this.f304113b = fVar;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        bde.b bVar;
        String str;
        TroubleshootingCardDeliveryState troubleshootingCardDeliveryState;
        TrackingChannel trackingChannel;
        TrackingChannel trackingChannel2;
        StateAfterReplacement stateAfterReplacement;
        d71.a aVar;
        switch (this.f304112a) {
            case 0:
                q dto = (q) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return this.f304113b.f304120b.L(dto);
            case 1:
                List dtoList = (List) obj2;
                Intrinsics.checkNotNullParameter(dtoList, "dtoList");
                return r.fromIterable(dtoList).flatMapMaybe(new x9h.d(18, new a(this.f304113b, 0))).toList();
            case 2:
                List dtoList2 = (List) obj2;
                Intrinsics.checkNotNullParameter(dtoList2, "dtoList");
                return r.fromIterable(dtoList2).flatMapMaybe(new x9h.d(22, new a(this.f304113b, 3))).toList();
            case 3:
                q dto2 = (q) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return this.f304113b.f304120b.L(dto2);
            default:
                bde.b payload = (bde.b) obj2;
                Intrinsics.checkNotNullParameter(payload, "it");
                g gVar = this.f304113b.f304120b;
                Intrinsics.checkNotNullParameter(payload, "payload");
                TroubleshootingCardDeliveryState troubleshootingCardDeliveryState2 = (TroubleshootingCardDeliveryState) u1.v(payload.getDeliveryState(), r0.k(new Pair("DELIVERED", TroubleshootingCardDeliveryState.DELIVERED), new Pair("UNTRACKED_ON_WAY", TroubleshootingCardDeliveryState.UNTRACKED_ON_WAY), new Pair("UNTRACKED_SHOULD_DELIVERED", TroubleshootingCardDeliveryState.UNTRACKED_SHOULD_DELIVERED), new Pair("BEING_POSTED", TroubleshootingCardDeliveryState.BEING_POSTED), new Pair("TRACKED_ON_WAY", TroubleshootingCardDeliveryState.TRACKED_ON_WAY), new Pair("TRACKED_SHOULD_DELIVERED", TroubleshootingCardDeliveryState.TRACKED_SHOULD_DELIVERED)));
                if (troubleshootingCardDeliveryState2 == null) {
                    aVar = null;
                } else {
                    String cardId = payload.getCardId();
                    b93.b bVar2 = new b93.b(payload.getDesign());
                    String name = payload.getName();
                    String brand = payload.getBrand();
                    String lastFour = payload.getLastFour();
                    Address addressA = oo3.a.a(payload.getDeliveryAddress());
                    String estimatedDeliveryDate = payload.getEstimatedDeliveryDate();
                    String deliveryContact = payload.getDeliveryContact();
                    String courierCompany = payload.getCourierCompany();
                    String trackingChannel3 = payload.getTrackingChannel();
                    if (trackingChannel3 != null) {
                        bVar = payload;
                        str = cardId;
                        troubleshootingCardDeliveryState = troubleshootingCardDeliveryState2;
                        trackingChannel = (TrackingChannel) u1.v(trackingChannel3, r0.k(new Pair("APP", TrackingChannel.APP), new Pair("SMS", TrackingChannel.SMS), new Pair("NONE", TrackingChannel.NONE)));
                    } else {
                        bVar = payload;
                        str = cardId;
                        troubleshootingCardDeliveryState = troubleshootingCardDeliveryState2;
                        trackingChannel = null;
                    }
                    p tracking = bVar.getTracking();
                    l lVarW = tracking != null ? hx7.e.w(tracking) : null;
                    String stateAfterReplacement2 = bVar.getStateAfterReplacement();
                    if (stateAfterReplacement2 != null) {
                        trackingChannel2 = trackingChannel;
                        stateAfterReplacement = (StateAfterReplacement) u1.u(stateAfterReplacement2, r0.k(new Pair("LOST", StateAfterReplacement.LOST), new Pair("TERMINATED", StateAfterReplacement.TERMINATED)));
                    } else {
                        trackingChannel2 = trackingChannel;
                        stateAfterReplacement = null;
                    }
                    aVar = new d71.a(TroubleshootingSource.UNSUPPORTED, str, troubleshootingCardDeliveryState, name, brand, lastFour, bVar2, addressA, estimatedDeliveryDate, deliveryContact, courierCompany, trackingChannel2, lVarW, stateAfterReplacement, (TroubleshootingCardOwnerType) u1.t(bVar.getCardOwnerType(), TroubleshootingCardOwnerType.PERSONAL, gVar.f107955c));
                }
                return aVar != null ? new Data(aVar, null, false, 6, null) : new Data(null, new IllegalStateException("Wrong card troubleshooting data"), false, 5, null);
        }
    }
}
