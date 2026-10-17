package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f273044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273045b;

    public s4(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f273044a = j2;
        this.f273045b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return this.f273044a == s4Var.f273044a && Intrinsics.f(this.f273045b, s4Var.f273045b);
    }

    public final int hashCode() {
        return this.f273045b.hashCode() + (Long.hashCode(this.f273044a) * 31);
    }
}
