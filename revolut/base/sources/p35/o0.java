package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f232662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f232663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f232664c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f232665g;

    public o0(u0 type, p0 state, String repaymentSourceId, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(repaymentSourceId, "repaymentSourceId");
        this.f232662a = type;
        this.f232663b = state;
        this.f232664c = repaymentSourceId;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f232665g = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f232662a == o0Var.f232662a && this.f232663b == o0Var.f232663b && Intrinsics.f(this.f232664c, o0Var.f232664c) && Intrinsics.f(this.d, o0Var.d) && Intrinsics.f(this.e, o0Var.e) && Intrinsics.f(this.f, o0Var.f) && Intrinsics.f(this.f232665g, o0Var.f232665g);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f232663b.hashCode() + (this.f232662a.hashCode() * 31)) * 31, 31, this.f232664c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f232665g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
