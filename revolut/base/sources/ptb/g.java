package ptb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f239647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f239649c;
    public final Boolean d;
    public final boolean e;
    public final List f;

    public g(boolean z, boolean z3, Boolean bool, Boolean bool2, boolean z4, List customisableTabs) {
        Intrinsics.checkNotNullParameter(customisableTabs, "customisableTabs");
        this.f239647a = z;
        this.f239648b = z3;
        this.f239649c = bool;
        this.d = bool2;
        this.e = z4;
        this.f = customisableTabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f239647a == gVar.f239647a && this.f239648b == gVar.f239648b && Intrinsics.f(this.f239649c, gVar.f239649c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f239647a) * 31, 31, this.f239648b);
        Boolean bool = this.f239649c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.e);
    }

    public g(boolean z, boolean z3, Boolean bool, Boolean bool2, boolean z4) {
        this(z, z3, bool, bool2, z4, f0.f322471a);
    }
}
