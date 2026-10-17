package jsl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.s3;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f178209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f178210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f178211c;
    public final s3 d;
    public final AccentCircleBadge e;
    public final List f;

    public f0(Clause title, TextLocalisedClause description, TimeClause timeClause, s3 s3Var, AccentCircleBadge accentCircleBadge, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f178209a = title;
        this.f178210b = description;
        this.f178211c = timeClause;
        this.d = s3Var;
        this.e = accentCircleBadge;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f178209a.equals(f0Var.f178209a) && this.f178210b.equals(f0Var.f178210b) && Intrinsics.f(this.f178211c, f0Var.f178211c) && Intrinsics.f(this.d, f0Var.d) && this.e.equals(f0Var.e) && Intrinsics.f(this.f, f0Var.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f178209a.hashCode() * 31, 31, this.f178210b);
        Clause clause = this.f178211c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        s3 s3Var = this.d;
        return this.f.hashCode() + ((this.e.f58049a.hashCode() + ((iHashCode + (s3Var != null ? s3Var.hashCode() : 0)) * 31)) * 31);
    }
}
