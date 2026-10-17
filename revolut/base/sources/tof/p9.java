package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f272996a;

    public p9(n2 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f272996a = type;
    }

    public final n2 a() {
        return this.f272996a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p9) && this.f272996a == ((p9) obj2).f272996a;
    }

    public final int hashCode() {
        return this.f272996a.hashCode();
    }
}
