package ol0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f226301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f226302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f226303c;
    public final int d;
    public int e;

    public o(boolean z, int i, StringBuilder contentBuilder, int i2) {
        Intrinsics.checkNotNullParameter(contentBuilder, "contentBuilder");
        this.f226301a = z;
        this.f226302b = i;
        this.f226303c = contentBuilder;
        this.d = i2;
        this.e = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f226301a == oVar.f226301a && this.f226302b == oVar.f226302b && Intrinsics.f(this.f226303c, oVar.f226303c) && this.d == oVar.d && this.e == oVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, (this.f226303c.hashCode() + j6.a.b(this.f226302b, Boolean.hashCode(this.f226301a) * 31, 31)) * 31, 31);
    }
}
