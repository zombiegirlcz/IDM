package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272832a;

    public i8(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f272832a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i8) && Intrinsics.f(this.f272832a, ((i8) obj2).f272832a);
    }

    public final String getCode() {
        return this.f272832a;
    }

    public final int hashCode() {
        return this.f272832a.hashCode();
    }
}
