package xu6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f308966a;

    public g(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f308966a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f308966a.equals(((g) obj2).f308966a);
    }

    public final int hashCode() {
        return this.f308966a.hashCode();
    }
}
