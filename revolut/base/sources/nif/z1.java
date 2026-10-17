package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f216088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f216089b;

    public /* synthetic */ z1(int i, long j2, Double d) {
        if (3 != (i & 3)) {
            qlm.j1.f(x1.f216067a.getDescriptor(), i, 3);
            throw null;
        }
        this.f216088a = j2;
        this.f216089b = d;
    }

    public final long a() {
        return this.f216088a;
    }

    public final Double b() {
        return this.f216089b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return this.f216088a == z1Var.f216088a && Intrinsics.f(this.f216089b, z1Var.f216089b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f216088a) * 31;
        Double d = this.f216089b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public z1(long j2, Double d) {
        this.f216088a = j2;
        this.f216089b = d;
    }
}
