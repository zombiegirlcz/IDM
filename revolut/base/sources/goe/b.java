package goe;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f145152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145154c;
    public final String d;

    public b(f taxResidency, boolean z, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        this.f145152a = taxResidency;
        this.f145153b = z;
        this.f145154c = z3;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145152a, bVar.f145152a) && this.f145153b == bVar.f145153b && this.f145154c == bVar.f145154c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f145152a.hashCode() * 31, 31, this.f145153b), 31, this.f145154c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
