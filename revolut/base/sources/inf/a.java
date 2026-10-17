package inf;

import com.revolut.feature.transactions.impl.ui.pending.navigation.PendingTransactionFlowDestination;
import com.revolut.feature.transactions.impl.ui.pending.navigation.PendingTransactionRevertDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import fag.g;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements rhf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f162933a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f162933a = navigator;
    }

    public static KompotDestination b(c cVar) {
        String strE = cVar.e(1);
        KompotDestination pendingTransactionFlowDestination = Intrinsics.f(strE, "pending-transaction-info") ? new PendingTransactionFlowDestination(cVar.e(2)) : Intrinsics.f(strE, "revert-pending-transaction") ? new PendingTransactionRevertDestination(cVar.e(2)) : null;
        if (pendingTransactionFlowDestination == null || cVar.e(2).length() <= 0) {
            return null;
        }
        return pendingTransactionFlowDestination;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        return (Intrinsics.f(strE, "pending-transaction-info") || Intrinsics.f(strE, "revert-pending-transaction")) && deeplink.e(2).length() > 0;
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        KompotDestination kompotDestinationB;
        String strE = cVar.e(1);
        if (Intrinsics.f(strE, "pending-transaction-info")) {
            KompotDestination kompotDestinationB2 = b(cVar);
            if (kompotDestinationB2 != null) {
                return new h(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) kompotDestinationB2, false, (Integer) null, 0, 61))), null);
            }
        } else if (Intrinsics.f(strE, "revert-pending-transaction") && (kompotDestinationB = b(cVar)) != null) {
            return new h(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(kompotDestinationB, yhi.b.BOTTOM_DIALOG, (Integer) null, 12))), null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new g(this, deeplink, 12), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
