package jtf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f178508b;

    public g(TextLocalisedClause clause, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f178507a = id10;
        this.f178508b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f178507a.equals(gVar.f178507a) && this.f178508b.equals(gVar.f178508b);
    }

    public final int hashCode() {
        return this.f178508b.hashCode() + (this.f178507a.hashCode() * 31);
    }
}
