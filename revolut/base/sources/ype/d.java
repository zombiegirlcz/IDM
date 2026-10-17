package ype;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f315850c;
    public final boolean d;
    public final Boolean e;

    public d(String extractedTin, String formattedTin, boolean z, boolean z3, Boolean bool) {
        Intrinsics.checkNotNullParameter(extractedTin, "extractedTin");
        Intrinsics.checkNotNullParameter(formattedTin, "formattedTin");
        this.f315848a = extractedTin;
        this.f315849b = formattedTin;
        this.f315850c = z;
        this.d = z3;
        this.e = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f315848a, dVar.f315848a) && Intrinsics.f(this.f315849b, dVar.f315849b) && this.f315850c == dVar.f315850c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c(this.f315848a.hashCode() * 31, 31, this.f315849b), 31, this.f315850c), 31, this.d);
        Boolean bool = this.e;
        return iC + (bool == null ? 0 : bool.hashCode());
    }
}
