package sci;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f261750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yci.a f261751b;

    public f(long j2, yci.a frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f261750a = j2;
        this.f261751b = frequency;
    }

    public static f a(f fVar, long j2, yci.a frequency, int i) {
        if ((i & 1) != 0) {
            j2 = fVar.f261750a;
        }
        if ((i & 2) != 0) {
            frequency = fVar.f261751b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new f(j2, frequency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f261750a == fVar.f261750a && this.f261751b == fVar.f261751b;
    }

    public final int hashCode() {
        return this.f261751b.hashCode() + (Long.hashCode(this.f261750a) * 31);
    }
}
