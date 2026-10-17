package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6 f272889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f272890c;
    public final m6 d;

    public k6(String str, l6 promisedAmount, n6 n6Var, m6 m6Var) {
        Intrinsics.checkNotNullParameter(promisedAmount, "promisedAmount");
        this.f272888a = str;
        this.f272889b = promisedAmount;
        this.f272890c = n6Var;
        this.d = m6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj2;
        return Intrinsics.f(this.f272888a, k6Var.f272888a) && Intrinsics.f(this.f272889b, k6Var.f272889b) && Intrinsics.f(this.f272890c, k6Var.f272890c) && Intrinsics.f(this.d, k6Var.d);
    }

    public final int hashCode() {
        String str = this.f272888a;
        int iHashCode = (this.f272889b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        n6 n6Var = this.f272890c;
        int iHashCode2 = (iHashCode + (n6Var == null ? 0 : n6Var.hashCode())) * 31;
        m6 m6Var = this.d;
        return iHashCode2 + (m6Var != null ? m6Var.hashCode() : 0);
    }
}
