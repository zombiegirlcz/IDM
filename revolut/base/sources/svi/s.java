package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265983c;

    public s(String str, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f265981a = str;
        this.f265982b = firstName;
        this.f265983c = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f265981a, sVar.f265981a) && Intrinsics.f(this.f265982b, sVar.f265982b) && Intrinsics.f(this.f265983c, sVar.f265983c);
    }

    public final int hashCode() {
        String str = this.f265981a;
        return this.f265983c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f265982b);
    }
}
