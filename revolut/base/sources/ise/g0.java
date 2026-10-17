package ise;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f168196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f168197c;

    public g0(String str, List list, List list2) {
        this.f168195a = str;
        this.f168196b = list;
        this.f168197c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f168195a, g0Var.f168195a) && Intrinsics.f(this.f168196b, g0Var.f168196b) && Intrinsics.f(this.f168197c, g0Var.f168197c);
    }

    public final int hashCode() {
        String str = this.f168195a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f168196b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f168197c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
