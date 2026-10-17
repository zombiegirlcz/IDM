package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273204a;

    public z7(String lastFour) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f273204a = lastFour;
    }

    public final String a() {
        return this.f273204a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z7) && Intrinsics.f(this.f273204a, ((z7) obj2).f273204a);
    }

    public final int hashCode() {
        return this.f273204a.hashCode();
    }
}
