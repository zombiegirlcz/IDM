package u80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f278025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f278026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278027c;

    public a(long j2, long j3, String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        this.f278025a = j2;
        this.f278026b = j3;
        this.f278027c = suffix;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f278025a == aVar.f278025a && this.f278026b == aVar.f278026b && Intrinsics.f(this.f278027c, aVar.f278027c);
    }

    public final int hashCode() {
        return this.f278027c.hashCode() + a0.d.c(Long.hashCode(this.f278025a) * 31, 31, this.f278026b);
    }
}
