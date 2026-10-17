package ii4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f161544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f161546c;
    public final long d;

    public q(r statusResult, int i, long j2, long j3) {
        Intrinsics.checkNotNullParameter(statusResult, "statusResult");
        this.f161544a = statusResult;
        this.f161545b = i;
        this.f161546c = j2;
        this.d = j3;
    }

    public static q a(q qVar, r rVar, int i, long j2, long j3, int i2) {
        if ((i2 & 1) != 0) {
            rVar = qVar.f161544a;
        }
        r statusResult = rVar;
        if ((i2 & 2) != 0) {
            i = qVar.f161545b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = qVar.f161546c;
        }
        long j5 = j2;
        if ((i2 & 8) != 0) {
            j3 = qVar.d;
        }
        Intrinsics.checkNotNullParameter(statusResult, "statusResult");
        return new q(statusResult, i3, j5, j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f161544a, qVar.f161544a) && this.f161545b == qVar.f161545b && this.f161546c == qVar.f161546c && this.d == qVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + a0.d.c(j6.a.b(this.f161545b, this.f161544a.hashCode() * 31, 31), 31, this.f161546c);
    }
}
