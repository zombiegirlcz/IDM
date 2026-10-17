package lw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f200386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f200387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f200388c;
    public final l d;
    public final boolean e;

    public a(Clause title, Clause clause, g gVar, l lVar, boolean z, int i) {
        clause = (i & 2) != 0 ? null : clause;
        gVar = (i & 4) != 0 ? null : gVar;
        lVar = (i & 8) != 0 ? null : lVar;
        z = (i & 16) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f200386a = title;
        this.f200387b = clause;
        this.f200388c = gVar;
        this.d = lVar;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200386a, aVar.f200386a) && Intrinsics.f(this.f200387b, aVar.f200387b) && Intrinsics.f(this.f200388c, aVar.f200388c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f200386a.hashCode() * 31;
        Clause clause = this.f200387b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        g gVar = this.f200388c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        l lVar = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }
}
