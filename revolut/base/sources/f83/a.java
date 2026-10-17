package f83;

import h93.f0;
import h93.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f132693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f132694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132695c;
    public final boolean d;
    public final i e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f132696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mf8.d f132697h;

    public a(f0 card, d listItemStatus, boolean z, boolean z3, i iVar, String str, boolean z4, mf8.d dVar) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(listItemStatus, "listItemStatus");
        this.f132693a = card;
        this.f132694b = listItemStatus;
        this.f132695c = z;
        this.d = z3;
        this.e = iVar;
        this.f = str;
        this.f132696g = z4;
        this.f132697h = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f132693a, aVar.f132693a) && Intrinsics.f(this.f132694b, aVar.f132694b) && this.f132695c == aVar.f132695c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f132696g == aVar.f132696g && this.f132697h == aVar.f132697h;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f132694b.hashCode() + (this.f132693a.hashCode() * 31)) * 31, 31, this.f132695c), 31, this.d);
        i iVar = this.e;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f;
        int iC2 = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f132696g);
        mf8.d dVar = this.f132697h;
        return iC2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
