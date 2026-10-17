package r5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251563c;

    public d(String title, String str, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f251561a = title;
        this.f251562b = str;
        this.f251563c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f251561a, dVar.f251561a) && Intrinsics.f(this.f251562b, dVar.f251562b) && Intrinsics.f(this.f251563c, dVar.f251563c);
    }

    public final int hashCode() {
        int iHashCode = this.f251561a.hashCode() * 31;
        String str = this.f251562b;
        return this.f251563c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
