package n87;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f213272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klh.c f213273b;

    public v(jbh.e performanceAssetMapper, klh.c commoditiesUIMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(commoditiesUIMapper, "commoditiesUIMapper");
        this.f213272a = performanceAssetMapper;
        this.f213273b = commoditiesUIMapper;
    }

    public final RowDelegate.Model a(vel.f performanceAsset) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        if (performanceAsset instanceof vel.d) {
            vel.d dVar = (vel.d) performanceAsset;
            return this.f213273b.a(new jih.a(dVar.f288352a, dVar), f0.f322471a, new u(performanceAsset));
        }
        if (!(performanceAsset instanceof vel.c) && !(performanceAsset instanceof vel.b) && !(performanceAsset instanceof vel.e)) {
            throw new NoWhenBranchMatchedException();
        }
        return j1h.b.a(this.f213272a, performanceAsset, new u(performanceAsset), 4);
    }
}
