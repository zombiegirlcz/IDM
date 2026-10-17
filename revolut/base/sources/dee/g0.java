package dee;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.i50;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f113406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f113407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i50 f113408c;

    public g0(TextLocalisedClause title, Clause subtitle, i50 state) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f113406a = title;
        this.f113407b = subtitle;
        this.f113408c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f113406a.equals(g0Var.f113406a) && this.f113407b.equals(g0Var.f113407b) && this.f113408c.equals(g0Var.f113408c);
    }

    public final int hashCode() {
        return this.f113408c.hashCode() + p.a.b(this.f113406a.hashCode() * 31, 31, this.f113407b);
    }
}
