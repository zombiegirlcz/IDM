package a7g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f1903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f1904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1905c;
    public final Object d;

    public z(TextClause originClause, TextClause destinationClause, Clause dateClause, Clause travellersClause) {
        Intrinsics.checkNotNullParameter(originClause, "originClause");
        Intrinsics.checkNotNullParameter(destinationClause, "destinationClause");
        Intrinsics.checkNotNullParameter(dateClause, "dateClause");
        Intrinsics.checkNotNullParameter(travellersClause, "travellersClause");
        this.f1903a = originClause;
        this.f1904b = destinationClause;
        this.f1905c = dateClause;
        this.d = travellersClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f1903a.equals(zVar.f1903a) && this.f1904b.equals(zVar.f1904b) && this.f1905c.equals(zVar.f1905c) && this.d.equals(zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(v7.b(this.f1903a.hashCode() * 31, 31, this.f1904b), 31, this.f1905c);
    }
}
