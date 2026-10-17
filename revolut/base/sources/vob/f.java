package vob;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f290935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f290936b;

    public f(dj0.d demoAmount, ArrayList gainedAmountWithPlan) {
        Intrinsics.checkNotNullParameter(gainedAmountWithPlan, "gainedAmountWithPlan");
        Intrinsics.checkNotNullParameter(demoAmount, "demoAmount");
        this.f290935a = gainedAmountWithPlan;
        this.f290936b = demoAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f290935a.equals(fVar.f290935a) && this.f290936b.equals(fVar.f290936b);
    }

    public final int hashCode() {
        return this.f290936b.hashCode() + (this.f290935a.hashCode() * 31);
    }
}
