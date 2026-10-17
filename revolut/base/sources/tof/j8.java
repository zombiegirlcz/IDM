package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272864a;

    public j8(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f272864a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j8) && Intrinsics.f(this.f272864a, ((j8) obj2).f272864a);
    }

    public final String getCode() {
        return this.f272864a;
    }

    public final int hashCode() {
        return this.f272864a.hashCode();
    }
}
