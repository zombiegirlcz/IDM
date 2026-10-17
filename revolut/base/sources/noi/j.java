package noi;

import aii.p;
import aii.u;
import com.revolut.analytics.integrity.IntegrityAnalyticsFeatureToggles;
import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return d0.E0(IntegrityAnalyticsFeatureToggles.a(), AnalyticsFeatureToggles.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
