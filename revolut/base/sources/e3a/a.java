package e3a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122247c;
    public final String d;

    public a(String id10, String username, String code, String fullName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f122245a = id10;
        this.f122246b = username;
        this.f122247c = code;
        this.d = fullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f122245a, aVar.f122245a) && Intrinsics.f(this.f122246b, aVar.f122246b) && Intrinsics.f(this.f122247c, aVar.f122247c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f122245a.hashCode() * 31, 31, this.f122246b), 31, this.f122247c);
    }
}
