package atk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9086a;

    public e(String instrumentRef) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        this.f9086a = instrumentRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f9086a, ((e) obj2).f9086a);
    }

    public final int hashCode() {
        return this.f9086a.hashCode();
    }
}
