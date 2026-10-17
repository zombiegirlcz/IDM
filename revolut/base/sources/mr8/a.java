package mr8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f208072c;

    public a(String id10, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f208070a = id10;
        this.f208071b = firstName;
        this.f208072c = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f208070a, aVar.f208070a) && Intrinsics.f(this.f208071b, aVar.f208071b) && Intrinsics.f(this.f208072c, aVar.f208072c);
    }

    public final int hashCode() {
        return this.f208072c.hashCode() + p.a.c(this.f208070a.hashCode() * 31, 31, this.f208071b);
    }
}
