package ht3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f155300b;

    public p(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f155299a = text;
        this.f155300b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f155299a, pVar.f155299a) && this.f155300b == pVar.f155300b;
    }

    public final int hashCode() {
        int iHashCode = this.f155299a.hashCode() * 31;
        a1 a1Var = this.f155300b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
