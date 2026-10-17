package w1f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f293850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f293851c;
    public final boolean d;

    public c() {
        this(null, 15, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f293849a, cVar.f293849a) && Intrinsics.f(this.f293850b, cVar.f293850b) && this.f293851c == cVar.f293851c && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.d(this.f293849a.hashCode() * 31, 31, this.f293850b), 31, this.f293851c);
    }

    public c(List titleArgs, List descriptionArgs, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        this.f293849a = titleArgs;
        this.f293850b = descriptionArgs;
        this.f293851c = z;
        this.d = z3;
    }

    public c(List list, int i, List list2) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? f0.f322471a : list2, (i & 4) == 0, false);
    }
}
