package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215984c;

    public o1(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f215982a = id10;
        this.f215983b = name;
        this.f215984c = str;
    }

    public final String a() {
        return this.f215984c;
    }

    public final String b() {
        return this.f215982a;
    }

    public final String c() {
        return this.f215983b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f215982a, o1Var.f215982a) && Intrinsics.f(this.f215983b, o1Var.f215983b) && Intrinsics.f(this.f215984c, o1Var.f215984c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f215982a.hashCode() * 31, 31, this.f215983b);
        String str = this.f215984c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
