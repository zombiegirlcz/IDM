package jnb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f176669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f176670b;

    public c(Clause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f176669a = title;
        this.f176670b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f176669a.equals(cVar.f176669a) && Intrinsics.f(this.f176670b, cVar.f176670b);
    }

    public final int hashCode() {
        int iHashCode = this.f176669a.hashCode() * 31;
        Clause clause = this.f176670b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
