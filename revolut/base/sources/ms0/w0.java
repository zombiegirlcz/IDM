package ms0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f208472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f208473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f208474c;

    public w0(Color.Solid color, v0 v0Var, v0 v0Var2) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f208472a = color;
        this.f208473b = v0Var;
        this.f208474c = v0Var2;
    }

    @Override // ms0.z0
    public final v0 a() {
        return this.f208473b;
    }

    @Override // ms0.z0
    public final v0 b() {
        return this.f208474c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f208472a.equals(w0Var.f208472a) && Intrinsics.f(this.f208473b, w0Var.f208473b) && Intrinsics.f(this.f208474c, w0Var.f208474c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f208472a.f51464b) * 31;
        v0 v0Var = this.f208473b;
        int iHashCode2 = (iHashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        v0 v0Var2 = this.f208474c;
        return iHashCode2 + (v0Var2 != null ? v0Var2.hashCode() : 0);
    }
}
