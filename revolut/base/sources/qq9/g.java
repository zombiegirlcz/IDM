package qq9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248518b;

    public g(ArrayList arrayList, List splits) {
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f248517a = splits;
        this.f248518b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f248517a, gVar.f248517a) && Intrinsics.f(this.f248518b, gVar.f248518b);
    }

    public final int hashCode() {
        int iHashCode = this.f248517a.hashCode() * 31;
        List list = this.f248518b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
