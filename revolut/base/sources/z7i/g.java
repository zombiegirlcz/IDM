package z7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bla.c f320016a;

    public g(bla.c predefinedFeatureState) {
        Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
        this.f320016a = predefinedFeatureState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f320016a == ((g) obj2).f320016a;
    }

    public final int hashCode() {
        return this.f320016a.hashCode();
    }
}
