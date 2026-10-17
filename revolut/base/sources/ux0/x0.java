package ux0;

import aw0.a9;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x0 implements z0, tx0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx0.u f283841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283843c;
    public final a9 d;
    public final Clause e;
    public final int f;

    public x0(tx0.u moreActionId, List actions, List stories, a9 storiesPlaybackStrategy, Clause clause) {
        Intrinsics.checkNotNullParameter(moreActionId, "moreActionId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(stories, "stories");
        Intrinsics.checkNotNullParameter(storiesPlaybackStrategy, "storiesPlaybackStrategy");
        this.f283841a = moreActionId;
        this.f283842b = actions;
        this.f283843c = stories;
        this.d = storiesPlaybackStrategy;
        this.e = clause;
        this.f = actions.size();
    }

    @Override // tx0.b
    public final int a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f283841a, x0Var.f283841a) && Intrinsics.f(this.f283842b, x0Var.f283842b) && Intrinsics.f(this.f283843c, x0Var.f283843c) && this.d == x0Var.d && Intrinsics.f(this.e, x0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.d(p.a.d(this.f283841a.hashCode() * 31, 31, this.f283842b), 31, this.f283843c)) * 31;
        Clause clause = this.e;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
