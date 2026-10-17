package ko5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f186230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186231b;

    public i(dj0.d total, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f186230a = total;
        this.f186231b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f186230a, iVar.f186230a) && Intrinsics.f(this.f186231b, iVar.f186231b);
    }

    public final int hashCode() {
        int iHashCode = this.f186230a.hashCode() * 31;
        List list = this.f186231b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
