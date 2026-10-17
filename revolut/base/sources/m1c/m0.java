package m1c;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f201408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f201409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f201410c;

    public m0(ArrayList active, ArrayList completed, List preEnrolled) {
        Intrinsics.checkNotNullParameter(active, "active");
        Intrinsics.checkNotNullParameter(completed, "completed");
        Intrinsics.checkNotNullParameter(preEnrolled, "preEnrolled");
        this.f201408a = active;
        this.f201409b = completed;
        this.f201410c = preEnrolled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f201408a.equals(m0Var.f201408a) && this.f201409b.equals(m0Var.f201409b) && Intrinsics.f(this.f201410c, m0Var.f201410c);
    }

    public final int hashCode() {
        return this.f201410c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f201409b, this.f201408a.hashCode() * 31, 31);
    }
}
