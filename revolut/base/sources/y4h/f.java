package y4h;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f310940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310941b;

    public f(TextLocalisedClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f310940a = navBarTitle;
        this.f310941b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f310941b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f310940a.equals(fVar.f310940a) && Intrinsics.f(this.f310941b, fVar.f310941b);
    }

    public final int hashCode() {
        return this.f310941b.hashCode() + (this.f310940a.hashCode() * 31);
    }
}
