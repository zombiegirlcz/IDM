package urd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f282271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f282272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f282273c;

    public b(TextClause textClause, Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f282271a = textClause;
        this.f282272b = title;
        this.f282273c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f282271a, bVar.f282271a) && this.f282272b.equals(bVar.f282272b) && Intrinsics.f(this.f282273c, bVar.f282273c);
    }

    public final int hashCode() {
        Clause clause = this.f282271a;
        int iB = p.a.b((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f282272b);
        Clause clause2 = this.f282273c;
        return iB + (clause2 != null ? clause2.hashCode() : 0);
    }
}
