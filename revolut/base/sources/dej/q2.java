package dej;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f113629b;

    public q2(ArrayList arrayList, k3 k3Var) {
        this.f113628a = arrayList;
        this.f113629b = k3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f113628a, q2Var.f113628a) && Intrinsics.f(this.f113629b, q2Var.f113629b);
    }

    public final int hashCode() {
        List list = this.f113628a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        k3 k3Var = this.f113629b;
        return iHashCode + (k3Var != null ? k3Var.hashCode() : 0);
    }
}
