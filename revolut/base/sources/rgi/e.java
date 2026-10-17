package rgi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f254189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f254190b;

    public e(k request, Clause clause) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f254189a = request;
        this.f254190b = clause;
    }

    public static e a(e eVar, j jVar, TextClause textClause, int i) {
        k request = jVar;
        if ((i & 1) != 0) {
            request = eVar.f254189a;
        }
        Clause clause = textClause;
        if ((i & 2) != 0) {
            clause = eVar.f254190b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new e(request, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f254189a, eVar.f254189a) && Intrinsics.f(this.f254190b, eVar.f254190b);
    }

    public final int hashCode() {
        int iHashCode = this.f254189a.hashCode() * 31;
        Clause clause = this.f254190b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
