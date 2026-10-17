package lha;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f195220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f195221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f195222c;

    public n(m state, l lVar, w0 w0Var) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f195220a = state;
        this.f195221b = lVar;
        this.f195222c = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f195220a == nVar.f195220a && this.f195221b == nVar.f195221b && this.f195222c == nVar.f195222c;
    }

    public final int hashCode() {
        int iHashCode = this.f195220a.hashCode() * 31;
        l lVar = this.f195221b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        w0 w0Var = this.f195222c;
        return iHashCode2 + (w0Var != null ? w0Var.hashCode() : 0);
    }
}
