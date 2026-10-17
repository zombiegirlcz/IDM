package ee9;

import kotlin.jvm.internal.Intrinsics;
import wl0.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f125160a;

    public f(o biometricType) {
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f125160a = biometricType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f125160a == ((f) obj2).f125160a;
    }

    public final int hashCode() {
        return this.f125160a.hashCode();
    }
}
