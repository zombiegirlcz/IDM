package wl0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f298358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f298359b;

    public m(Object obj2, o biometricType) {
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f298358a = obj2;
        this.f298359b = biometricType;
    }

    public final o a() {
        return this.f298359b;
    }

    public final Object b() {
        return this.f298358a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f298358a, mVar.f298358a) && this.f298359b == mVar.f298359b;
    }

    public final int hashCode() {
        Object obj2 = this.f298358a;
        return this.f298359b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
