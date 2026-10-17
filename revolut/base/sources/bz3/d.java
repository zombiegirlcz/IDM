package bz3;

import dx4.a1;
import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f19916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f19917c;

    public d(String text, a1 a1Var, l0 info) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f19915a = text;
        this.f19916b = a1Var;
        this.f19917c = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f19915a, dVar.f19915a) && this.f19916b == dVar.f19916b && Intrinsics.f(this.f19917c, dVar.f19917c);
    }

    public final int hashCode() {
        int iHashCode = this.f19915a.hashCode() * 31;
        a1 a1Var = this.f19916b;
        return this.f19917c.hashCode() + ((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31);
    }
}
