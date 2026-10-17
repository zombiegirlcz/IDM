package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f209973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f209974b;

    public r1(k2 model, q1 reason) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f209973a = model;
        this.f209974b = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f209973a, r1Var.f209973a) && this.f209974b == r1Var.f209974b;
    }

    public final int hashCode() {
        return this.f209974b.hashCode() + (this.f209973a.hashCode() * 31);
    }
}
