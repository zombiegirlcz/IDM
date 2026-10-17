package jel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173598b;

    public x(ArrayList arrayList, ArrayList arrayList2) {
        this.f173597a = arrayList;
        this.f173598b = arrayList2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f173597a, xVar.f173597a) && Intrinsics.f(this.f173598b, xVar.f173598b);
    }

    public final int hashCode() {
        List list = this.f173597a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f173598b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
