package ami;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xii.b f6452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lg0.e f6454c;

    public k(xii.b gateway, String template, lg0.e navigationDeeplink) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(navigationDeeplink, "navigationDeeplink");
        this.f6452a = gateway;
        this.f6453b = template;
        this.f6454c = navigationDeeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f6452a, kVar.f6452a) && Intrinsics.f(this.f6453b, kVar.f6453b) && Intrinsics.f(this.f6454c, kVar.f6454c);
    }

    public final int hashCode() {
        return this.f6454c.hashCode() + p.a.c(this.f6452a.hashCode() * 31, 31, this.f6453b);
    }
}
