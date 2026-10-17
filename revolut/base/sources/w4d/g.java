package w4d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f294547a;

    public g(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f294547a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f294547a.equals(((g) obj2).f294547a);
    }

    public final int hashCode() {
        return this.f294547a.hashCode();
    }
}
