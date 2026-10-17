package pig;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f236493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f236494c;

    public p(CompositeClause compositeClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f236492a = items;
        this.f236493b = compositeClause;
        this.f236494c = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof p) {
            return new n(!Intrinsics.f(((p) oldState).f236493b, this.f236493b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f236492a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f236492a, pVar.f236492a) && Intrinsics.f(this.f236493b, pVar.f236493b) && this.f236494c == pVar.f236494c;
    }

    public final int hashCode() {
        int iHashCode = this.f236492a.hashCode() * 31;
        Clause clause = this.f236493b;
        return Boolean.hashCode(this.f236494c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
