package mk5;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f206194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f206195c;
    public final String d;

    public p(List items, Clause title, o selectedTab, String searchQuery) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f206193a = items;
        this.f206194b = title;
        this.f206195c = selectedTab;
        this.d = searchQuery;
    }

    @Override // cli.p
    public final List c() {
        return this.f206193a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f206193a, pVar.f206193a) && Intrinsics.f(this.f206194b, pVar.f206194b) && this.f206195c == pVar.f206195c && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f206195c.hashCode() + p.a.a(this.f206193a.hashCode() * 31, 31, this.f206194b)) * 31);
    }
}
