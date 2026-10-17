package l9k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f193274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f193275b;

    public h(CompositeClause compositeClause, TextLocalisedClause submitButtonClause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f193274a = submitButtonClause;
        this.f193275b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f193274a.equals(hVar.f193274a) && Intrinsics.f(this.f193275b, hVar.f193275b);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f193274a.hashCode() * 31, 31, true);
        Clause clause = this.f193275b;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
