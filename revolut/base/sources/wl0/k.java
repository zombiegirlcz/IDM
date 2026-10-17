package wl0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f298356a;

    public k(o biometricType) {
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f298356a = biometricType;
    }

    public final o a() {
        return this.f298356a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f298356a == ((k) obj2).f298356a;
    }

    public final int hashCode() {
        return this.f298356a.hashCode();
    }
}
