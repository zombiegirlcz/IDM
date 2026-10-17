package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2749a;

    public x0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f2749a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x0) && Intrinsics.f(this.f2749a, ((x0) obj2).f2749a);
    }

    public final int hashCode() {
        return this.f2749a.hashCode();
    }
}
