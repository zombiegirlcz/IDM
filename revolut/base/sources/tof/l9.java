package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f272919a;

    public l9(t0 fraudState) {
        Intrinsics.checkNotNullParameter(fraudState, "fraudState");
        this.f272919a = fraudState;
    }

    public final t0 a() {
        return this.f272919a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l9) && this.f272919a == ((l9) obj2).f272919a;
    }

    public final int hashCode() {
        return this.f272919a.hashCode();
    }
}
