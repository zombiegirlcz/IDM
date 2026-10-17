package xl2;

import android.util.Size;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f306914c;
    public final Size d;

    public f() {
        this(false, 15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f306912a == fVar.f306912a && Intrinsics.f(this.f306913b, fVar.f306913b) && this.f306914c == fVar.f306914c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(Boolean.hashCode(this.f306912a) * 31, 31, this.f306913b), 31, this.f306914c);
        Size size = this.d;
        return iC + (size == null ? 0 : size.hashCode());
    }

    public f(boolean z, List internalDeeplinks, boolean z3, Size size) {
        Intrinsics.checkNotNullParameter(internalDeeplinks, "internalDeeplinks");
        this.f306912a = z;
        this.f306913b = internalDeeplinks;
        this.f306914c = z3;
        this.d = size;
    }

    public f(boolean z, int i) {
        this((i & 1) != 0 ? false : z, zhm.f0.f322471a, (i & 4) != 0, null);
    }
}
