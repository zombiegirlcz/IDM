package yq1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f315972b;

    public g(aim.e items, TextLocalisedClause nextButtonClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButtonClause, "nextButtonClause");
        this.f315971a = items;
        this.f315972b = nextButtonClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f315971a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f315971a, gVar.f315971a) && this.f315972b.equals(gVar.f315972b);
    }

    public final int hashCode() {
        return this.f315972b.hashCode() + (this.f315971a.hashCode() * 31);
    }
}
