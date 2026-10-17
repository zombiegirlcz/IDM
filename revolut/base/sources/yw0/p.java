package yw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends r {
    public final n14.e e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f317288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextLocalisedClause f317289h;
    public final TextLocalisedClause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f317290j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n14.e background, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryAction, TextLocalisedClause secondaryAction, HtmlLocalisedClause htmlLocalisedClause) {
        super(false, false, 5);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
        this.e = background;
        this.f = title;
        this.f317288g = textLocalisedClause;
        this.f317289h = primaryAction;
        this.i = secondaryAction;
        this.f317290j = htmlLocalisedClause;
    }

    @Override // yw0.r
    public final n14.e a() {
        return this.e;
    }

    @Override // yw0.r
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.e.equals(pVar.e) && this.f.equals(pVar.f) && Intrinsics.f(this.f317288g, pVar.f317288g) && this.f317289h.equals(pVar.f317289h) && this.i.equals(pVar.i) && Intrinsics.f(this.f317290j, pVar.f317290j);
    }

    public final int hashCode() {
        int iA = t61.a.a((this.e.hashCode() + (Boolean.hashCode(false) * 31)) * 31, 31, this.f);
        Clause clause = this.f317288g;
        int iA2 = t61.a.a(t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f317289h), 31, this.i);
        Clause clause2 = this.f317290j;
        return iA2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
