package q97;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class m3 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0j.a f243741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(j0j.a tripsInteractor, t97.c productCellProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(tripsInteractor, "tripsInteractor");
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f243741b = tripsInteractor;
        this.f243742c = t97.d.TRIPS;
    }

    @Override // r97.b
    public final Flow d() {
        return ((vvj.g) this.f243741b).e();
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243742c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(new AnalyticsFeatureConfig.Trips(null)));
    }
}
