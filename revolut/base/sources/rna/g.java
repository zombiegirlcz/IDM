package rna;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f255538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255539b;

    public g(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255538a = title;
        this.f255539b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f255539b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f255538a.equals(gVar.f255538a) && this.f255539b.equals(gVar.f255539b);
    }

    public final int hashCode() {
        return this.f255539b.hashCode() + (this.f255538a.hashCode() * 31);
    }
}
