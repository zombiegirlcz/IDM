package zz0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f326473c;

    public a(String name, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f326471a = name;
        this.f326472b = z;
        this.f326473c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f326471a, aVar.f326471a) && this.f326472b == aVar.f326472b && this.f326473c == aVar.f326473c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f326473c) + j6.a.c(this.f326471a.hashCode() * 31, 31, this.f326472b);
    }
}
