package xfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.g f305223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f305224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f305225c;
    public final n d;

    public o(do3.g salariedUserState, boolean z, boolean z3, n nVar) {
        Intrinsics.checkNotNullParameter(salariedUserState, "salariedUserState");
        this.f305223a = salariedUserState;
        this.f305224b = z;
        this.f305225c = z3;
        this.d = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f305223a == oVar.f305223a && this.f305224b == oVar.f305224b && this.f305225c == oVar.f305225c && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f305223a.hashCode() * 31, 31, this.f305224b), 31, this.f305225c);
        n nVar = this.d;
        return iC + (nVar == null ? 0 : nVar.hashCode());
    }
}
