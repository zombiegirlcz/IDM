package blj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f16716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f16717b;

    public m(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f16716a = title;
        this.f16717b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f16716a, mVar.f16716a) && Intrinsics.f(this.f16717b, mVar.f16717b);
    }

    public final int hashCode() {
        int iHashCode = this.f16716a.hashCode() * 31;
        Clause clause = this.f16717b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
