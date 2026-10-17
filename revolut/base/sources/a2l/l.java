package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f914c;

    public l(int i, String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f912a = i;
        this.f913b = title;
        this.f914c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f912a == lVar.f912a && Intrinsics.f(this.f913b, lVar.f913b) && Intrinsics.f(this.f914c, lVar.f914c);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f912a) * 31, 31, this.f913b);
        String str = this.f914c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
