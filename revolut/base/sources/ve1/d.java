package ve1;

import jki.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288104b;

    public d() {
        this(0);
    }

    public static d a(d dVar, String name, String rateString, int i) {
        if ((i & 1) != 0) {
            name = dVar.f288103a;
        }
        if ((i & 2) != 0) {
            rateString = dVar.f288104b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rateString, "rateString");
        return new d(name, rateString);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f288103a, dVar.f288103a) && Intrinsics.f(this.f288104b, dVar.f288104b);
    }

    public final int hashCode() {
        return this.f288104b.hashCode() + (this.f288103a.hashCode() * 31);
    }

    public d(String name, String rateString) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rateString, "rateString");
        this.f288103a = name;
        this.f288104b = rateString;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i) {
        this("", "");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
    }
}
