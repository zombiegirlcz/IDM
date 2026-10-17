package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272738a;

    public e9(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f272738a = prefix;
    }

    public final String a() {
        return this.f272738a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e9) && Intrinsics.f(this.f272738a, ((e9) obj2).f272738a);
    }

    public final int hashCode() {
        return this.f272738a.hashCode();
    }
}
