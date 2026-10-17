package qu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f249207a;

    public g(ArrayList debts) {
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f249207a = debts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f249207a.equals(((g) obj2).f249207a);
    }

    public final int hashCode() {
        return this.f249207a.hashCode();
    }
}
