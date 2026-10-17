package cbh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f22830a;

    public n(TextLocalisedClause titleClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f22830a = titleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f22830a.equals(((n) obj2).f22830a);
    }

    public final int hashCode() {
        return this.f22830a.hashCode();
    }
}
