package zm3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f323334c;
    public final List d;
    public final boolean e;

    public b(List frequent, List recent, List revolut, List other, boolean z) {
        Intrinsics.checkNotNullParameter(frequent, "frequent");
        Intrinsics.checkNotNullParameter(recent, "recent");
        Intrinsics.checkNotNullParameter(revolut, "revolut");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f323332a = frequent;
        this.f323333b = recent;
        this.f323334c = revolut;
        this.d = other;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323332a, bVar.f323332a) && Intrinsics.f(this.f323333b, bVar.f323333b) && Intrinsics.f(this.f323334c, bVar.f323334c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.d(p.a.d(p.a.d(this.f323332a.hashCode() * 31, 31, this.f323333b), 31, this.f323334c), 31, this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var, f0Var, f0Var, false);
    }
}
