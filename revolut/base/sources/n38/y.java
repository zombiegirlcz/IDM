package n38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211969c;
    public final String d;
    public final String e;

    public y(String id10, String legalName, String firstName, String lastName, String code) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f211967a = id10;
        this.f211968b = legalName;
        this.f211969c = firstName;
        this.d = lastName;
        this.e = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f211967a, yVar.f211967a) && Intrinsics.f(this.f211968b, yVar.f211968b) && Intrinsics.f(this.f211969c, yVar.f211969c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f211967a.hashCode() * 31, 31, this.f211968b), 31, this.f211969c), 31, this.d);
    }
}
