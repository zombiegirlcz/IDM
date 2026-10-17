package vi9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.i50;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i50 f289547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f289548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f289549c;

    public p(i50 state, q titleConfig, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(titleConfig, "titleConfig");
        this.f289547a = state;
        this.f289548b = titleConfig;
        this.f289549c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f289547a, pVar.f289547a) && Intrinsics.f(this.f289548b, pVar.f289548b) && Intrinsics.f(this.f289549c, pVar.f289549c);
    }

    public final int hashCode() {
        int iHashCode = (this.f289548b.hashCode() + (this.f289547a.hashCode() * 31)) * 31;
        Clause clause = this.f289549c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
