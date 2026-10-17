package kq8;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188336c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final do3.c f188337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f188338h;

    public b(do3.c type, w0 w0Var, String id10, String firstName, String lastName, String code, String username, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f188334a = id10;
        this.f188335b = firstName;
        this.f188336c = lastName;
        this.d = code;
        this.e = username;
        this.f = z;
        this.f188337g = type;
        this.f188338h = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f188334a, bVar.f188334a) && Intrinsics.f(this.f188335b, bVar.f188335b) && Intrinsics.f(this.f188336c, bVar.f188336c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && this.f188337g == bVar.f188337g && this.f188338h == bVar.f188338h;
    }

    public final int hashCode() {
        int iHashCode = (this.f188337g.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f188334a.hashCode() * 31, 31, this.f188335b), 31, this.f188336c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        w0 w0Var = this.f188338h;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }
}
