package eg;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f125432c;
    public final boolean d;

    public f0(String processName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f125430a = processName;
        this.f125431b = i;
        this.f125432c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f125430a, f0Var.f125430a) && this.f125431b == f0Var.f125431b && this.f125432c == f0Var.f125432c && this.d == f0Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iB = j6.a.b(this.f125432c, j6.a.b(this.f125431b, this.f125430a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        ?? r110 = z;
        if (z) {
            r110 = 1;
        }
        return iB + r110;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ProcessDetails(processName=");
        sb6.append(this.f125430a);
        sb6.append(", pid=");
        sb6.append(this.f125431b);
        sb6.append(", importance=");
        sb6.append(this.f125432c);
        sb6.append(", isDefaultProcess=");
        return j6.a.x(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
