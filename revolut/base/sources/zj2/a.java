package zj2;

import com.revolut.feature.atm.impl.navigation.AtmsMapFlowDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static AtmsMapFlowDestination a(a aVar, ZoomTransitionAnimation.Widgets widgets, int i) {
        if ((i & 2) != 0) {
            widgets = null;
        }
        aVar.getClass();
        return new AtmsMapFlowDestination(widgets);
    }

    public static FeatureCommand b(a aVar) {
        aVar.getClass();
        return u0.f(new AtmsMapFlowDestination(null));
    }
}
