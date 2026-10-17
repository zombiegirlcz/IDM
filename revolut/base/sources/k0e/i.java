package k0e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f180030a;

    public i(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f180030a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f180030a.equals(((i) obj2).f180030a);
    }

    public final int hashCode() {
        return this.f180030a.hashCode();
    }
}
