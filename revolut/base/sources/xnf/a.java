package xnf;

import kotlin.jvm.internal.Intrinsics;
import snf.y;
import whf.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f307476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f307477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final znf.a f307478c;

    public a(p pVar, y yVar, znf.a aVar, int i) {
        aVar = (i & 8) != 0 ? null : aVar;
        this.f307476a = pVar;
        this.f307477b = yVar;
        this.f307478c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f307476a, aVar.f307476a) && Intrinsics.f(this.f307477b, aVar.f307477b) && Intrinsics.f(this.f307478c, aVar.f307478c);
    }

    public final int hashCode() {
        p pVar = this.f307476a;
        int iC = j6.a.c((pVar == null ? 0 : pVar.hashCode()) * 31, 31, false);
        y yVar = this.f307477b;
        int iHashCode = (iC + (yVar == null ? 0 : yVar.hashCode())) * 31;
        znf.a aVar = this.f307478c;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
