package g42;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f140324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f140325c;
    public final boolean d;

    public b(Clause clause, Clause clause2, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140323a = items;
        this.f140324b = clause;
        this.f140325c = clause2;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f140323a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f140323a, bVar.f140323a) && Intrinsics.f(this.f140324b, bVar.f140324b) && Intrinsics.f(this.f140325c, bVar.f140325c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f140323a.hashCode() * 31;
        Clause clause = this.f140324b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f140325c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
