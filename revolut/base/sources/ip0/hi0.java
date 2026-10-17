package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f164564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164566c;

    public hi0(Clause smallTitle, Clause bigTitle, Clause clause) {
        Intrinsics.checkNotNullParameter(smallTitle, "smallTitle");
        Intrinsics.checkNotNullParameter(bigTitle, "bigTitle");
        this.f164564a = smallTitle;
        this.f164565b = bigTitle;
        this.f164566c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj2;
        return this.f164564a.equals(hi0Var.f164564a) && this.f164565b.equals(hi0Var.f164565b) && Intrinsics.f(this.f164566c, hi0Var.f164566c);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f164564a.hashCode() * 31, 31, this.f164565b);
        Clause clause = this.f164566c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
