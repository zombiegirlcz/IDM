package ehg;

import cli.p;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f126189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f126190b;

    public g(CompositeClause description, List items) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f126189a = description;
        this.f126190b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f126190b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f126189a.equals(gVar.f126189a) && Intrinsics.f(this.f126190b, gVar.f126190b);
    }

    public final int hashCode() {
        return this.f126190b.hashCode() + (this.f126189a.hashCode() * 31);
    }
}
