package anf;

import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv0.i f7756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f7757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f7758c;

    public u(qv0.i iVar, dj0.d sum, Set hiddenSpareChangeLegIds) {
        Intrinsics.checkNotNullParameter(sum, "sum");
        Intrinsics.checkNotNullParameter(hiddenSpareChangeLegIds, "hiddenSpareChangeLegIds");
        this.f7756a = iVar;
        this.f7757b = sum;
        this.f7758c = hiddenSpareChangeLegIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f7756a, uVar.f7756a) && Intrinsics.f(this.f7757b, uVar.f7757b) && Intrinsics.f(this.f7758c, uVar.f7758c);
    }

    public final int hashCode() {
        qv0.i iVar = this.f7756a;
        return this.f7758c.hashCode() + v7.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f7757b);
    }
}
