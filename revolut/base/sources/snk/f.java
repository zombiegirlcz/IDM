package snk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f264635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264636c;

    public f() {
        this("", false, true);
    }

    public static f a(f fVar, String email, boolean z, int i) {
        if ((i & 1) != 0) {
            email = fVar.f264634a;
        }
        if ((i & 2) != 0) {
            z = fVar.f264635b;
        }
        boolean z3 = (i & 4) != 0 ? fVar.f264636c : true;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        return new f(email, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f264634a, fVar.f264634a) && this.f264635b == fVar.f264635b && this.f264636c == fVar.f264636c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264636c) + j6.a.c(this.f264634a.hashCode() * 31, 31, this.f264635b);
    }

    public f(String email, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f264634a = email;
        this.f264635b = z;
        this.f264636c = z3;
    }
}
