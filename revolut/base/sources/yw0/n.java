package yw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends r {
    public final n14.e e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f317284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f317285h;
    public final TextLocalisedClause i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(n14.e background, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, e eVar, TextLocalisedClause primaryAction) {
        super(true, false, 12);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        this.e = background;
        this.f = title;
        this.f317284g = textLocalisedClause;
        this.f317285h = eVar;
        this.i = primaryAction;
    }

    @Override // yw0.r
    public final n14.e a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.e.equals(nVar.e) && this.f.equals(nVar.f) && Intrinsics.f(this.f317284g, nVar.f317284g) && Intrinsics.f(this.f317285h, nVar.f317285h) && this.i.equals(nVar.i);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.e.hashCode() * 31, 31, this.f);
        Clause clause = this.f317284g;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        e eVar = this.f317285h;
        return this.i.hashCode() + ((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }
}
