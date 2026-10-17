package kae;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f182475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f182476c;
    public final TextLocalisedClause d;
    public final Clause e;

    public g(TextLocalisedClause titleClause, TextLocalisedClause buttonText, TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f182474a = items;
        this.f182475b = titleClause;
        this.f182476c = z;
        this.d = buttonText;
        this.e = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f182474a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f182474a, gVar.f182474a) && this.f182475b.equals(gVar.f182475b) && this.f182476c == gVar.f182476c && this.d.equals(gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.c(t61.a.a(this.f182474a.hashCode() * 31, 31, this.f182475b), 31, this.f182476c), 31, this.d);
        Clause clause = this.e;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
