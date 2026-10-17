package pi3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f236415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f236416c;

    public p(String planId, hha.i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f236414a = planId;
        this.f236415b = iVar;
        this.f236416c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f236414a, pVar.f236414a) && this.f236415b == pVar.f236415b && this.f236416c == pVar.f236416c;
    }

    public final int hashCode() {
        int iHashCode = this.f236414a.hashCode() * 31;
        hha.i iVar = this.f236415b;
        return Boolean.hashCode(this.f236416c) + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
