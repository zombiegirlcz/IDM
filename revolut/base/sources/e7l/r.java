package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123427b;

    public r(String key, String link) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f123426a = key;
        this.f123427b = link;
    }

    @Override // e7l.t
    public final String a() {
        return this.f123426a;
    }

    @Override // e7l.t
    public final String b() {
        return this.f123427b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f123426a, rVar.f123426a) && Intrinsics.f(this.f123427b, rVar.f123427b);
    }

    public final int hashCode() {
        return this.f123427b.hashCode() + (this.f123426a.hashCode() * 31);
    }
}
