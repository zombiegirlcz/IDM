package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123425b;

    public q(String key, String link) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f123424a = key;
        this.f123425b = link;
    }

    @Override // e7l.t
    public final String a() {
        return this.f123424a;
    }

    @Override // e7l.t
    public final String b() {
        return this.f123425b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f123424a, qVar.f123424a) && Intrinsics.f(this.f123425b, qVar.f123425b);
    }

    public final int hashCode() {
        return this.f123425b.hashCode() + (this.f123424a.hashCode() * 31);
    }
}
