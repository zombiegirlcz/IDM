package ya5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f311936a;

    public h(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f311936a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f311936a.equals(((h) obj2).f311936a);
    }

    public final int hashCode() {
        return this.f311936a.hashCode();
    }
}
