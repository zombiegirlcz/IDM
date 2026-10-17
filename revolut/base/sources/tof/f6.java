package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f6 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272752a;

    public f6(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f272752a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f6) && Intrinsics.f(this.f272752a, ((f6) obj2).f272752a);
    }

    public final int hashCode() {
        return this.f272752a.hashCode();
    }
}
