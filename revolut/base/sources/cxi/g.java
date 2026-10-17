package cxi;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f109992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f109993b;

    public g(TextLocalisedClause titleClause, List items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109992a = titleClause;
        this.f109993b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f109993b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f109992a.equals(gVar.f109992a) && Intrinsics.f(this.f109993b, gVar.f109993b);
    }

    public final int hashCode() {
        return this.f109993b.hashCode() + (this.f109992a.hashCode() * 31);
    }
}
