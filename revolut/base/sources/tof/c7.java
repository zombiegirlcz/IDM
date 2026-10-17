package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c7 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f272668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f272669b;

    public c7(Double d, Double d5) {
        this.f272668a = d;
        this.f272669b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj2;
        return Intrinsics.f(this.f272668a, c7Var.f272668a) && Intrinsics.f(this.f272669b, c7Var.f272669b);
    }

    public final int hashCode() {
        Double d = this.f272668a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f272669b;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
