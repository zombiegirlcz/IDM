package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273148a;

    public w9(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f273148a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w9) && Intrinsics.f(this.f273148a, ((w9) obj2).f273148a);
    }

    public final String getCode() {
        return this.f273148a;
    }

    public final int hashCode() {
        return this.f273148a.hashCode();
    }
}
