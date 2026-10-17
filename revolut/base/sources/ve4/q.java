package ve4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f288125a;

    public q(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f288125a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f288125a.equals(((q) obj2).f288125a);
    }

    public final int hashCode() {
        return this.f288125a.hashCode();
    }
}
