package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm f166692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym f166693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn f166694c;

    public um(xm xmVar, ym fill, dn dnVar) {
        Intrinsics.checkNotNullParameter(fill, "fill");
        this.f166692a = xmVar;
        this.f166693b = fill;
        this.f166694c = dnVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof um)) {
            return false;
        }
        um umVar = (um) obj2;
        return Intrinsics.f(this.f166692a, umVar.f166692a) && Intrinsics.f(this.f166693b, umVar.f166693b) && Intrinsics.f(this.f166694c, umVar.f166694c);
    }

    public final int hashCode() {
        xm xmVar = this.f166692a;
        int iHashCode = (this.f166693b.hashCode() + ((xmVar == null ? 0 : Integer.hashCode(xmVar.f167195a)) * 31)) * 31;
        dn dnVar = this.f166694c;
        return iHashCode + (dnVar != null ? dnVar.hashCode() : 0);
    }

    public /* synthetic */ um(ym ymVar, dn dnVar, int i) {
        this((xm) null, ymVar, (i & 4) != 0 ? null : dnVar);
    }
}
