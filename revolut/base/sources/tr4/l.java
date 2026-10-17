package tr4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f273737a;

    public l(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f273737a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f273737a.equals(((l) obj2).f273737a);
    }

    public final int hashCode() {
        return this.f273737a.hashCode();
    }
}
