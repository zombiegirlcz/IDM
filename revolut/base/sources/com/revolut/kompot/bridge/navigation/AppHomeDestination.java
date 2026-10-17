package com.revolut.kompot.bridge.navigation;

import aii.u;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/bridge/navigation/AppHomeDestination;", "Laii/u;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AppHomeDestination extends u, KompotDestination {
    /* JADX INFO: renamed from: Y0 */
    default TransitionAnimation getF97797a() {
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    FeatureCommand getF83419c();
}
