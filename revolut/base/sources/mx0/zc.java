package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class zc implements cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210151a;

    public zc(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f210151a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof zc) && Intrinsics.f(this.f210151a, ((zc) obj2).f210151a);
    }

    public final int hashCode() {
        return this.f210151a.hashCode();
    }
}
