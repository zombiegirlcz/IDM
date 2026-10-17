package ix0;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f169283c;
    public final WeakReference d;

    public q1(long j2, Object obj2, o1 priority, WeakReference context) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f169281a = j2;
        this.f169282b = obj2;
        this.f169283c = priority;
        this.d = context;
    }

    public final o1 a() {
        return this.f169283c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return this.f169281a == q1Var.f169281a && Intrinsics.f(this.f169282b, q1Var.f169282b) && this.f169283c == q1Var.f169283c && Intrinsics.f(this.d, q1Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f169281a) * 31;
        Object obj2 = this.f169282b;
        return this.d.hashCode() + ((this.f169283c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31);
    }
}
