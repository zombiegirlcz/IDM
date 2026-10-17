package ybh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f312363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f312364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f312365c;
    public final boolean d;
    public final Data e;
    public final boolean f;

    public x(Boolean bool, Boolean bool2, boolean z, boolean z3, Data data, boolean z4) {
        this.f312363a = bool;
        this.f312364b = bool2;
        this.f312365c = z;
        this.d = z3;
        this.e = data;
        this.f = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f312363a, xVar.f312363a) && Intrinsics.f(this.f312364b, xVar.f312364b) && this.f312365c == xVar.f312365c && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && this.f == xVar.f;
    }

    public final int hashCode() {
        Boolean bool = this.f312363a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f312364b;
        int iC = j6.a.c(j6.a.c((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f312365c), 31, this.d);
        Data data = this.e;
        return Boolean.hashCode(this.f) + ((iC + (data != null ? data.hashCode() : 0)) * 31);
    }
}
