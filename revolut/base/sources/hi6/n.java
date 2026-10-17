package hi6;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f152523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f152524b;

    public n(Clause clause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152523a = items;
        this.f152524b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f152523a.equals(nVar.f152523a) && Intrinsics.f(this.f152524b, nVar.f152524b);
    }

    public final int hashCode() {
        int iHashCode = this.f152523a.hashCode() * 31;
        Clause clause = this.f152524b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
