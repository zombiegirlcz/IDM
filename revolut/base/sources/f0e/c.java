package f0e;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f131107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131108b;

    public c(TextClause textClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f131107a = textClause;
        this.f131108b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f131108b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f131107a, cVar.f131107a) && Intrinsics.f(this.f131108b, cVar.f131108b);
    }

    public final int hashCode() {
        Clause clause = this.f131107a;
        return this.f131108b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
