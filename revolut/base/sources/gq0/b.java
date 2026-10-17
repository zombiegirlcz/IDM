package gq0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f145491a;

    public b(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f145491a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f145491a, ((b) obj2).f145491a);
    }

    public final int hashCode() {
        return this.f145491a.hashCode();
    }
}
