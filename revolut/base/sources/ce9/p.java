package ce9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f23438c;
    public final boolean d;
    public final Throwable e;
    public final o f;

    /* JADX WARN: Illegal instructions before constructor call */
    public p() {
        o oVar = null;
        this(oVar, oVar, 63);
    }

    public static p a(p pVar, Object obj2, boolean z, Throwable th10, boolean z3, Throwable th11, o oVar, int i) {
        if ((i & 1) != 0) {
            obj2 = pVar.f23436a;
        }
        Object obj3 = obj2;
        if ((i & 2) != 0) {
            z = pVar.f23437b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            th10 = pVar.f23438c;
        }
        Throwable th12 = th10;
        if ((i & 8) != 0) {
            z3 = pVar.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            th11 = pVar.e;
        }
        Throwable th13 = th11;
        if ((i & 32) != 0) {
            oVar = pVar.f;
        }
        pVar.getClass();
        return new p(obj3, z4, th12, z6, th13, oVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f23436a, pVar.f23436a) && this.f23437b == pVar.f23437b && Intrinsics.f(this.f23438c, pVar.f23438c) && this.d == pVar.d && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        Object obj2 = this.f23436a;
        int iC = j6.a.c((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, this.f23437b);
        Throwable th10 = this.f23438c;
        int iC2 = j6.a.c((iC + (th10 == null ? 0 : th10.hashCode())) * 31, 31, this.d);
        Throwable th11 = this.e;
        int iHashCode = (iC2 + (th11 == null ? 0 : th11.hashCode())) * 31;
        o oVar = this.f;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public /* synthetic */ p(Object obj2, o oVar, int i) {
        this((i & 1) != 0 ? null : obj2, (i & 2) == 0, null, false, null, (i & 32) != 0 ? null : oVar);
    }

    public p(Object obj2, boolean z, Throwable th10, boolean z3, Throwable th11, o oVar) {
        this.f23436a = obj2;
        this.f23437b = z;
        this.f23438c = th10;
        this.d = z3;
        this.e = th11;
        this.f = oVar;
    }
}
