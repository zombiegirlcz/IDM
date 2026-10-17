package et0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw0.v f129034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f129035b;

    public h0(gw0.v badge, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f129034a = badge;
        this.f129035b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f129034a == h0Var.f129034a && Intrinsics.f(this.f129035b, h0Var.f129035b);
    }

    public final int hashCode() {
        int iHashCode = this.f129034a.hashCode() * 31;
        Clause clause = this.f129035b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
