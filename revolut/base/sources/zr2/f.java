package zr2;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f324535b;

    public f(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f324534a = items;
        this.f324535b = clause;
    }

    @Override // jki.n
    public final List c() {
        return this.f324534a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f324534a, fVar.f324534a) && Intrinsics.f(this.f324535b, fVar.f324535b);
    }

    public final int hashCode() {
        int iHashCode = this.f324534a.hashCode() * 31;
        Clause clause = this.f324535b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
