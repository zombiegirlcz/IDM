package ft3;

import grl.r2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f137797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f137799c;
    public final y0 d;
    public final dj0.d e;

    public a1(r2 analyticsEntryPoint, String str, z0 z0Var, y0 y0Var, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsEntryPoint, "analyticsEntryPoint");
        this.f137797a = analyticsEntryPoint;
        this.f137798b = str;
        this.f137799c = z0Var;
        this.d = y0Var;
        this.e = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f137797a == a1Var.f137797a && Intrinsics.f(this.f137798b, a1Var.f137798b) && this.f137799c == a1Var.f137799c && Intrinsics.f(this.d, a1Var.d) && Intrinsics.f(this.e, a1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f137797a.hashCode() * 31;
        String str = this.f137798b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        z0 z0Var = this.f137799c;
        int iHashCode3 = (iHashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        y0 y0Var = this.d;
        int iHashCode4 = (iHashCode3 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        dj0.d dVar = this.e;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public /* synthetic */ a1(r2 r2Var, String str, z0 z0Var, y0 y0Var, dj0.d dVar, int i) {
        this(r2Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : z0Var, (i & 8) != 0 ? null : y0Var, (i & 16) != 0 ? null : dVar);
    }
}
