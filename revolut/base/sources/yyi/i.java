package yyi;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f317944b;

    public i(TextClause textClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317943a = items;
        this.f317944b = textClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f317943a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f317943a, iVar.f317943a) && Intrinsics.f(this.f317944b, iVar.f317944b);
    }

    public final int hashCode() {
        int iHashCode = this.f317943a.hashCode() * 31;
        Clause clause = this.f317944b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
