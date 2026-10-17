package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f272753a;

    public f7(l apmType) {
        Intrinsics.checkNotNullParameter(apmType, "apmType");
        this.f272753a = apmType;
    }

    public final l a() {
        return this.f272753a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f7) && this.f272753a == ((f7) obj2).f272753a;
    }

    public final int hashCode() {
        return this.f272753a.hashCode();
    }
}
