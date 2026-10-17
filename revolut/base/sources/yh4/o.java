package yh4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f313763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f313764c;
    public final yy0.l d;
    public final aw0.i e;

    public o(List items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, yy0.j jVar, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f313762a = items;
        this.f313763b = title;
        this.f313764c = textLocalisedClause;
        this.d = jVar;
        this.e = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f313762a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f313762a, oVar.f313762a) && this.f313763b.equals(oVar.f313763b) && Intrinsics.f(this.f313764c, oVar.f313764c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f313762a.hashCode() * 31, 31, this.f313763b);
        Clause clause = this.f313764c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        yy0.l lVar = this.d;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        aw0.i iVar = this.e;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
