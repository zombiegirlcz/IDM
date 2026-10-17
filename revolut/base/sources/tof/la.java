package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class la extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272920a;

    public la(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f272920a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof la) && Intrinsics.f(this.f272920a, ((la) obj2).f272920a);
    }

    public final String getCode() {
        return this.f272920a;
    }

    public final int hashCode() {
        return this.f272920a.hashCode();
    }
}
