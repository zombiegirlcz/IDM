package gna;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f144944b;

    public g(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f144943a = items;
        this.f144944b = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f144943a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f144943a, gVar.f144943a) && Intrinsics.f(this.f144944b, gVar.f144944b);
    }

    public final int hashCode() {
        int iHashCode = this.f144943a.hashCode() * 31;
        Clause clause = this.f144944b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
