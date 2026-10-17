package j45;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f171297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f171298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f171299c;
    public final boolean d;
    public final List e;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171297a = title;
        this.f171298b = textLocalisedClause;
        this.f171299c = z;
        this.d = z3;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f171297a.equals(gVar.f171297a) && Intrinsics.f(this.f171298b, gVar.f171298b) && this.f171299c == gVar.f171299c && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f171297a.hashCode() * 31;
        Clause clause = this.f171298b;
        return this.e.hashCode() + j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f171299c), 31, this.d);
    }
}
