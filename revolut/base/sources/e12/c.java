package e12;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f121849a;

    public c(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f121849a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f121849a.equals(((c) obj2).f121849a);
    }

    public final int hashCode() {
        return this.f121849a.hashCode();
    }
}
