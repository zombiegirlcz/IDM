package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123429b;

    public s(String key, String link) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f123428a = key;
        this.f123429b = link;
    }

    @Override // e7l.t
    public final String a() {
        return this.f123428a;
    }

    @Override // e7l.t
    public final String b() {
        return this.f123429b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f123428a, sVar.f123428a) && Intrinsics.f(this.f123429b, sVar.f123429b);
    }

    public final int hashCode() {
        return this.f123429b.hashCode() + (this.f123428a.hashCode() * 31);
    }
}
