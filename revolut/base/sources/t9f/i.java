package t9f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f269018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f269020c;

    public i(ej0.b purchasePrice, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        this.f269018a = purchasePrice;
        this.f269019b = z;
        this.f269020c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f269018a, iVar.f269018a) && this.f269019b == iVar.f269019b && this.f269020c == iVar.f269020c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269020c) + j6.a.c(this.f269018a.hashCode() * 31, 31, this.f269019b);
    }
}
