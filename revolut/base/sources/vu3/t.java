package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292247c;

    public t(String str, String title, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f292245a = str;
        this.f292246b = title;
        this.f292247c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f292245a, tVar.f292245a) && Intrinsics.f(this.f292246b, tVar.f292246b) && Intrinsics.f(this.f292247c, tVar.f292247c);
    }

    public final int hashCode() {
        String str = this.f292245a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f292246b);
        String str2 = this.f292247c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
