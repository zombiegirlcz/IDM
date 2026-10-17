package z9j;

import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f320509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HtmlLocalisedClause f320510b;

    public g(TextLocalisedClause title, HtmlLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f320509a = title;
        this.f320510b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f320509a.equals(gVar.f320509a) && this.f320510b.equals(gVar.f320510b);
    }

    public final int hashCode() {
        return this.f320510b.hashCode() + (this.f320509a.hashCode() * 31);
    }
}
