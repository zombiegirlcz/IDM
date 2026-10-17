package tof;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273021c;
    public final Map d;

    public r1(String currency, String bankCountry, String str, Map map) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        this.f273019a = currency;
        this.f273020b = bankCountry;
        this.f273021c = str;
        this.d = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f273019a, r1Var.f273019a) && Intrinsics.f(this.f273020b, r1Var.f273020b) && Intrinsics.f(this.f273021c, r1Var.f273021c) && Intrinsics.f(this.d, r1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f273019a.hashCode() * 31, 31, this.f273020b);
        String str = this.f273021c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.d;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
