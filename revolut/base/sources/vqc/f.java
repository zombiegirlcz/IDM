package vqc;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291373b;

    public f() {
        this(0);
    }

    public static f a(f fVar, String employerName, String cnpj, int i) {
        if ((i & 1) != 0) {
            employerName = fVar.f291372a;
        }
        if ((i & 2) != 0) {
            cnpj = fVar.f291373b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(cnpj, "cnpj");
        return new f(employerName, cnpj);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f291372a, fVar.f291372a) && Intrinsics.f(this.f291373b, fVar.f291373b);
    }

    public final int hashCode() {
        return this.f291373b.hashCode() + (this.f291372a.hashCode() * 31);
    }

    public f(String employerName, String cnpj) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(cnpj, "cnpj");
        this.f291372a = employerName;
        this.f291373b = cnpj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i) {
        this("", "");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
    }
}
