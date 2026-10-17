package c64;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f21635a;

    public n(FeatureCommand redirectDestination) {
        Intrinsics.checkNotNullParameter(redirectDestination, "redirectDestination");
        this.f21635a = redirectDestination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f21635a.equals(((n) obj2).f21635a);
    }

    public final int hashCode() {
        return this.f21635a.f98638a.hashCode();
    }
}
