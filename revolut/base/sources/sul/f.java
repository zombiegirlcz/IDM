package sul;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f265796a;

    public f(TextLocalisedClause textClause) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f265796a = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f265796a.equals(((f) obj2).f265796a);
    }

    public final int hashCode() {
        return this.f265796a.hashCode();
    }
}
