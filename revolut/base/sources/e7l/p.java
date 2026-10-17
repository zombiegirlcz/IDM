package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123423b;

    public p(String key, String link) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f123422a = key;
        this.f123423b = link;
    }

    @Override // e7l.t
    public final String a() {
        return this.f123422a;
    }

    @Override // e7l.t
    public final String b() {
        return this.f123423b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f123422a, pVar.f123422a) && Intrinsics.f(this.f123423b, pVar.f123423b);
    }

    public final int hashCode() {
        return this.f123423b.hashCode() + (this.f123422a.hashCode() * 31);
    }
}
