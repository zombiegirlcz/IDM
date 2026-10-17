package pj4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au3.l f236663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f236664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f236665c;

    public f(au3.l content, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f236663a = content;
        this.f236664b = z;
        this.f236665c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f236663a, fVar.f236663a) && this.f236664b == fVar.f236664b && this.f236665c == fVar.f236665c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236665c) + j6.a.c(this.f236663a.hashCode() * 31, 31, this.f236664b);
    }
}
