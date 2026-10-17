package uya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284120c;

    public a(String title, String subtitle, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f284118a = title;
        this.f284119b = subtitle;
        this.f284120c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f284118a, aVar.f284118a) && Intrinsics.f(this.f284119b, aVar.f284119b) && Intrinsics.f(this.f284120c, aVar.f284120c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f284118a.hashCode() * 31, 31, this.f284119b);
        String str = this.f284120c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
