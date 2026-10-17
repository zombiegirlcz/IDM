package wbi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296220c;
    public final boolean d;
    public final boolean e;

    public a(String code, String codeValueAcronym, String codeHint, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeValueAcronym, "codeValueAcronym");
        Intrinsics.checkNotNullParameter(codeHint, "codeHint");
        this.f296218a = code;
        this.f296219b = codeValueAcronym;
        this.f296220c = codeHint;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f296218a, aVar.f296218a) && Intrinsics.f(this.f296219b, aVar.f296219b) && Intrinsics.f(this.f296220c, aVar.f296220c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.c(p.a.c(this.f296218a.hashCode() * 31, 31, this.f296219b), 31, this.f296220c), 31, this.d);
    }
}
