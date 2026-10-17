package sl2;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f264089a;

    public k(TextClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f264089a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f264089a.equals(((k) obj2).f264089a);
    }

    public final int hashCode() {
        return this.f264089a.hashCode();
    }
}
