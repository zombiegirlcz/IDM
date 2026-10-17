package kk9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f184539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f184540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f184541c;
    public final f d;

    public k(TextLocalisedClause textLocalisedClause, List items, TextLocalisedClause textLocalisedClause2, f fVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f184539a = textLocalisedClause;
        this.f184540b = items;
        this.f184541c = textLocalisedClause2;
        this.d = fVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f184540b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f184539a, kVar.f184539a) && Intrinsics.f(this.f184540b, kVar.f184540b) && Intrinsics.f(this.f184541c, kVar.f184541c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f184539a;
        int iD = p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f184540b);
        Clause clause2 = this.f184541c;
        int iHashCode = (iD + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        f fVar = this.d;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
