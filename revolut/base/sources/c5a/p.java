package c5a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f21519a;

    public p(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f21519a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f21519a.equals(((p) obj2).f21519a);
    }

    public final int hashCode() {
        return this.f21519a.hashCode();
    }
}
