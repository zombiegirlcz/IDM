package q48;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f242075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f242076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f242077c;
    public final Clause d;
    public final List e;

    public h(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryActionLabel, TextLocalisedClause textLocalisedClause, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242075a = title;
        this.f242076b = description;
        this.f242077c = primaryActionLabel;
        this.d = textLocalisedClause;
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
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f242075a.equals(hVar.f242075a) && this.f242076b.equals(hVar.f242076b) && this.f242077c.equals(hVar.f242077c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(this.f242075a.hashCode() * 31, 31, this.f242076b), 31, this.f242077c);
        Clause clause = this.d;
        return this.e.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
