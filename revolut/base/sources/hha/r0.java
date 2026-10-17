package hha;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f152338c;

    public r0(String planId, ArrayList suggestedFeatures, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(suggestedFeatures, "suggestedFeatures");
        this.f152336a = planId;
        this.f152337b = z;
        this.f152338c = suggestedFeatures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f152336a, r0Var.f152336a) && this.f152337b == r0Var.f152337b && this.f152338c.equals(r0Var.f152338c);
    }

    public final int hashCode() {
        return this.f152338c.hashCode() + j6.a.c(this.f152336a.hashCode() * 31, 31, this.f152337b);
    }
}
