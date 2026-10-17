package jel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f173432c;
    public final List d;

    public d0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f173430a = arrayList;
        this.f173431b = arrayList2;
        this.f173432c = arrayList3;
        this.d = arrayList4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f173430a, d0Var.f173430a) && Intrinsics.f(this.f173431b, d0Var.f173431b) && Intrinsics.f(this.f173432c, d0Var.f173432c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        List list = this.f173430a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f173431b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f173432c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }
}
