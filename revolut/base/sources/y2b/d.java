package y2b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f310614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310616c;
    public final String d;

    public d(boolean z, String instrumentRef, String portfolioId, String str) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f310614a = z;
        this.f310615b = instrumentRef;
        this.f310616c = portfolioId;
        this.d = str;
    }

    @Override // y2b.e
    public final String a() {
        return this.d;
    }

    @Override // y2b.e
    public final String b() {
        return this.f310615b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f310614a == dVar.f310614a && Intrinsics.f(this.f310615b, dVar.f310615b) && Intrinsics.f(this.f310616c, dVar.f310616c) && Intrinsics.f(this.d, dVar.d);
    }

    @Override // y2b.e
    public final String g() {
        return this.f310616c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(Boolean.hashCode(this.f310614a) * 31, 31, this.f310615b), 31, this.f310616c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
