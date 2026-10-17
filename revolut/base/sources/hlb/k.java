package hlb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f153432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f153433b;

    public k(TextClause title, HtmlClause htmlClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f153432a = title;
        this.f153433b = htmlClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f153432a.equals(kVar.f153432a) && Intrinsics.f(this.f153433b, kVar.f153433b);
    }

    public final int hashCode() {
        int iHashCode = this.f153432a.hashCode() * 31;
        Clause clause = this.f153433b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
