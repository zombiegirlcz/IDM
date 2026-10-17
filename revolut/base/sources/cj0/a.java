package cj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24569c;

    public a(String title, String deeplink, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f24567a = title;
        this.f24568b = deeplink;
        this.f24569c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24567a, aVar.f24567a) && Intrinsics.f(this.f24568b, aVar.f24568b) && Intrinsics.f(this.f24569c, aVar.f24569c);
    }

    public final int hashCode() {
        return this.f24569c.hashCode() + p.a.c(this.f24567a.hashCode() * 31, 31, this.f24568b);
    }
}
