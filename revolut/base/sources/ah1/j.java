package ah1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f4861c;

    public j(Clause clause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4859a = items;
        this.f4860b = z;
        this.f4861c = clause;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        j jVar = oldState instanceof j ? (j) oldState : null;
        if (jVar == null) {
            return null;
        }
        return new i(this.f4860b != jVar.f4860b, !Intrinsics.f(this.f4861c, jVar.f4861c));
    }

    @Override // cli.p
    public final List c() {
        return this.f4859a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f4859a, jVar.f4859a) && this.f4860b == jVar.f4860b && Intrinsics.f(this.f4861c, jVar.f4861c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f4859a.hashCode() * 31, 31, this.f4860b);
        Clause clause = this.f4861c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
