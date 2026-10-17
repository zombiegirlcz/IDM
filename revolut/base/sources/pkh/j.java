package pkh;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f237190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f237191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f237192c;

    public j(Clause clause, Clause clause2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237190a = clause;
        this.f237191b = clause2;
        this.f237192c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f237192c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f237190a, jVar.f237190a) && Intrinsics.f(this.f237191b, jVar.f237191b) && Intrinsics.f(this.f237192c, jVar.f237192c);
    }

    public final int hashCode() {
        Clause clause = this.f237190a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f237191b;
        return this.f237192c.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
