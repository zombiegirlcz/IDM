package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.l f273144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.i f273145c;

    public w5(String id10, io3.l type, io3.i iVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f273143a = id10;
        this.f273144b = type;
        this.f273145c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj2;
        return Intrinsics.f(this.f273143a, w5Var.f273143a) && this.f273144b == w5Var.f273144b && this.f273145c == w5Var.f273145c;
    }

    public final int hashCode() {
        int iC = t61.a.c(this.f273144b, this.f273143a.hashCode() * 31, 31);
        io3.i iVar = this.f273145c;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
