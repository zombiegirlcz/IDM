package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.r f272891a;

    public k7(f5j.r type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f272891a = type;
    }

    public final f5j.r a() {
        return this.f272891a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k7) && this.f272891a == ((k7) obj2).f272891a;
    }

    public final int hashCode() {
        return this.f272891a.hashCode();
    }
}
