package lha;

import hha.w0;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f195211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.o f195212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.i f195213c;
    public final w0 d;

    public i(Period period, hha.o oVar, hha.i iVar, w0 w0Var) {
        this.f195211a = period;
        this.f195212b = oVar;
        this.f195213c = iVar;
        this.d = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f195211a, iVar.f195211a) && Intrinsics.f(this.f195212b, iVar.f195212b) && this.f195213c == iVar.f195213c && this.d == iVar.d;
    }

    public final int hashCode() {
        Period period = this.f195211a;
        int iHashCode = (period == null ? 0 : period.hashCode()) * 31;
        hha.o oVar = this.f195212b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        hha.i iVar = this.f195213c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        w0 w0Var = this.d;
        return iHashCode3 + (w0Var != null ? w0Var.hashCode() : 0);
    }
}
