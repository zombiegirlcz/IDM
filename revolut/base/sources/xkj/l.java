package xkj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f306830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f306831b;

    public l(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f306830a = title;
        this.f306831b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f306830a, lVar.f306830a) && Intrinsics.f(this.f306831b, lVar.f306831b);
    }

    public final int hashCode() {
        int iHashCode = this.f306830a.hashCode() * 31;
        Clause clause = this.f306831b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
