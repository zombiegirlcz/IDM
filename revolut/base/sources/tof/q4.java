package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273010c;

    public q4(String id10, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273008a = id10;
        this.f273009b = str;
        this.f273010c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return Intrinsics.f(this.f273008a, q4Var.f273008a) && Intrinsics.f(this.f273009b, q4Var.f273009b) && Intrinsics.f(this.f273010c, q4Var.f273010c);
    }

    public final int hashCode() {
        int iHashCode = this.f273008a.hashCode() * 31;
        String str = this.f273009b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273010c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
