package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class tc implements uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210024a;

    public tc(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f210024a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof tc) && Intrinsics.f(this.f210024a, ((tc) obj2).f210024a);
    }

    public final int hashCode() {
        return this.f210024a.hashCode();
    }
}
