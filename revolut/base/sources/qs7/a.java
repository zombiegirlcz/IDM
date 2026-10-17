package qs7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248754b;

    public a(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f248753a = title;
        this.f248754b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f248753a, aVar.f248753a) && Intrinsics.f(this.f248754b, aVar.f248754b);
    }

    public final int hashCode() {
        int iHashCode = this.f248753a.hashCode() * 31;
        String str = this.f248754b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
