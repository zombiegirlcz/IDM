package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143781c;

    public t(String icon, String title, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143779a = icon;
        this.f143780b = title;
        this.f143781c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f143779a, tVar.f143779a) && Intrinsics.f(this.f143780b, tVar.f143780b) && Intrinsics.f(this.f143781c, tVar.f143781c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f143779a.hashCode() * 31, 31, this.f143780b);
        String str = this.f143781c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
