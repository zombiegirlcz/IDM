package gzd;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f148057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f148058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148059c;
    public final TextLocalisedClause d;

    public g(ArrayList items, Clause selectButtonClause, boolean z, TextLocalisedClause navBarButtonClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectButtonClause, "selectButtonClause");
        Intrinsics.checkNotNullParameter(navBarButtonClause, "navBarButtonClause");
        this.f148057a = items;
        this.f148058b = selectButtonClause;
        this.f148059c = z;
        this.d = navBarButtonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f148057a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f148057a.equals(gVar.f148057a) && this.f148058b.equals(gVar.f148058b) && this.f148059c == gVar.f148059c && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.b(this.f148057a.hashCode() * 31, 31, this.f148058b), 31, this.f148059c);
    }
}
