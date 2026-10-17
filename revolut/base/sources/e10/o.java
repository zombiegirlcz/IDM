package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f121830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121832c;
    public final boolean d;

    public o(i eulerAngles, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(eulerAngles, "eulerAngles");
        this.f121830a = eulerAngles;
        this.f121831b = z;
        this.f121832c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f121830a, oVar.f121830a) && this.f121831b == oVar.f121831b && this.f121832c == oVar.f121832c && this.d == oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f121830a.hashCode() * 31, 31, this.f121831b), 31, this.f121832c);
    }
}
