package an9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6592c;
    public final int d;
    public final List e;

    public m(List all2, List recent, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(all2, "all");
        Intrinsics.checkNotNullParameter(recent, "recent");
        this.f6590a = all2;
        this.f6591b = i;
        this.f6592c = i2;
        this.d = i3;
        this.e = recent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f6590a, mVar.f6590a) && this.f6591b == mVar.f6591b && this.f6592c == mVar.f6592c && this.d == mVar.d && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f6592c, j6.a.b(this.f6591b, this.f6590a.hashCode() * 31, 31), 31), 31);
    }
}
