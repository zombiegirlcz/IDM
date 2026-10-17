package ieg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f160730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f160731c;

    public q(List items, CompositeClause compositeClause, List filters) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f160729a = items;
        this.f160730b = compositeClause;
        this.f160731c = filters;
    }

    @Override // cli.p
    public final List c() {
        return this.f160729a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f160729a, qVar.f160729a) && Intrinsics.f(this.f160730b, qVar.f160730b) && Intrinsics.f(this.f160731c, qVar.f160731c);
    }

    public final int hashCode() {
        int iHashCode = this.f160729a.hashCode() * 31;
        Clause clause = this.f160730b;
        return this.f160731c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
