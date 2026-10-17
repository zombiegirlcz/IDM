package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173474c;
    public final String d;
    public final xi0.b e;

    public i0(String name, BigDecimal allocation, String str, String str2, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f173472a = name;
        this.f173473b = allocation;
        this.f173474c = str;
        this.d = str2;
        this.e = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f173472a, i0Var.f173472a) && Intrinsics.f(this.f173473b, i0Var.f173473b) && Intrinsics.f(this.f173474c, i0Var.f173474c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f173473b, this.f173472a.hashCode() * 31, 31);
        String str = this.f173474c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        xi0.b bVar = this.e;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
