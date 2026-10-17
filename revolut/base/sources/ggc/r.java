package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143662c;

    public r(String id10, int i, String imageUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f143660a = id10;
        this.f143661b = i;
        this.f143662c = imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f143660a, rVar.f143660a) && this.f143661b == rVar.f143661b && Intrinsics.f(this.f143662c, rVar.f143662c);
    }

    public final int hashCode() {
        return p.a.c(j6.a.b(this.f143661b, this.f143660a.hashCode() * 31, 31), 31, this.f143662c);
    }
}
