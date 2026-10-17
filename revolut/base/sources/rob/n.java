package rob;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model.b f255962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f255963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f255964c;

    public n(RowDelegate.Model.b state, TextLocalisedClause textLocalisedClause, Custom custom) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f255962a = state;
        this.f255963b = textLocalisedClause;
        this.f255964c = custom;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f255962a, nVar.f255962a) && Intrinsics.f(this.f255963b, nVar.f255963b) && Intrinsics.f(this.f255964c, nVar.f255964c);
    }

    public final int hashCode() {
        int iHashCode = this.f255962a.hashCode() * 31;
        Clause clause = this.f255963b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Style style = this.f255964c;
        return iHashCode2 + (style != null ? style.hashCode() : 0);
    }
}
