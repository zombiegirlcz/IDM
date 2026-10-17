package sec;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f262171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f262172c;

    public g(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f262170a = items;
        this.f262171b = z;
        this.f262172c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f262170a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f262170a, gVar.f262170a) && this.f262171b == gVar.f262171b && Intrinsics.f(this.f262172c, gVar.f262172c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f262170a.hashCode() * 31, 31, this.f262171b);
        Clause clause = this.f262172c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
