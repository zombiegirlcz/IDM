package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f110375c;

    public b(String title, String backgroundAsset, a action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundAsset, "backgroundAsset");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f110373a = title;
        this.f110374b = backgroundAsset;
        this.f110375c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110373a, bVar.f110373a) && Intrinsics.f(this.f110374b, bVar.f110374b) && Intrinsics.f(this.f110375c, bVar.f110375c);
    }

    public final int hashCode() {
        return this.f110375c.hashCode() + p.a.c(this.f110373a.hashCode() * 31, 31, this.f110374b);
    }
}
