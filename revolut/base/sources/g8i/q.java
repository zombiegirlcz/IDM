package g8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f141383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f141384b;

    public q(Clause clause, TextLocalisedClause textLocalisedClause) {
        this.f141383a = clause;
        this.f141384b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f141383a.equals(qVar.f141383a) && Intrinsics.f(this.f141384b, qVar.f141384b);
    }

    public final int hashCode() {
        int iA = p.a.a(Boolean.hashCode(true) * 31, 31, this.f141383a);
        Clause clause = this.f141384b;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
