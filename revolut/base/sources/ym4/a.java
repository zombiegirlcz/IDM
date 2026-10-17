package ym4;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f314857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f314858c;
    public final z2 d;

    public a(String str, String str2, boolean z, z2 z2Var) {
        this.f314856a = str;
        this.f314857b = str2;
        this.f314858c = z;
        this.d = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f314856a, aVar.f314856a) && Intrinsics.f(this.f314857b, aVar.f314857b) && this.f314858c == aVar.f314858c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        String str = this.f314856a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f314857b;
        int iC = j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f314858c);
        z2 z2Var = this.d;
        return iC + (z2Var != null ? z2Var.hashCode() : 0);
    }
}
