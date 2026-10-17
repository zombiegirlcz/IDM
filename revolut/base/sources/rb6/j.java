package rb6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f252967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f252968c;
    public final int d;

    public j(List items, TextClause textClause, boolean z, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f252966a = items;
        this.f252967b = textClause;
        this.f252968c = z;
        this.d = i;
    }

    @Override // jki.n
    public final List c() {
        return this.f252966a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f252966a, jVar.f252966a) && Intrinsics.f(this.f252967b, jVar.f252967b) && this.f252968c == jVar.f252968c && this.d == jVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f252966a.hashCode() * 31;
        Clause clause = this.f252967b;
        return Integer.hashCode(this.d) + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f252968c);
    }
}
