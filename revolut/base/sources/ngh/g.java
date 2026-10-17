package ngh;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f215167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f215168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f215169c;

    public g(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f215167a = title;
        this.f215168b = description;
        this.f215169c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f215169c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f215167a.equals(gVar.f215167a) && this.f215168b.equals(gVar.f215168b) && Intrinsics.f(this.f215169c, gVar.f215169c);
    }

    public final int hashCode() {
        return this.f215169c.hashCode() + t61.a.a(this.f215167a.hashCode() * 31, 31, this.f215168b);
    }
}
