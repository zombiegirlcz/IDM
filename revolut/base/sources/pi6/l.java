package pi6;

import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureConfig f236448a;

    public l(FeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f236448a = featureConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f236448a, ((l) obj2).f236448a);
    }

    public final int hashCode() {
        return this.f236448a.hashCode();
    }
}
