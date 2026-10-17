package bih;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final koi.h f15501c;

    public i(int i, int i2, z4l.j listAdapter) {
        Intrinsics.checkNotNullParameter(listAdapter, "listAdapter");
        this.f15499a = i;
        this.f15500b = i2;
        this.f15501c = listAdapter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f15499a == iVar.f15499a && this.f15500b == iVar.f15500b && Intrinsics.f(this.f15501c, iVar.f15501c);
    }

    public final int hashCode() {
        return this.f15501c.hashCode() + j6.a.b(this.f15500b, Integer.hashCode(this.f15499a) * 31, 31);
    }
}
