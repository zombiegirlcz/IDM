package tqe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273555a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f273555a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f273555a, ((b) obj2).f273555a);
    }

    public final int hashCode() {
        return this.f273555a.hashCode();
    }
}
