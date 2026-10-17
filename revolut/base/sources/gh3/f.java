package gh3;

import com.revolut.core.ui_kit.models.HtmlClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlClause f143838a;

    public f(HtmlClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143838a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f143838a.equals(((f) obj2).f143838a);
    }

    public final int hashCode() {
        return this.f143838a.hashCode();
    }
}
