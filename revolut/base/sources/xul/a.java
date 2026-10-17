package xul;

import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f309109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f309110b;

    public a(bfl.g tradeSide, r0 r0Var) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        this.f309109a = tradeSide;
        this.f309110b = r0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f309109a == aVar.f309109a && this.f309110b == aVar.f309110b;
    }

    public final int hashCode() {
        int iHashCode = this.f309109a.hashCode() * 31;
        r0 r0Var = this.f309110b;
        return iHashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }
}
