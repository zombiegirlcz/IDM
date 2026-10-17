package d4f;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f111304a;

    public s(xoj.a featuresInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                this.f111304a = featuresInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                this.f111304a = featuresInteractor;
                break;
        }
    }

    public Flow a(Set features) {
        Intrinsics.checkNotNullParameter(features, "features");
        return features.isEmpty() ? new go.g(new Data(r0.g(), null, false, 6, null), 2) : nim.a.v(rd0.e.b(((cpj.b) this.f111304a).f107969a.b(false)), new d3i.k(features, this, 7));
    }
}
