package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292202b;

    public a(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f292201a = title;
        this.f292202b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f292201a, aVar.f292201a) && Intrinsics.f(this.f292202b, aVar.f292202b);
    }

    public final int hashCode() {
        return this.f292202b.hashCode() + (this.f292201a.hashCode() * 31);
    }
}
