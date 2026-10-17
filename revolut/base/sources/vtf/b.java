package vtf;

import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$FlowState;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import io3.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import org.jmrtd.lds.LDSFile;
import wj7.i;
import wr1.g;
import ybh.n;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f292109b;

    public /* synthetic */ b(int i, dj0.d dVar) {
        this.f292108a = i;
        this.f292109b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVarK;
        switch (this.f292108a) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list = pockets;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            io3.d dVar = (io3.d) it8.next();
                            if (dVar.f == k.ACTIVE) {
                                String str = dVar.f163147c;
                                dj0.d dVar2 = this.f292109b;
                                if (Intrinsics.f(str, dVar2.f115083b.f306286a) && dVar.i >= dVar2.f115082a) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                wj6.d update = (wj6.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LimitConfig limitConfig = update.f297961b;
                dj0.d currentLimit = this.f292109b;
                yj6.a aVarU7 = limitConfig.u7(currentLimit);
                if (aVarU7 == null) {
                    aVarU7 = update.e;
                }
                LimitConfig limitConfig2 = update.f297961b;
                ConsentLimitInputTrackableContext trackableContext = update.f297962c;
                boolean z3 = update.d;
                Intrinsics.checkNotNullParameter(currentLimit, "currentLimit");
                Intrinsics.checkNotNullParameter(limitConfig2, "limitConfig");
                Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
                return new wj6.d(currentLimit, limitConfig2, trackableContext, z3, aVarU7);
            case 2:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i.a(update2, this.f292109b, null, null, null, null, null, false, 509);
            case 3:
                return g.a((g) obj2, null, this.f292109b, null, null, LDSFile.EF_SOD_TAG);
            case 4:
                return RevPointsBuyingFlowContract$FlowState.a((RevPointsBuyingFlowContract$FlowState) obj2, null, false, this.f292109b, 3);
            case 5:
                dj0.d dVar3 = this.f292109b;
                return PaymentLinksTransferData.a((PaymentLinksTransferData) obj2, dVar3.f115082a, dVar3.f115083b, null, null, null, null, null, 508);
            case 6:
                return n.a((n) obj2, this.f292109b, null, null, null, null, null, null, null, null, null, null, false, false, true, null, null, false, 122878);
            case 7:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                h hVar = od0.i.Companion;
                n9l.a aVar = (n9l.a) d0.d0(exchangeRates);
                if (aVar != null) {
                    dVarK = pyd.c.K(this.f292109b, aVar.f213663c, aVar.f213662b);
                } else {
                    dVarK = null;
                }
                hVar.getClass();
                return h.a(dVarK);
            case 8:
                dj0.d dVar4 = this.f292109b;
                return PeerToPeerTransferData.a((PeerToPeerTransferData) obj2, dVar4.f115082a, dVar4.f115083b, null, null, null, null, null, null, null, null, null, 262140);
            default:
                return zul.n.a((zul.n) obj2, null, this.f292109b, null, null, null, null, null, null, null, null, null, 4093);
        }
    }
}
