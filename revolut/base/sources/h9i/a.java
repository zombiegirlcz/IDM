package h9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150328b;

    public a(String url2, String id10) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f150327a = url2;
        this.f150328b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150327a, aVar.f150327a) && Intrinsics.f(this.f150328b, aVar.f150328b);
    }

    @Override // h9i.c
    public final String getUrl() {
        return this.f150327a;
    }

    public final int hashCode() {
        return this.f150328b.hashCode() + (this.f150327a.hashCode() * 31);
    }
}
