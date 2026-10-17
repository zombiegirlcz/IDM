package vne;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f290801b;

    public g(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290800a = items;
        this.f290801b = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f290800a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f290800a, gVar.f290800a) && Intrinsics.f(this.f290801b, gVar.f290801b);
    }

    public final int hashCode() {
        int iHashCode = this.f290800a.hashCode() * 31;
        Clause clause = this.f290801b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
