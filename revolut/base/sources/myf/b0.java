package myf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210465b;

    public b0(String name, String reference) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f210464a = name;
        this.f210465b = reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f210464a, b0Var.f210464a) && Intrinsics.f(this.f210465b, b0Var.f210465b);
    }

    public final int hashCode() {
        return this.f210465b.hashCode() + (this.f210464a.hashCode() * 31);
    }
}
