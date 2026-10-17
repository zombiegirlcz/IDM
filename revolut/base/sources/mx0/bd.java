package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class bd implements cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f209619a;

    public bd(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f209619a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bd) && Intrinsics.f(this.f209619a, ((bd) obj2).f209619a);
    }

    public final int hashCode() {
        return this.f209619a.hashCode();
    }
}
