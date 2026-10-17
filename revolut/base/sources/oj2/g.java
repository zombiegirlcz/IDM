package oj2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f225717b;

    public g(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f225716a = items;
        this.f225717b = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f225716a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f225716a, gVar.f225716a) && Intrinsics.f(this.f225717b, gVar.f225717b);
    }

    public final int hashCode() {
        int iHashCode = this.f225716a.hashCode() * 31;
        Clause clause = this.f225717b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
