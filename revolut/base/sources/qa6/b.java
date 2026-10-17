package qa6;

import kotlin.jvm.internal.Intrinsics;
import m1c.r1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f243964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f243965b;

    public b(r1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f243964a = value;
        this.f243965b = value.f201449a.d;
    }

    @Override // qa6.c
    public final long a() {
        return this.f243965b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f243964a, ((b) obj2).f243964a);
    }

    public final int hashCode() {
        return this.f243964a.hashCode();
    }
}
