package k6a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f181661a;

    public m(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f181661a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f181661a.equals(((m) obj2).f181661a);
    }

    public final int hashCode() {
        return this.f181661a.hashCode();
    }
}
