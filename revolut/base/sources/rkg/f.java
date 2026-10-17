package rkg;

import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f254861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f254862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f254863c;

    public f(i iVar, dj0.d sum, Set hiddenSpareChangeLegIds) {
        Intrinsics.checkNotNullParameter(sum, "sum");
        Intrinsics.checkNotNullParameter(hiddenSpareChangeLegIds, "hiddenSpareChangeLegIds");
        this.f254861a = iVar;
        this.f254862b = sum;
        this.f254863c = hiddenSpareChangeLegIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f254861a, fVar.f254861a) && Intrinsics.f(this.f254862b, fVar.f254862b) && Intrinsics.f(this.f254863c, fVar.f254863c);
    }

    public final int hashCode() {
        i iVar = this.f254861a;
        return this.f254863c.hashCode() + v7.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f254862b);
    }
}
