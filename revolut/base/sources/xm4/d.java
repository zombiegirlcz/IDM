package xm4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f307080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f307081c;

    public d(String sourcePocketId, dj0.d money, c cVar) {
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f307079a = sourcePocketId;
        this.f307080b = money;
        this.f307081c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f307079a, dVar.f307079a) && Intrinsics.f(this.f307080b, dVar.f307080b) && Intrinsics.f(this.f307081c, dVar.f307081c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f307079a.hashCode() * 31, 31, this.f307080b);
        c cVar = this.f307081c;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
