package h9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150330b;

    public b(String url2, String id10) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f150329a = url2;
        this.f150330b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f150329a, bVar.f150329a) && Intrinsics.f(this.f150330b, bVar.f150330b);
    }

    @Override // h9i.c
    public final String getUrl() {
        return this.f150329a;
    }

    public final int hashCode() {
        return this.f150330b.hashCode() + (this.f150329a.hashCode() * 31);
    }
}
