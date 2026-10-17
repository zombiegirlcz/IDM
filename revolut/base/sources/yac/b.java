package yac;

import kotlin.jvm.internal.Intrinsics;
import m1c.r1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f312007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f312008b;

    public b(r1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f312007a = value;
        this.f312008b = value.f201449a.d;
    }

    @Override // yac.c
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f312007a, ((b) obj2).f312007a);
    }

    public final int hashCode() {
        return this.f312007a.hashCode();
    }

    @Override // yac.c
    public final long l0() {
        return this.f312008b;
    }
}
