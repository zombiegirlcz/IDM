package rgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f254067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f254068c;

    public a(String id10, int i, String imageUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f254066a = id10;
        this.f254067b = i;
        this.f254068c = imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f254066a, aVar.f254066a) && this.f254067b == aVar.f254067b && Intrinsics.f(this.f254068c, aVar.f254068c);
    }

    public final int hashCode() {
        return this.f254068c.hashCode() + j6.a.b(this.f254067b, this.f254066a.hashCode() * 31, 31);
    }
}
