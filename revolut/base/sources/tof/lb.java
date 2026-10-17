package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class lb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.l f272921a;

    public lb(io3.l pocketType) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f272921a = pocketType;
    }

    public final io3.l a() {
        return this.f272921a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof lb) && this.f272921a == ((lb) obj2).f272921a;
    }

    public final int hashCode() {
        return this.f272921a.hashCode();
    }
}
