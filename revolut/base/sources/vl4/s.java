package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f290287c;
    public final int d;
    public final String e;
    public final String f;

    public s(int i, String header, String mainText, String str, String badge, String str2) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f290285a = header;
        this.f290286b = mainText;
        this.f290287c = str;
        this.d = i;
        this.e = badge;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f290285a, sVar.f290285a) && Intrinsics.f(this.f290286b, sVar.f290286b) && Intrinsics.f(this.f290287c, sVar.f290287c) && this.d == sVar.d && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f290285a.hashCode() * 31, 31, this.f290286b);
        String str = this.f290287c;
        int iC2 = p.a.c(j6.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e);
        String str2 = this.f;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
