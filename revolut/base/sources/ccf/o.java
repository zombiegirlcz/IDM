package ccf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f23078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f23079c;
    public final n d;
    public final n e;

    public o(List items, TextClause textClause, y yVar, n nVar, n nVar2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23077a = items;
        this.f23078b = textClause;
        this.f23079c = yVar;
        this.d = nVar;
        this.e = nVar2;
    }

    @Override // jki.n
    public final List c() {
        return this.f23077a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f23077a, oVar.f23077a) && Intrinsics.f(this.f23078b, oVar.f23078b) && Intrinsics.f(this.f23079c, oVar.f23079c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f23077a.hashCode() * 31;
        Clause clause = this.f23078b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        y yVar = this.f23079c;
        int iHashCode3 = (iHashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        n nVar = this.d;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.e;
        return iHashCode4 + (nVar2 != null ? nVar2.hashCode() : 0);
    }
}
