package nhi;

import com.revolut.kompot.FeatureFlowStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureFlowStep f215499a;

    public c(FeatureFlowStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f215499a = step;
    }

    public final FeatureFlowStep a() {
        return this.f215499a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f215499a.equals(((c) obj2).f215499a);
    }

    public final int hashCode() {
        return this.f215499a.hashCode() * 31;
    }
}
