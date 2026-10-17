package rpb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f256321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f256322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f256323c;

    public i(dj0.d weeklyDepositAmount, long j2, ArrayList checkpoints) {
        Intrinsics.checkNotNullParameter(weeklyDepositAmount, "weeklyDepositAmount");
        Intrinsics.checkNotNullParameter(checkpoints, "checkpoints");
        this.f256321a = weeklyDepositAmount;
        this.f256322b = j2;
        this.f256323c = checkpoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f256321a, iVar.f256321a) && this.f256322b == iVar.f256322b && this.f256323c.equals(iVar.f256323c);
    }

    public final int hashCode() {
        return this.f256323c.hashCode() + a0.d.c(this.f256321a.hashCode() * 31, 31, this.f256322b);
    }
}
