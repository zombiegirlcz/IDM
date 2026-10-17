package b5e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f12496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f12497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f12498c;
    public final Clause d;
    public final List e;

    public j(TextClause title, Clause clause, TextClause description, Clause clause2, List images) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f12496a = title;
        this.f12497b = clause;
        this.f12498c = description;
        this.d = clause2;
        this.e = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f12496a.equals(jVar.f12496a) && Intrinsics.f(this.f12497b, jVar.f12497b) && this.f12498c.equals(jVar.f12498c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f12496a.hashCode() * 31;
        Clause clause = this.f12497b;
        int iB = v7.b((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f12498c);
        Clause clause2 = this.d;
        return this.e.hashCode() + ((iB + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
