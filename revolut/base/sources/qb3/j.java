package qb3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f244093c;

    public j(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244091a = items;
        this.f244092b = z;
        this.f244093c = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f244091a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f244091a, jVar.f244091a) && this.f244092b == jVar.f244092b && Intrinsics.f(this.f244093c, jVar.f244093c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f244091a.hashCode() * 31, 31, this.f244092b);
        Clause clause = this.f244093c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
