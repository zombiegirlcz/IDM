package mgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205239b;

    public g(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f205238a = title;
        this.f205239b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205238a, gVar.f205238a) && Intrinsics.f(this.f205239b, gVar.f205239b);
    }

    public final int hashCode() {
        return this.f205239b.hashCode() + (this.f205238a.hashCode() * 31);
    }
}
