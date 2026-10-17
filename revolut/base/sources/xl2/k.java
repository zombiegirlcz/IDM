package xl2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306919b;

    public k(ArrayList arrayList, boolean z) {
        this.f306918a = z;
        this.f306919b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f306918a == kVar.f306918a && Intrinsics.f(this.f306919b, kVar.f306919b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f306918a) * 31;
        List list = this.f306919b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
