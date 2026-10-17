package k6d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181697c;

    public j(String email, String url2, String name) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter("", "phone");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f181695a = email;
        this.f181696b = url2;
        this.f181697c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f181695a, jVar.f181695a) && this.f181696b.equals(jVar.f181696b) && Intrinsics.f(this.f181697c, jVar.f181697c);
    }

    public final int hashCode() {
        return this.f181697c.hashCode() + p.a.c(this.f181695a.hashCode() * 961, 31, this.f181696b);
    }
}
