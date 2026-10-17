package r7j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f252267a;

    public g(TextLocalisedClause textClause) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f252267a = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f252267a.equals(((g) obj2).f252267a);
    }

    public final int hashCode() {
        return this.f252267a.hashCode();
    }
}
