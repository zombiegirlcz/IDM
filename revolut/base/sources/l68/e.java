package l68;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192363c;
    public final String d;
    public final boolean e;

    public e(String initialFirstName, String initialLastName, String firstName, String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(initialFirstName, "initialFirstName");
        Intrinsics.checkNotNullParameter(initialLastName, "initialLastName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f192361a = initialFirstName;
        this.f192362b = initialLastName;
        this.f192363c = firstName;
        this.d = lastName;
        this.e = z;
    }

    public static e a(e eVar, String str, String str2, int i) {
        String initialFirstName = eVar.f192361a;
        String initialLastName = eVar.f192362b;
        if ((i & 4) != 0) {
            str = eVar.f192363c;
        }
        String firstName = str;
        if ((i & 8) != 0) {
            str2 = eVar.d;
        }
        String lastName = str2;
        boolean z = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(initialFirstName, "initialFirstName");
        Intrinsics.checkNotNullParameter(initialLastName, "initialLastName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new e(initialFirstName, initialLastName, firstName, lastName, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f192361a, eVar.f192361a) && Intrinsics.f(this.f192362b, eVar.f192362b) && Intrinsics.f(this.f192363c, eVar.f192363c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f192361a.hashCode() * 31, 31, this.f192362b), 31, this.f192363c), 31, this.d);
    }
}
