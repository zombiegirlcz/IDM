package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321984c;

    public n(String id10, String name, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321982a = id10;
        this.f321983b = name;
        this.f321984c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f321982a, nVar.f321982a) && Intrinsics.f(this.f321983b, nVar.f321983b) && Intrinsics.f(this.f321984c, nVar.f321984c);
    }

    public final int hashCode() {
        return this.f321984c.hashCode() + p.a.c(this.f321982a.hashCode() * 31, 31, this.f321983b);
    }
}
