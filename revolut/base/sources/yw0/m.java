package yw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends r {
    public final n14.e e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f317282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextLocalisedClause f317283h;
    public final TextLocalisedClause i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n14.e background, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryAction, TextLocalisedClause secondaryAction) {
        super(false, false, 12);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
        this.e = background;
        this.f = title;
        this.f317282g = textLocalisedClause;
        this.f317283h = primaryAction;
        this.i = secondaryAction;
    }

    @Override // yw0.r
    public final n14.e a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.e.equals(mVar.e) && this.f.equals(mVar.f) && Intrinsics.f(this.f317282g, mVar.f317282g) && this.f317283h.equals(mVar.f317283h) && this.i.equals(mVar.i);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.e.hashCode() * 31, 31, this.f);
        Clause clause = this.f317282g;
        return this.i.hashCode() + t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f317283h);
    }
}
