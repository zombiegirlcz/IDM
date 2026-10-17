package cel;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23499c;
    public final int d;

    public b(int i, int i2, String ref2, List series) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(series, "series");
        this.f23497a = ref2;
        this.f23498b = series;
        this.f23499c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f23497a, bVar.f23497a) && Intrinsics.f(this.f23498b, bVar.f23498b) && this.f23499c == bVar.f23499c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f23499c, p.a.d(this.f23497a.hashCode() * 31, 31, this.f23498b), 31);
    }
}
