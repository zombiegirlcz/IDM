package v20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i2 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285434a;

    public i2(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f285434a = rawValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i2) && Intrinsics.f(this.f285434a, ((i2) obj2).f285434a);
    }

    public final int hashCode() {
        return this.f285434a.hashCode();
    }
}
