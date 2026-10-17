package ix6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f169382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f169383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169384c;

    public d0(Clause title, TextLocalisedClause textLocalisedClause, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f169382a = title;
        this.f169383b = textLocalisedClause;
        this.f169384c = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f169382a, d0Var.f169382a) && Intrinsics.f(this.f169383b, d0Var.f169383b) && Intrinsics.f(this.f169384c, d0Var.f169384c);
    }

    public final int hashCode() {
        int iHashCode = this.f169382a.hashCode() * 31;
        Clause clause = this.f169383b;
        return this.f169384c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
