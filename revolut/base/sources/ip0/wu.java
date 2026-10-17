package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wu implements uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167063a;

    public wu(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f167063a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wu) && this.f167063a.equals(((wu) obj2).f167063a);
    }

    public final int hashCode() {
        return this.f167063a.hashCode();
    }
}
