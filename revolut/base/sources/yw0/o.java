package yw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends r {
    public final n14.e e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f317286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f317287h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n14.e background, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, e eVar) {
        super(false, true, 7);
        Intrinsics.checkNotNullParameter(background, "background");
        this.e = background;
        this.f = textLocalisedClause;
        this.f317286g = textLocalisedClause2;
        this.f317287h = eVar;
    }

    @Override // yw0.r
    public final n14.e a() {
        return this.e;
    }

    @Override // yw0.r
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.e.equals(oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f317286g, oVar.f317286g) && Intrinsics.f(this.f317287h, oVar.f317287h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (Boolean.hashCode(true) * 31)) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f317286g;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        e eVar = this.f317287h;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }
}
