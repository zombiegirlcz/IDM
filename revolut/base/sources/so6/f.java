package so6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f264799c;

    public f(String title, String value, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f264797a = title;
        this.f264798b = value;
        this.f264799c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f264797a, fVar.f264797a) && Intrinsics.f(this.f264798b, fVar.f264798b) && Intrinsics.f(this.f264799c, fVar.f264799c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f264797a.hashCode() * 31, 31, this.f264798b);
        d dVar = this.f264799c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
