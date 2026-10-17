package y5g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f311076a;

    public a(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f311076a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f311076a.equals(((a) obj2).f311076a);
    }

    public final int hashCode() {
        return this.f311076a.hashCode();
    }
}
