package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ba extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272653a;

    public ba(String legId) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f272653a = legId;
    }

    public final String a() {
        return this.f272653a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ba) && Intrinsics.f(this.f272653a, ((ba) obj2).f272653a);
    }

    public final int hashCode() {
        return this.f272653a.hashCode();
    }
}
