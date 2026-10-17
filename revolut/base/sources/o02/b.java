package o02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221099a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f221099a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f221099a, ((b) obj2).f221099a);
    }

    public final int hashCode() {
        return this.f221099a.hashCode();
    }
}
