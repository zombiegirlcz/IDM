package n38;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f211938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f211939c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f211940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f211941h;
    public final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f211942j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f211943l;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(java.lang.String r2, n38.u r3, n38.u r4, java.lang.String r5, boolean r6, boolean r7, n38.t r8, boolean r9, n38.v r10, java.lang.String r11, long r12) {
        /*
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "currentUser"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "otherUser"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "otherUserDisplayedName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r1.<init>()
            r1.f211937a = r2
            r1.f211938b = r3
            r1.f211939c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.f211940g = r8
            r1.f211941h = r9
            r1.i = r10
            r1.f211942j = r11
            r1.k = r12
            if (r11 != 0) goto L44
            n38.t r2 = n38.t.ACCEPTED
            if (r8 != r2) goto L44
            n38.w r2 = r3.f211961c
            n38.w r3 = n38.w.ACCEPTED
            if (r2 != r3) goto L44
            n38.w r2 = r4.f211961c
            if (r2 != r3) goto L44
            r2 = 1
            goto L45
        L44:
            r2 = 0
        L45:
            r1.f211943l = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n38.d0.<init>(java.lang.String, n38.u, n38.u, java.lang.String, boolean, boolean, n38.t, boolean, n38.v, java.lang.String, long):void");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f211937a, d0Var.f211937a) && Intrinsics.f(this.f211938b, d0Var.f211938b) && Intrinsics.f(this.f211939c, d0Var.f211939c) && Intrinsics.f(this.d, d0Var.d) && this.e == d0Var.e && this.f == d0Var.f && this.f211940g == d0Var.f211940g && this.f211941h == d0Var.f211941h && Intrinsics.f(this.i, d0Var.i) && Intrinsics.f(this.f211942j, d0Var.f211942j) && this.k == d0Var.k;
    }

    public final String getId() {
        return this.f211937a;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f211940g.hashCode() + j6.a.c(j6.a.c(p.a.c((this.f211939c.hashCode() + ((this.f211938b.hashCode() + (this.f211937a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.f211941h);
        v vVar = this.i;
        int iHashCode = (iC + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str = this.f211942j;
        return Long.hashCode(this.k) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
