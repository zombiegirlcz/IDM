package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f272747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f272748c;
    public final int d;
    public final dj0.d e;
    public final c1 f;

    public f4(String id10, Double d, Double d5, int i, dj0.d dVar, c1 source) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f272746a = id10;
        this.f272747b = d;
        this.f272748c = d5;
        this.d = i;
        this.e = dVar;
        this.f = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.f272746a, f4Var.f272746a) && Intrinsics.f(this.f272747b, f4Var.f272747b) && Intrinsics.f(this.f272748c, f4Var.f272748c) && this.d == f4Var.d && Intrinsics.f(this.e, f4Var.e) && this.f == f4Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.f272746a.hashCode() * 31;
        Double d = this.f272747b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f272748c;
        int iB = j6.a.b(this.d, (iHashCode2 + (d5 == null ? 0 : d5.hashCode())) * 31, 31);
        dj0.d dVar = this.e;
        return this.f.hashCode() + ((iB + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }
}
