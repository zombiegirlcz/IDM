package wyd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f301268a;

    public y(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f301268a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f301268a.equals(((y) obj2).f301268a);
    }

    public final int hashCode() {
        return this.f301268a.hashCode();
    }
}
