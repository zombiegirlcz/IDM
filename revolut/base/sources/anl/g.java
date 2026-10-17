package anl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f7812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7814c;

    public g(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f7812a = title;
        this.f7813b = description;
        this.f7814c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f7814c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f7812a.equals(gVar.f7812a) && this.f7813b.equals(gVar.f7813b) && Intrinsics.f(this.f7814c, gVar.f7814c);
    }

    public final int hashCode() {
        return this.f7814c.hashCode() + t61.a.a(this.f7812a.hashCode() * 31, 31, this.f7813b);
    }
}
