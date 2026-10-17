package se6;

import io3.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f262122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f262123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262124c;
    public final boolean d;
    public final xi0.b e;

    public b(boolean z, n topUpSystem, boolean z3, boolean z4, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(topUpSystem, "topUpSystem");
        this.f262122a = z;
        this.f262123b = topUpSystem;
        this.f262124c = z3;
        this.d = z4;
        this.e = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f262122a == bVar.f262122a && this.f262123b == bVar.f262123b && this.f262124c == bVar.f262124c && this.d == bVar.d && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f262123b.hashCode() + (Boolean.hashCode(this.f262122a) * 31)) * 31, 31, this.f262124c), 31, this.d);
        xi0.b bVar = this.e;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
