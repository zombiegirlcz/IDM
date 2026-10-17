package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3 f273178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f273179c;
    public final dj0.d d;

    public y3(String operationNumber, w3 operationType, List list, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(operationNumber, "operationNumber");
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.f273177a = operationNumber;
        this.f273178b = operationType;
        this.f273179c = list;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f273177a, y3Var.f273177a) && Intrinsics.f(this.f273178b, y3Var.f273178b) && Intrinsics.f(this.f273179c, y3Var.f273179c) && Intrinsics.f(this.d, y3Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f273178b.hashCode() + (this.f273177a.hashCode() * 31)) * 31;
        List list = this.f273179c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        dj0.d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
