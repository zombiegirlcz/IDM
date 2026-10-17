package gpb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f145417a;

    public i(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f145417a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f145417a.equals(((i) obj2).f145417a);
    }

    public final int hashCode() {
        return this.f145417a.hashCode();
    }
}
