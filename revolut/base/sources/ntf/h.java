package ntf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f219023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f219024b;

    public h(TextClause textClause, CompositeClause description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f219023a = textClause;
        this.f219024b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f219023a, hVar.f219023a) && this.f219024b.equals(hVar.f219024b);
    }

    public final int hashCode() {
        Clause clause = this.f219023a;
        return this.f219024b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
