package dz8;

import aii.u;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.learn.impl.ui.share_rewards.ShareRewardsScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShareRewardsScreen f121296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f121297b;

    public j(ShareRewardsScreen screen, BridgeDestination bridgeDestination) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ModalDestination.Style.POPUP style = ModalDestination.Style.POPUP.f98311a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f121296a = screen;
        this.f121297b = bridgeDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        if (!this.f121296a.equals(jVar.f121296a)) {
            return false;
        }
        Object obj3 = ModalDestination.Style.POPUP.f98311a;
        return obj3.equals(obj3) && Intrinsics.f(this.f121297b, jVar.f121297b);
    }

    public final int hashCode() {
        int iHashCode = (ModalDestination.Style.POPUP.f98311a.hashCode() + (this.f121296a.hashCode() * 31)) * 31;
        u uVar = this.f121297b;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }
}
