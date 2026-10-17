package jvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qtc.t f178805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178806c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f178807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l71.d f178808h;

    public a() {
        this(false, qtc.l.f249085a, false, true, false, false, false, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f178804a == aVar.f178804a && Intrinsics.f(this.f178805b, aVar.f178805b) && this.f178806c == aVar.f178806c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f178807g == aVar.f178807g && Intrinsics.f(this.f178808h, aVar.f178808h);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f178805b.hashCode() + (Boolean.hashCode(this.f178804a) * 31)) * 31, 31, this.f178806c), 31, this.d), 31, this.e), 31, this.f), 31, this.f178807g);
        l71.d dVar = this.f178808h;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    public a(boolean z, qtc.t wealthProtectionState, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, l71.d dVar) {
        Intrinsics.checkNotNullParameter(wealthProtectionState, "wealthProtectionState");
        this.f178804a = z;
        this.f178805b = wealthProtectionState;
        this.f178806c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f178807g = z12;
        this.f178808h = dVar;
    }
}
