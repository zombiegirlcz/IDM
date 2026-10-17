package n8i;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f213453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f213454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f213455c;
    public final Clause d;
    public final List e;

    public n0(m0 toolbar, h0 actionButton, l0 scheduleButton, Clause clause, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(scheduleButton, "scheduleButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213453a = toolbar;
        this.f213454b = actionButton;
        this.f213455c = scheduleButton;
        this.d = clause;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f213453a.equals(n0Var.f213453a) && this.f213454b.equals(n0Var.f213454b) && this.f213455c.equals(n0Var.f213455c) && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f213455c.hashCode() + ((this.f213454b.hashCode() + (this.f213453a.hashCode() * 31)) * 31)) * 31;
        Clause clause = this.d;
        return this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
