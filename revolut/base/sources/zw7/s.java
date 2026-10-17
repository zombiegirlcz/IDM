package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325851c;
    public final String d;

    public s(String name, String phone, String email, String claimsUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(claimsUrl, "claimsUrl");
        this.f325849a = name;
        this.f325850b = phone;
        this.f325851c = email;
        this.d = claimsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f325849a, sVar.f325849a) && Intrinsics.f(this.f325850b, sVar.f325850b) && Intrinsics.f(this.f325851c, sVar.f325851c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f325849a.hashCode() * 31, 31, this.f325850b), 31, this.f325851c);
    }
}
