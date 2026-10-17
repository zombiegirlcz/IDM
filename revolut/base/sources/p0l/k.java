package p0l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f231558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f231559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f231560c;

    public k(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f231558a = navBarTitle;
        this.f231559b = navBarDescription;
        this.f231560c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f231560c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f231558a.equals(kVar.f231558a) && this.f231559b.equals(kVar.f231559b) && Intrinsics.f(this.f231560c, kVar.f231560c);
    }

    public final int hashCode() {
        return this.f231560c.hashCode() + t61.a.a(this.f231558a.hashCode() * 31, 31, this.f231559b);
    }
}
