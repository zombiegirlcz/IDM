package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class rc implements uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f209979a;

    public rc(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f209979a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof rc) && Intrinsics.f(this.f209979a, ((rc) obj2).f209979a);
    }

    public final int hashCode() {
        return this.f209979a.hashCode();
    }
}
