package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110372b;

    public a(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f110371a = title;
        this.f110372b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f110371a, aVar.f110371a) && Intrinsics.f(this.f110372b, aVar.f110372b);
    }

    public final int hashCode() {
        return this.f110372b.hashCode() + (this.f110371a.hashCode() * 31);
    }
}
