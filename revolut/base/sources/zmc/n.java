package zmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f323457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f323458c;

    public n(String id10, int i, l action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f323456a = id10;
        this.f323457b = i;
        this.f323458c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f323456a, nVar.f323456a) && this.f323457b == nVar.f323457b && Intrinsics.f(this.f323458c, nVar.f323458c);
    }

    public final int hashCode() {
        return this.f323458c.hashCode() + j6.a.b(this.f323457b, this.f323456a.hashCode() * 31, 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String id10, int i, String url2) {
        this(id10, i, new k(url2));
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(url2, "url");
    }
}
