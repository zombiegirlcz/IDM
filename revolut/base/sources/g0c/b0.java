package g0c;

import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.h1;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements c0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f139417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0c.a f139418b;

    public b0(gte.a featureToggleInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139417a = featureToggleInteractor;
        this.f139418b = productItemFactory;
    }

    @Override // c0c.b
    public final Flow a(h1 h1Var) {
        return new e(new go.g(Boolean.valueOf(((jte.d) this.f139417a).c(RevPointsApi$Toggles.RevPointsVirtualCards.f83472c)), 2), this, h1Var, 14);
    }
}
