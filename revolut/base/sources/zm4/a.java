package zm4;

import dx4.t1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f323379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f323380b;

    public a(ArrayList items, t1 t1Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323379a = items;
        this.f323380b = t1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f323379a.equals(aVar.f323379a) && Intrinsics.f(this.f323380b, aVar.f323380b);
    }

    public final int hashCode() {
        int iHashCode = this.f323379a.hashCode() * 31;
        t1 t1Var = this.f323380b;
        return iHashCode + (t1Var == null ? 0 : t1Var.hashCode());
    }
}
