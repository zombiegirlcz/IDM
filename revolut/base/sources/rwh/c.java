package rwh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257953b;

    public c(String id10, String deeplink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f257952a = id10;
        this.f257953b = deeplink;
    }

    public final String a() {
        return this.f257953b;
    }

    public final String b() {
        return this.f257952a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f257952a, cVar.f257952a) && Intrinsics.f(this.f257953b, cVar.f257953b);
    }

    public final int hashCode() {
        return this.f257953b.hashCode() + (this.f257952a.hashCode() * 31);
    }
}
