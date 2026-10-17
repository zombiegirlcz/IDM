package jel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f173553c;

    public r(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f173551a = arrayList;
        this.f173552b = arrayList2;
        this.f173553c = arrayList3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f173551a, rVar.f173551a) && Intrinsics.f(this.f173552b, rVar.f173552b) && Intrinsics.f(this.f173553c, rVar.f173553c);
    }

    public final int hashCode() {
        List list = this.f173551a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f173552b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f173553c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
