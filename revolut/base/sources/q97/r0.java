package q97;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wzi.a f243775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t97.c productCellProvider, wzi.a incomeSorterInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        this.f243775b = incomeSorterInteractor;
        this.f243776c = t97.d.INCOME_SORTER;
    }

    @Override // r97.b
    public final Flow d() {
        return new go.g(Boolean.valueOf(((etj.o) this.f243775b).i()), 2);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243776c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(AnalyticsFeatureConfig.IncomeSortersList.f87417h.f98274b);
    }
}
