package ldc;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f194063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f194064c;

    public g(Clause clause, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f194062a = items;
        this.f194063b = title;
        this.f194064c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f194062a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f194062a, gVar.f194062a) && this.f194063b.equals(gVar.f194063b) && Intrinsics.f(this.f194064c, gVar.f194064c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f194062a.hashCode() * 31, 31, this.f194063b);
        Clause clause = this.f194064c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
