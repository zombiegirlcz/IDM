package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110378c;
    public final String d;

    public c(String id10, String title, String asset, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f110376a = id10;
        this.f110377b = title;
        this.f110378c = asset;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f110376a, cVar.f110376a) && Intrinsics.f(this.f110377b, cVar.f110377b) && Intrinsics.f(this.f110378c, cVar.f110378c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f110376a.hashCode() * 31, 31, this.f110377b), 31, this.f110378c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
