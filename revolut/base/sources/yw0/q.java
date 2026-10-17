package yw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends r {
    public final n14.e e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f317291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f317292h;
    public final TextLocalisedClause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextLocalisedClause f317293j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n14.e background, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, e eVar, TextLocalisedClause primaryAction, TextLocalisedClause secondaryAction) {
        super(false, false, 11);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
        this.e = background;
        this.f = title;
        this.f317291g = textLocalisedClause;
        this.f317292h = eVar;
        this.i = primaryAction;
        this.f317293j = secondaryAction;
    }

    @Override // yw0.r
    public final n14.e a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.e.equals(qVar.e) && this.f.equals(qVar.f) && Intrinsics.f(this.f317291g, qVar.f317291g) && Intrinsics.f(this.f317292h, qVar.f317292h) && this.i.equals(qVar.i) && this.f317293j.equals(qVar.f317293j);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.e.hashCode() * 31, 31, this.f);
        Clause clause = this.f317291g;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        e eVar = this.f317292h;
        return this.f317293j.hashCode() + t61.a.a((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.i);
    }
}
