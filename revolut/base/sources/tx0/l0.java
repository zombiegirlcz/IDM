package tx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f275180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f275181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f275182c;
    public final List d;
    public final n0 e;

    public l0(TextLocalisedClause topLabel, Clause title, Clause clause, AbstractList segments, n0 state) {
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f275180a = topLabel;
        this.f275181b = title;
        this.f275182c = clause;
        this.d = segments;
        this.e = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f275180a.equals(l0Var.f275180a) && this.f275181b.equals(l0Var.f275181b) && Intrinsics.f(this.f275182c, l0Var.f275182c) && Intrinsics.f(this.d, l0Var.d) && this.e == l0Var.e;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f275180a.hashCode() * 31, 31, this.f275181b);
        Clause clause = this.f275182c;
        return this.e.hashCode() + p.a.d((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
    }
}
