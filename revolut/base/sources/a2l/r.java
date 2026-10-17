package a2l;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f924c;
    public final w0 d;

    public r(s action, String str, String label, w0 w0Var) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f922a = action;
        this.f923b = str;
        this.f924c = label;
        this.d = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f922a == rVar.f922a && Intrinsics.f(this.f923b, rVar.f923b) && Intrinsics.f(this.f924c, rVar.f924c) && this.d == rVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f922a.hashCode() * 31;
        String str = this.f923b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f924c);
        w0 w0Var = this.d;
        return iC + (w0Var != null ? w0Var.hashCode() : 0);
    }
}
