package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.p f272783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4 f272784b;

    public h4(kq2.p pVar, i4 i4Var) {
        this.f272783a = pVar;
        this.f272784b = i4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.f272783a, h4Var.f272783a) && Intrinsics.f(this.f272784b, h4Var.f272784b);
    }

    public final int hashCode() {
        kq2.p pVar = this.f272783a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        i4 i4Var = this.f272784b;
        return iHashCode + (i4Var != null ? i4Var.hashCode() : 0);
    }
}
