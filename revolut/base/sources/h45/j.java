package h45;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f149318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f149319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f149320c;
    public final boolean d;
    public final List e;

    public j(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause button, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f149318a = title;
        this.f149319b = textLocalisedClause;
        this.f149320c = button;
        this.d = z;
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
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f149318a.equals(jVar.f149318a) && Intrinsics.f(this.f149319b, jVar.f149319b) && this.f149320c.equals(jVar.f149320c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f149318a.hashCode() * 31;
        Clause clause = this.f149319b;
        return this.e.hashCode() + j6.a.c(t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f149320c), 31, this.d);
    }
}
