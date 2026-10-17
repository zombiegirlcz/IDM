package vu3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f292240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292241b;

    public r(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f292240a = a1Var;
        this.f292241b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f292240a == rVar.f292240a && Intrinsics.f(this.f292241b, rVar.f292241b);
    }

    public final int hashCode() {
        a1 a1Var = this.f292240a;
        return this.f292241b.hashCode() + ((a1Var == null ? 0 : a1Var.hashCode()) * 31);
    }
}
