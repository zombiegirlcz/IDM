package y6b;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f311252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f311253b;

    public h(TextClause textClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311252a = textClause;
        this.f311253b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f311253b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f311252a, hVar.f311252a) && Intrinsics.f(this.f311253b, hVar.f311253b);
    }

    public final int hashCode() {
        Clause clause = this.f311252a;
        return this.f311253b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
