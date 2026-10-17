package xvf;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f309251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f309252b;

    public g(Clause buttonClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        this.f309251a = items;
        this.f309252b = buttonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f309251a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f309251a.equals(gVar.f309251a) && Intrinsics.f(this.f309252b, gVar.f309252b);
    }

    public final int hashCode() {
        return this.f309252b.hashCode() + (this.f309251a.hashCode() * 31);
    }
}
