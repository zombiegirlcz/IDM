package ri4;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f254543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f254544c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f254545g;

    public j(Clause title, Clause clause, Clause clause2, Clause secondaryButtonText, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f254542a = items;
        this.f254543b = title;
        this.f254544c = clause;
        this.d = clause2;
        this.e = secondaryButtonText;
        this.f = z;
        this.f254545g = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f254542a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f254542a, jVar.f254542a) && this.f254543b.equals(jVar.f254543b) && Intrinsics.f(this.f254544c, jVar.f254544c) && Intrinsics.f(this.d, jVar.d) && this.e.equals(jVar.e) && this.f == jVar.f && this.f254545g == jVar.f254545g;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f254542a.hashCode() * 31, 31, this.f254543b);
        Clause clause = this.f254544c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.f254545g) + j6.a.c(p.a.a((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }
}
