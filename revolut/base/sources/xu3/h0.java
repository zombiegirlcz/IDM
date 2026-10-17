package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f308904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f308905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f308906c;

    public h0(boolean z, f0 detailsPopup, g0 g0Var) {
        Intrinsics.checkNotNullParameter(detailsPopup, "detailsPopup");
        this.f308904a = z;
        this.f308905b = detailsPopup;
        this.f308906c = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f308904a == h0Var.f308904a && Intrinsics.f(this.f308905b, h0Var.f308905b) && Intrinsics.f(this.f308906c, h0Var.f308906c);
    }

    public final int hashCode() {
        int iHashCode = (this.f308905b.hashCode() + (Boolean.hashCode(this.f308904a) * 31)) * 31;
        g0 g0Var = this.f308906c;
        return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
    }
}
