package m79;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203352b;

    public b(String title, String deepLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f203351a = title;
        this.f203352b = deepLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f203351a, bVar.f203351a) && Intrinsics.f(this.f203352b, bVar.f203352b);
    }

    public final int hashCode() {
        return this.f203352b.hashCode() + (this.f203351a.hashCode() * 31);
    }
}
