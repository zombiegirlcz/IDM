package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f215701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215702b;

    public a3(String str, Double d) {
        this.f215701a = d;
        this.f215702b = str;
    }

    public final String a() {
        return this.f215702b;
    }

    public final Double b() {
        return this.f215701a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f215701a, a3Var.f215701a) && Intrinsics.f(this.f215702b, a3Var.f215702b);
    }

    public final int hashCode() {
        Double d = this.f215701a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f215702b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
