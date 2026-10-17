package plj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f237419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f237420b;

    public f(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f237419a = title;
        this.f237420b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f237419a, fVar.f237419a) && Intrinsics.f(this.f237420b, fVar.f237420b);
    }

    public final int hashCode() {
        int iHashCode = this.f237419a.hashCode() * 31;
        Clause clause = this.f237420b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
