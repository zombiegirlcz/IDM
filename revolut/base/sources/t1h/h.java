package t1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f267356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f267357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f267358c;

    public h(int i, dj0.d minimumAmountToWithdraw, boolean z) {
        boolean z3 = (i & 4) == 0;
        Intrinsics.checkNotNullParameter(minimumAmountToWithdraw, "minimumAmountToWithdraw");
        this.f267356a = minimumAmountToWithdraw;
        this.f267357b = z;
        this.f267358c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f267356a.equals(hVar.f267356a) && this.f267357b == hVar.f267357b && this.f267358c == hVar.f267358c;
    }

    public final int hashCode() {
        return j6.a.c(j6.a.c(this.f267356a.hashCode() * 31, 31, this.f267357b), 31, this.f267358c);
    }
}
