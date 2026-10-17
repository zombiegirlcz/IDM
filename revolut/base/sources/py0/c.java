package py0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f240642a;

    public c(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f240642a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f240642a, ((c) obj2).f240642a);
    }

    public final int hashCode() {
        return this.f240642a.hashCode();
    }
}
