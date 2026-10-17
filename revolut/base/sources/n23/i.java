package n23;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f211437b;

    public i(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f211436a = items;
        this.f211437b = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f211436a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f211436a, iVar.f211436a) && Intrinsics.f(this.f211437b, iVar.f211437b);
    }

    public final int hashCode() {
        int iHashCode = this.f211436a.hashCode() * 31;
        Clause clause = this.f211437b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
