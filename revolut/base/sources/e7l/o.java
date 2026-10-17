package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123421b;

    public o(String key, String link) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f123420a = key;
        this.f123421b = link;
    }

    @Override // e7l.t
    public final String a() {
        return this.f123420a;
    }

    @Override // e7l.t
    public final String b() {
        return this.f123421b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f123420a, oVar.f123420a) && Intrinsics.f(this.f123421b, oVar.f123421b);
    }

    public final int hashCode() {
        return this.f123421b.hashCode() + (this.f123420a.hashCode() * 31);
    }
}
