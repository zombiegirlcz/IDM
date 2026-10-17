package q75;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f242749a;

    public h(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f242749a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f242749a.equals(((h) obj2).f242749a);
    }

    public final int hashCode() {
        return this.f242749a.hashCode();
    }
}
