package ebi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f124368c;

    public d() {
        this(0);
    }

    public static d a(d dVar, String code, int i) {
        if ((i & 1) != 0) {
            code = dVar.f124366a;
        }
        boolean z = (i & 2) != 0 ? dVar.f124367b : false;
        boolean z3 = (i & 4) != 0 ? dVar.f124368c : true;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        return new d(code, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f124366a, dVar.f124366a) && this.f124367b == dVar.f124367b && this.f124368c == dVar.f124368c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124368c) + j6.a.c(this.f124366a.hashCode() * 31, 31, this.f124367b);
    }

    public d(String code, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f124366a = code;
        this.f124367b = z;
        this.f124368c = z3;
    }

    public /* synthetic */ d(int i) {
        this("", false, false);
    }
}
