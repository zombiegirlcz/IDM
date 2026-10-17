package ee9;

import kotlin.jvm.internal.Intrinsics;
import wl0.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f125157a;

    public c(o biometricType) {
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f125157a = biometricType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f125157a == ((c) obj2).f125157a;
    }

    public final int hashCode() {
        return this.f125157a.hashCode();
    }
}
